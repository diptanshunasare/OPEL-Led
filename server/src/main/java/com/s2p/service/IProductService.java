package com.s2p.service;

import com.s2p.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    public List<Product> getAll() ;
    public Product add(Product p) ;
    public boolean delete (long id ) ;
    public Product update(long id, Product n);
    public Optional<Product> findById(long id ) ;


}
