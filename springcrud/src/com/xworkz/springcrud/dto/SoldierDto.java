package com.xworkz.springcrud.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SoldierDto extends AbstractAdultDto {
	@Min(0)
	@Max(1000000)
	private int id;
	@NotNull
	@NotBlank
	@Size(min = 3, max = 30 )
	private String name;
	@NotNull
	@NotBlank
	@Size(min = 5, max = 40)
	private String location;
	@NotNull
	@NotBlank
	@Size(min = 4, max = 35)
	private String ranks;

}
