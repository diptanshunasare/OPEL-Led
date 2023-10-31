package com.s2p.service;

import com.s2p.model.Categories;
import com.s2p.model.Deal_of_day;

import java.util.List;

public interface IDeal_of_dayService {

    public List<Deal_of_day> getAll() ;
//    public List<Deal_of_day> getbyid()
    public Deal_of_day add(Deal_of_day d) ;
    public boolean delete (long id ) ;
    public Deal_of_day update (long id , Deal_of_day d) ;

}
