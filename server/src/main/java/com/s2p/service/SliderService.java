package com.s2p.service;

import com.s2p.dao.ISlider;
import com.s2p.model.Product;
import com.s2p.model.Slider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SliderService implements ISliderService {

    @Autowired
    ISlider sliderrepository ;

    @Override
    public List<Slider> getAll() {
        return sliderrepository.findAll();
    }

    @Override
public Slider add (Slider s) {
    return sliderrepository.save(s) ;
    }
}


