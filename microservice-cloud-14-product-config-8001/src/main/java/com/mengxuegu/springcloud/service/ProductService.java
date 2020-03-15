package com.mengxuegu.springcloud.service;

import com.mengxuegu.springcloud.entities.Product;

import java.util.List;

public interface ProductService {

    Product get(Long pid);

    List<Product> list();

    boolean add(Product product);

}
