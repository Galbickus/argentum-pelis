package com.codoacodo.argentum_pelis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SinopsisRepository extends JpaRepository<Sinopsis, Long> {
    @Query("SELECT s FROM Sinopsis s order by function('RANDOM') LIMIT 1")
    public Sinopsis obtenerSinopsisAleatoria();
}
