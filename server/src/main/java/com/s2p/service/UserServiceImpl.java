package com.s2p.service;

import com.s2p.dao.IUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{


    @Autowired
    IUserDAO userrepository ;


    @Override
    public com.s2p.model.User add(com.s2p.model.User u) {
        return userrepository.save(u);
    }

    @Override
    public Iterable<com.s2p.model.User> getAll() {
        return userrepository.findAll();
    }
}
