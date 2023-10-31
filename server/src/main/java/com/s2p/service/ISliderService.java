package com.s2p.service;

import com.s2p.model.Slider;

import java.util.List;

public interface ISliderService {
    public List<Slider> getAll() ;
    public Slider add (Slider slider) ;

}
