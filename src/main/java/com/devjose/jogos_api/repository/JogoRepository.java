package com.devjose.jogos_api.repository;

import com.devjose.jogos_api.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogoRepository extends JpaRepository<Jogo, Long>{
}
