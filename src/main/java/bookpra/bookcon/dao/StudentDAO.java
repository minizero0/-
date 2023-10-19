package bookpra.bookcon.dao;

import bookpra.bookcon.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDAO extends JpaRepository<Student, Integer> {

}



