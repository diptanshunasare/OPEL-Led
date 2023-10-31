package com.s2p.service;

import com.s2p.model.Cart;

import java.util.List;

public interface ICartService {
    public List<Cart> getAll() ;
    public Cart add(Cart c) ;
    public boolean delete(long id);
    public boolean addByProductId (long id) ;
}
