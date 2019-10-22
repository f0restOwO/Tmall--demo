package com.yang.service;

import com.yang.domain.Category;
import com.yang.domain.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    void delete(int id);
    void update(Product product);
    Product get(int id);

    List<Product> list(int cid);

    void setFirstProductImage(Product product);
    void fill(List<Category> cs);
    void fill(Category category);
    void fillByRow(List<Category> cs);

    void setSaleAndReviewNumber(Product product);
    void setSaleAndReviewNumber(List<Product> ps);

    List<Product> search(String keywords);
}
