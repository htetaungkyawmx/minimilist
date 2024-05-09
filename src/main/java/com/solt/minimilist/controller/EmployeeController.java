package com.solt.minimilist.controller;

import com.solt.minimilist.dto.EmployeeSaveDTO;
import com.solt.minimilist.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public String saveEmployee(@RequestBody EmployeeSaveDTO employeeSaveDTO) {
        String id = employeeService.addEmployee(employeeSaveDTO);
        return id;
    }
}
