package com.becoder.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
	
	private Integer id;

	@NotBlank
	private String name;

	@NotEmpty
	@Size(min=3,max=30,message="Description must be in between 3 to 30")
	private String description;
	
	@NotNull
	private Double price;

	@NotNull
	private Integer quantity;
}
