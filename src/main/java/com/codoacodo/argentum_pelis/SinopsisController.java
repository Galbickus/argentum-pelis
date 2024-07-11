package com.codoacodo.argentum_pelis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SinopsisController {
    @Autowired
    private SinopsisService service;

    @GetMapping("/series/sinopsis")
    public SinopsisDTO obtenerSinopsis(){
        return service.obtenerSinopsisAleatoria();
    }
}
