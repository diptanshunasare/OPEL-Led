package com.s2p.dao;

import com.s2p.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductDAO extends JpaRepository<Product,Long> {

//    public List<Product> findById(long id);
}
