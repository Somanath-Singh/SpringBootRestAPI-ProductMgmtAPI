package com.becoder.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductResponse {

	private List<ProductDto> products;
	private long totalElements;
	private int totalPages;
	private Boolean isFirst;
	private Boolean isLast;
	private int pageNo;
	private int pageSize;

}
