package com.s2p.controller;


import com.s2p.model.Cart;
import com.s2p.model.Categories;
import com.s2p.service.ICartService;
import com.s2p.service.ICategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    ICartService cartService ;
    @GetMapping("/getAll")
    public List<Cart> getAll() {
        return cartService.getAll() ;
    }
    @PostMapping("/add")
    public Cart add(@RequestBody Cart c) {
        return cartService.add(c) ;
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable ("id") long id){
        if(cartService.delete(id)){
            return true;
        }
        return false;
    }

}
