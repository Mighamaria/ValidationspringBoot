package com.javatechie.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    @NotNull(message = "username shouldn't be null")
    private String name;
    @Email(message = "invalid email address")
    private String email;
    @Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
    private String mobile;
    private String gender;
    @Min(18)
    @Max(60)
    private int age;
    @NotBlank
    private String nationality;
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}
	public String getMobile() {
		// TODO Auto-generated method stub
		return mobile;
	}
	public String getGender() {
		// TODO Auto-generated method stub
		return gender;
	}
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}
	public String getNationality() {
		// TODO Auto-generated method stub
		return nationality;
	}

}
