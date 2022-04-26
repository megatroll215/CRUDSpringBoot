package com.tuan.crud.Entities;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class EmployeeDto implements Serializable {
    private final String name;
    private final Integer age;
    private final String phone;
    private final String address;
    private final LocalDate modifiedDate;
    private final LocalDate createdDate;
    private final Integer departmentId;
    private final Integer status;
    private final String role;
}
