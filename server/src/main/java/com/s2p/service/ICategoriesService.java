package com.s2p.service;

import com.s2p.model.Categories;

import java.util.List;

public interface ICategoriesService {
    public List<Categories> getAll() ;
    public Categories add(Categories c) ;
    public boolean delete(long id);
    public Categories update(long id, Categories n);
}
