package com.s2p.dao;

import com.s2p.model.Slider;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface ISlider extends JpaRepository<Slider,Long> {
}
