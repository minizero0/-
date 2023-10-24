package bookpra.bookcon.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "game")
public class Game {
    @Id
    private int game_code;

    private String game_name;
    private String game_cate;
}
