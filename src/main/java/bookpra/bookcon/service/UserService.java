package bookpra.bookcon.service;

import bookpra.bookcon.dao.UserDAO;
import bookpra.bookcon.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserDAO dao;

    public void signUp(User user) {
        dao.save(user);
    }
}
