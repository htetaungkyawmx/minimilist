package com.solt.minimilist.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data @Builder @ToString
public class EmployeeSaveDTO {

    private String employeename;

    private String employeeaddress;

    private String phoneNumber;
}
