package com.example.hamromistiri.Dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
public class CustomerDto {

    @Min(value=1, message="Id must be given for user")
    int id;

    @NotEmpty(message = "FirstName cannot be null")
    private String firstName;

}
