package bookpra.bookcon.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "board")
@Data
public class Board {
    @Id
    private int no;

    private String title;
    private String writer;
    private String pwd;
    private String content;
    private Date regdate;
    private int hit;
    private String ip;

    private int b_ref;
    private int b_step;
    private int b_level;
}
