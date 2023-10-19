package bookpra.bookcon.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name = "student")
public class Student {
    @Id
    private int studentCode;

    private String studentName;
    private int age;

}
