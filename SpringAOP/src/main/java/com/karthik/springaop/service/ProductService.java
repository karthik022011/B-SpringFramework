package com.karthik.springaop.service;



import com.karthik.springaop.model.ProductDTO;

import java.util.List;

public interface ProductService {
    ProductDTO createProduct(ProductDTO productDTO);

    List<ProductDTO> getAllProducts();
}
