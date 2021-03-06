package com.worktrial.task.services;

import com.worktrial.task.dtos.ProductDto;
import com.worktrial.task.exceptions.BaseException;
import com.worktrial.task.exceptions.ProductException;
import com.worktrial.task.models.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(ProductDto productDto);
    List<Product> findProductByIds(List<String> productIds) throws BaseException;
    List<Product> getAllProducts() throws BaseException;
    Product findProductByProductId(String productId) throws ProductException;
}
