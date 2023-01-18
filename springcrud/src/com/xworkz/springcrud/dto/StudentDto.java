package com.xworkz.springcrud.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
//@Data
@ToString
@NoArgsConstructor
public class StudentDto {
	@NonNull
	@NotNull(message = "Student name cannot be null")
	@Size(min = 3, max = 20, message = "Student name is invalid,should be more than 2")
	private String name;
	@NonNull
	@Min(value = 1, message = "id no should be greater than 1or less than 100")
	@Max(value = 100, message = "id no should be greater than 1 or less than 100")
	private int idNo;
	@NonNull
	@Min(value = 1, message = "age should be greater than 1or less than 100")
	@Max(value = 100, message = "age  should be greater than 1 or less than 100")
	private int age;

}
