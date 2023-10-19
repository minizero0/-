package bookpra.bookcon.service;

import bookpra.bookcon.dao.StudentDAO;
import bookpra.bookcon.entity.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {
    private StudentDAO dao;

    public List<Student> findAll() {
        return dao.findAll();
    }

    public Optional<Student> findById(int studentCode) {
        return dao.findById(studentCode);
    }

    public void save(Student student) {
        dao.save(student);
    }

    public void deleteById(int studentCode) {
        dao.deleteById(studentCode);
    }
}
