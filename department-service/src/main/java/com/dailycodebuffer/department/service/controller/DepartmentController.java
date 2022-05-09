package com.dailycodebuffer.department.service.controller;

import com.dailycodebuffer.department.service.entity.Department;
import com.dailycodebuffer.department.service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department){
        log.info("inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId){
        log.info("inside getDepartmentById method of DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }

}
