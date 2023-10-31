package com.s2p.service;


import com.s2p.dao.ICartDAO;
import com.s2p.dao.IProductDAO;
import com.s2p.model.Cart;
import com.s2p.model.Product;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements ICartService {

    @Autowired
    ICartDAO cartRepository ;

    @Autowired
    IProductDAO productRepository ;

    @Autowired
    IProductDAO userRepository ;

    @Override
    public List<Cart> getAll() {
        return cartRepository.findAll();
    }

    @Override
    public Cart add(Cart c) {
        return cartRepository.save(c);
    }

    @Override
    public boolean delete(long id) {
        Cart n = cartRepository.findById(id).get();

        if (n != null){
            cartRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean addByProductId(long id) {
//        Product n = productRepository.findById(id).get();
////        User u = userRepository.findById()
//        if (n != null){
//
//            cartRepository.save(n);
//            return true;
//        }
        return false;
    }


}
