package com.solt.minimilist.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity @ToString
@Data @Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "employee_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeid;

    @Column(name = "employee_name", length = 50)
    private String employeename;

    @Column(name = "employee_address", length = 50)
    private String employeeaddress;

    @Column(name = "employee_phoneNumber", length = 50)
    private String phoneNumber;

    public Employee(String employeename, String employeeaddress, String phoneNumber) {
        this.employeename = employeename;
        this.employeeaddress = employeeaddress;
        this.phoneNumber = phoneNumber;
    }
}
