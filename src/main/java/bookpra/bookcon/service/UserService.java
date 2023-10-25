package bookpra.bookcon.service;

import bookpra.bookcon.dao.UserDAO;
import bookpra.bookcon.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@AllArgsConstructor
public class UserService {

    private UserDAO dao;

    public void signUp(User user) {
        dao.save(user);
    }

    public int login(String user_id, String user_pw) {
        try {
            dao.login(user_id, user_pw);
            return 1;
        } catch (Exception e) {
            System.out.println("실패");
            return 0;
        }
    }

    public User findById(String user_id) {
        return dao.findById(user_id).get();
    }
}
