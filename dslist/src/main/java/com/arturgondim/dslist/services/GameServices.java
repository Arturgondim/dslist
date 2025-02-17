package com.arturgondim.dslist.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arturgondim.dslist.dto.GameDto;
import com.arturgondim.dslist.dto.GameMinDto;
import com.arturgondim.dslist.entities.Game;
import com.arturgondim.dslist.repositories.GameRepository;


@Service
public class GameServices {

    @Autowired
    private GameRepository gameRepository;

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public GameDto findById(Long id){
        Game result =  gameRepository.findById(id).get();
        return new GameDto(result);

    }

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<GameMinDto> findAll(){
      List<Game> result = gameRepository.findAll();
      return result.stream().map(x -> new GameMinDto(x)).toList();
      
 
    }
}
