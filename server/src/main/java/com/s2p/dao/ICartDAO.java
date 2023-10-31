package com.s2p.dao;

import com.s2p.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICartDAO extends JpaRepository<Cart,Long> {
}
