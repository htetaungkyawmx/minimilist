package com.solt.minimilist.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data @Builder @ToString
public class EmployeeUpdateDTO {

    private Integer id;

    private String name;

    private String email;

    private String phoneNumber;
}
