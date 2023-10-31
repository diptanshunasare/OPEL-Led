package com.s2p.dao;

import com.s2p.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategories extends JpaRepository<Categories,Long> {
}
