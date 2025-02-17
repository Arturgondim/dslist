package com.arturgondim.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.arturgondim.dslist.dto.GameListDto;
import com.arturgondim.dslist.entities.GameList;
import com.arturgondim.dslist.repositories.GameListRepository;

@Service
public class GameListService {
     @Autowired
    private GameListRepository gameListRepository;

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<GameListDto> findAll(){
      List<GameList> result = gameListRepository.findAll();
      return result.stream().map(x -> new GameListDto(x)).toList();
      
 
    }

}
