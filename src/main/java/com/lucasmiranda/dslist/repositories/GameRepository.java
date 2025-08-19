package com.lucasmiranda.dslist.repositories;


import com.lucasmiranda.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {



}
