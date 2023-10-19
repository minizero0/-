package bookpra.bookcon.service;

import bookpra.bookcon.dao.StudentDAO;
import bookpra.bookcon.entity.Student;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceTest {

    @Autowired
    StudentService service;
//
//    @AfterEach
//    public void cleanUp() {
//        service.deleteAll();
//    }

    @Test
    @DisplayName("회원가입 테스트")
    @Transactional
    public void findAllTest() {
        Student a = new Student();
        a.setStudentCode(3);
        a.setStudentName("du");
        a.setAge(11);
        service.save(a);

        assertEquals(2, service.findById(3).get().getStudentCode());
    }

}