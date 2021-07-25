package com.obdev.department.controller;

import com.obdev.department.entity.Department;
import com.obdev.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment of DepartmentController");
        return departmentService.addDepartment(department);
    }
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable int id){
        log.info("Inside findDepartment of DepartmentController");
        return departmentService.findDepartmentById(id);
    }
}
