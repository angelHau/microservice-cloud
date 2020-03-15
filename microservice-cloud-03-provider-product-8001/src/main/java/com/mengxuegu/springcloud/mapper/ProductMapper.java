package com.mengxuegu.springcloud.mapper;

import com.mengxuegu.springcloud.entities.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
//@Mapper
@Repository
public interface ProductMapper {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);

}
