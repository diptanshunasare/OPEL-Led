package com.s2p.controller;


import com.s2p.model.Product;
import com.s2p.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    IProductService productService ;

    @GetMapping("/getAll")
    public List<Product> getAll() {
        return productService.getAll() ;
    }
    @PostMapping("/add")
    public Product add(@RequestBody Product p) {
        return productService.add(p) ;
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable ("id") long id){
        if(productService.delete(id)){
            return true;
        }
        return false;
    }

    @GetMapping("/getby/{id}")
    public Optional<Product> findbyId(@PathVariable("id") long id) {return productService.findById(id) ;}

}
