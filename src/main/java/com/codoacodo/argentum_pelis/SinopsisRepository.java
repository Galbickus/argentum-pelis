package com.codoacodo.argentum_pelis;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SinopsisRepository extends JpaRepository<Sinopsis, Long> {
    Sinopsis obtenerSinopsisAleatoria();
}
