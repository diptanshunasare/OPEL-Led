package com.s2p.controller;

import com.s2p.model.Categories;
import com.s2p.service.ICategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoriesController {
    @Autowired
    ICategoriesService categoriesService ;
    @GetMapping("/getAll")
    public List<Categories> getAll() {
        return categoriesService.getAll() ;
    }
    @PostMapping("/add")
    public Categories add(@RequestBody Categories c) {
        return categoriesService.add(c) ;
    }

    @DeleteMapping("/delete/{id}")
public boolean delete(@PathVariable ("id") long id){
    if(categoriesService.delete(id)){
        return true;
    }
    return false;
}
    @PutMapping("/update/{id}")
    public Categories udpate(@PathVariable ("id") long id,
                               @RequestBody Categories n){
        return categoriesService.update(id,n);
    }
}

