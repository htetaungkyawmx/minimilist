package com.solt.minimilist.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data @Builder @ToString
public class EmployeeSaveDTO {

    private String name;

    private String email;

    private String phoneNumber;
}
