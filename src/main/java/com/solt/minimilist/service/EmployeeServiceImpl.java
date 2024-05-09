package com.solt.minimilist.service;

import com.solt.minimilist.dto.EmployeeDTO;
import com.solt.minimilist.dto.EmployeeSaveDTO;
import com.solt.minimilist.dto.EmployeeUpdateDTO;
import com.solt.minimilist.entity.Employee;
import com.solt.minimilist.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public String addEmployee(EmployeeSaveDTO employeeSaveDTO) {

        Employee employee = new Employee(
                employeeSaveDTO.getName(),
                employeeSaveDTO.getEmail(),
                employeeSaveDTO.getPhoneNumber()
        );
        employeeRepo.save(employee);
        return employee.getName();
    }

    @Override
    public List<EmployeeDTO> getAllEmployee() {

        List<Employee> getEmployees = employeeRepo.findAll();
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();
        for(Employee e: getEmployees) {
            EmployeeDTO employeeDTO = new EmployeeDTO(
                    e.getId(),
                    e.getName(),
                    e.getEmail(),
                    e.getPhoneNumber()
            );
            employeeDTOList.add(employeeDTO);
        }
        return employeeDTOList;
    }

    @Override
    public String updateEmployee(EmployeeUpdateDTO employeeUpdateDTO) {
        if(employeeRepo.existsById(employeeUpdateDTO.getId()))
        {
            Employee employee = employeeRepo.getById(employeeUpdateDTO.getId());

            employee.setName(employeeUpdateDTO.getName());
            employee.setEmail(employeeUpdateDTO.getEmail());
            employee.setPhoneNumber(employeeUpdateDTO.getPhoneNumber());

            employeeRepo.save(employee);
        }
        else {
            System.out.println("Employee ID Not Found");
        }
        return null;
    }

    @Override
    public boolean deleteEmployee(int id) {

        if (employeeRepo.existsById(id)) {

            employeeRepo.deleteById(id);
        }
        else {
            System.out.println("Employee ID Not Found");
        }
        return true;
    }
}
