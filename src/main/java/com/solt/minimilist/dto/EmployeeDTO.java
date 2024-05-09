package com.solt.minimilist.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data @Builder @ToString
public class EmployeeDTO {

    private Integer employeeid;

    private String employeename;

    private String employeeaddress;

    private String phoneNumber;
}
