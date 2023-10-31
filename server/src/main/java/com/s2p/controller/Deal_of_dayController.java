package com.s2p.controller;

import com.s2p.model.Categories;
import com.s2p.model.Deal_of_day;
import com.s2p.service.ICategoriesService;
import com.s2p.service.IDeal_of_dayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/deal_of_day")
public class Deal_of_dayController {
    @Autowired
    IDeal_of_dayService dealService ;


    @GetMapping("/getAll")
            public List<Deal_of_day> getAll(){
              return dealService.getAll() ;
            }

    @PostMapping("/add")
    public Deal_of_day add(@RequestBody Deal_of_day d) {
        return dealService.add(d) ;
    }
}

//    @PostMapping("/add")
//    public Categories add(@RequestBody Categories c) {
//        return categoriesService.add(c) ;
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public boolean delete(@PathVariable ("id") long id){
//        if(categoriesService.delete(id)){
//            return true;
//        }
//        return false;
//    }
//    @PutMapping("/update/{id}")
//    public Categories udpate(@PathVariable ("id") long id,
//                             @RequestBody Categories n){
//        return categoriesService.update(id,n);
//    }
