package com.arturgondim.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.arturgondim.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
