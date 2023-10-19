package bookpra.bookcon.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "customer")
public class Customer {
    @Id
    private int custid;

    private String name;
    private String address;
    private String phone;
}
