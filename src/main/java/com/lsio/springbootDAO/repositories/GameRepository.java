package com.lsio.springbootDAO.repositories;
import com.lsio.springbootDAO.entities.Game;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game,Long>{

    Game findByGamename(String gamename);
    
}

