package com.lsio.springbootDAO;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lsio.springbootDAO.entities.Game;
import com.lsio.springbootDAO.repositories.GameRepository;


@RestController
public class DAOController {

    @Autowired
    private GameRepository DAORepo;

    @GetMapping("/user/getgame/{id}")
    public Game getGameById(@PathVariable Long id) {
        return DAORepo.findById(id).get();
    }

    @GetMapping("/user/getgame/{name}")
    public Game getGameByName(@PathVariable String name) {
        return DAORepo.findByGamename(name);
    }

    @GetMapping("/user/getgames")
    public List<Game> getGames() {
        return DAORepo.findAll();
    }

    @PostMapping("/admin/addgame")
    public Game save(@RequestBody Game game){
        return DAORepo.save(game);
    }
}
