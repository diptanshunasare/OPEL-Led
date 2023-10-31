package com.s2p.service;

import com.s2p.dao.IDeal_of_dayDAO;
import com.s2p.model.Deal_of_day;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Deal_of_dayServiceImpl implements IDeal_of_dayService {

    @Autowired
    IDeal_of_dayDAO dealRepository ;

    @Override
    public List<Deal_of_day> getAll() {
        return dealRepository.findAll() ;
    }

    @Override
    public Deal_of_day add(Deal_of_day d) {
        return dealRepository.save(d) ;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public Deal_of_day update(long id, Deal_of_day d) {
        return null;
    }
}
