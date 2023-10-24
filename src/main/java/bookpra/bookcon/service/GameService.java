package bookpra.bookcon.service;

import bookpra.bookcon.dao.GameDAO;
import bookpra.bookcon.entity.Game;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GameService {

    private GameDAO dao;


    public List<Game> findAll() {
        return dao.findAll();
    }

    public Game findById(int game_code) {
        return dao.findById(game_code).get();
    }

    public void save(Game game) {
        dao.save(game);
    }

    public void deleteById(int game_code) {
        dao.deleteById(game_code);
    }
}
