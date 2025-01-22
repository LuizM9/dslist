package com.luizm9.dslist.services;

import com.luizm9.dslist.dto.GameDTO;
import com.luizm9.dslist.dto.GameListDTO;
import com.luizm9.dslist.dto.GameMinDTO;
import com.luizm9.dslist.entities.Game;
import com.luizm9.dslist.entities.GameList;
import com.luizm9.dslist.repositories.GameListRepository;
import com.luizm9.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}