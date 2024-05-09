package com.solt.minimilist.service;

import com.solt.minimilist.dto.EmployeeSaveDTO;
import com.solt.minimilist.entity.Employee;
import com.solt.minimilist.repo.EmployeeRepo;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepo employeeRepo;

    @Override
    public String addEmployee(EmployeeSaveDTO employeeSaveDTO) {

        Employee employee = new Employee(
                employeeSaveDTO.getEmployeename(),
                employeeSaveDTO.getEmployeeaddress(),
                employeeSaveDTO.getPhoneNumber()
        );
        employeeRepo.save(employee);
        return employee.getEmployeename();
    }
}
