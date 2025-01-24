package com.arturgondim.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arturgondim.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
