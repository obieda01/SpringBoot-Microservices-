package com.obdev.user.service;

import com.obdev.user.VO.Department;
import com.obdev.user.VO.ResponseTempleteVO;
import com.obdev.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.obdev.user.repository.UserRepository;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public ResponseTempleteVO getUserWithDepartment(int id) {
        ResponseTempleteVO vo = new ResponseTempleteVO();
        User user = userRepository.findById(id).orElse(null);
        Department department = restTemplate.getForObject("http://localhost:9001/departments/" + user.getDepartmentId(), Department.class);
        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }
}