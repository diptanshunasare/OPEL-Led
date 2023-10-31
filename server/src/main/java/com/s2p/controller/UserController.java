package com.s2p.controller;


import com.s2p.model.User;
import com.s2p.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

      @Autowired
      IUserService userService ;

    @GetMapping("/getAll")
    public List<User> getAll() {
        return (List<User>) userService.getAll();
    }
    @PostMapping("/add")
    public User add(@RequestBody User p) {
        return userService.add(p) ;
    }

}
