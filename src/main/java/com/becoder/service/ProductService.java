package com.becoder.service;

import java.util.List;

import com.becoder.dto.ProductDto;
import com.becoder.dto.ProductResponse;

public interface ProductService {

	public Boolean saveProduct(ProductDto productDto);

	public List<ProductDto> getAllProducts();

	public ProductDto getProductById(Integer id);
	
	public String updateProductById(ProductDto product);

	public Boolean deleteProduct(Integer id);

	public ProductResponse getProductsWithPagination(int pageNo, int pageSize, String sortBy, String sortDir);

}
