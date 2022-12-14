package com.example.hamromistiri.Dto;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class CustomerSignupRequest {

    @NotEmpty(message = "FirstName cannot be null")
    private String firstName;

    @NotEmpty(message = "LastName cannot be null")
    private String lastName;

    @NotEmpty(message = "Email cannot be null")
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "pattern didn't matched for email")
    private String email;

    @NotEmpty(message = "Password cannot be null")
    private String password;

    private String role;

    @NotEmpty(message = "PhoneNo cannot be null")
    @Length(min = 10, max = 10, message = "Phone number needs to be of 10 digits")
    @Pattern(regexp = "^[1-9]+[0-9]*$" ,message = "Only number is allowed in phoneNo")
    private String phoneNo;

    @NotEmpty(message = "address cannot be empty")
    private String location;

    private Boolean isVerified;

    private String randomToken;


}
