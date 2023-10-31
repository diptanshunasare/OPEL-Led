package com.s2p.service;


import com.s2p.model.User;

public interface IUserService {
    public User add(User u) ;
    public Iterable<User> getAll() ;
}
