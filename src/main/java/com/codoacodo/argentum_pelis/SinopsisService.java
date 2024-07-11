package com.codoacodo.argentum_pelis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SinopsisService {
    @Autowired
    private SinopsisRepository repository;

    public SinopsisDTO obtenerSinopsisAleatoria() {
        Sinopsis sinopsis = repository.obtenerSinopsisAleatoria();
        return new SinopsisDTO(sinopsis.getTitulo(), sinopsis.getSinopsis(), sinopsis.getPersonaje(), sinopsis.getPoster());
    }
}
