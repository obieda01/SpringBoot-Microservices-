package com.obdev.department.service;

import com.obdev.department.entity.Department;
import com.obdev.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getDepartments(){
        return departmentRepository.findAll();
    }
    public Department addDepartment(Department department){
        log.info("Inside addDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(int id) {
        log.info("Inside findDepartmentById of DepartmentService");
        return departmentRepository.findById(id).orElse(null);
    }
}
