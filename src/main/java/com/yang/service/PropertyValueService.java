package com.yang.service;

import com.yang.domain.Product;
import com.yang.domain.PropertyValue;

import java.util.List;

public interface PropertyValueService {
    void init(Product p);
    void update(PropertyValue pv);
    PropertyValue get(int ptid, int pid);
    List<PropertyValue> list(int pid);
}
