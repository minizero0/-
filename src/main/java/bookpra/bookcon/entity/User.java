package bookpra.bookcon.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "member")
public class User {
    @Id
    private String user_id;

    private String user_pw;
    private String user_name;
    private int user_number;
}
