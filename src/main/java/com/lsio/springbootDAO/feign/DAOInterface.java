package com.lsio.springbootDAO.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.lsio.springbootDAO.entities.Game;

 @FeignClient(name="SPRINGBOOTAPI", configuration = FeignClientConfiguration.class)
 public interface DAOInterface {
 
    @GetMapping("/user/getgame/{id}")
    public Game getGameById(@PathVariable Long id);

    @GetMapping("/user/getgame/{name}")
    public Game getGameByName(@PathVariable String name);

    @GetMapping("/user/getgames")
    public List<Game> getGames();

    @PostMapping("/admin/addgame")
    public Game save(Game game);

}
