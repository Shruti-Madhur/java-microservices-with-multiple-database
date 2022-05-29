package com.microservices.multiple.database.department.service.controller;

import com.microservices.multiple.database.department.service.entity.Department;
import com.microservices.multiple.database.department.service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    @Autowired private DepartmentService departmentService;

    @PostMapping("/")
    public Department createDepartment(@RequestBody Department department){
        
        return departmentService.saveDepartment(department);
    }

}
