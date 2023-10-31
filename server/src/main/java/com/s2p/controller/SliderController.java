package com.s2p.controller;
import com.s2p.model.Slider;
import com.s2p.service.ISliderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("slider")

public class SliderController {

    @Autowired
    ISliderService sliderService ;

    @GetMapping("/getAll")
    public List<Slider> getAll() {
        return sliderService.getAll() ;
    }
    @PostMapping("/add")
    public Slider add(@RequestBody Slider p) {
        return sliderService.add(p) ;
    }

}
