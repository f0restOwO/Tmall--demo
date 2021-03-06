package com.yang.controller;

import com.yang.domain.Product;
import com.yang.domain.PropertyValue;
import com.yang.service.ProductService;
import com.yang.service.PropertyValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class PropertyValueController {
    @Autowired
    ProductService productService;
    @Autowired
    PropertyValueService propertyValueSevice;

    @RequestMapping("admin_propertyValue_edit")
    public String edit(Model model, int pid) {
        Product p = productService.get(pid);
        propertyValueSevice.init(p);
        List<PropertyValue> pvs = propertyValueSevice.list(pid);
        model.addAttribute("pvs", pvs);
        model.addAttribute("p", p);
        return "admin/editPropertyValue";
    }

    @RequestMapping("admin_propertyValue_update")
    @ResponseBody
    public String update(PropertyValue propertyValue) {
        propertyValueSevice.update(propertyValue);
        return "success";
    }
}
