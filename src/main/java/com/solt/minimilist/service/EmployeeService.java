package com.solt.minimilist.service;

import com.solt.minimilist.dto.EmployeeDTO;
import com.solt.minimilist.dto.EmployeeSaveDTO;
import com.solt.minimilist.dto.EmployeeUpdateDTO;

import java.util.List;

public interface EmployeeService {
    String addEmployee(EmployeeSaveDTO employeeSaveDTO);

    List<EmployeeDTO> getAllEmployee();

    String updateEmployee(EmployeeUpdateDTO employeeUpdateDTO);

    boolean deleteEmployee(int id);
}
