package com.arturgondim.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arturgondim.dslist.dto.GameDto;
import com.arturgondim.dslist.dto.GameMinDto;
import com.arturgondim.dslist.entities.Game;
import com.arturgondim.dslist.repositories.GameRepository;
import com.arturgondim.dslist.services.GameServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value ="/games")
public class GameController {

    @Autowired
    private GameServices gameServices;

    @GetMapping(value = "/{id}")
    public GameDto findById(@PathVariable Long id){
        GameDto result = gameServices.findById(id);
        return result;

    }

    @GetMapping
    public List<GameMinDto> findAll(){
        List<GameMinDto> result = gameServices.findAll();
        return result;

    }
}
