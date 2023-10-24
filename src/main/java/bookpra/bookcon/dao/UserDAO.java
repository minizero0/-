package bookpra.bookcon.dao;

import bookpra.bookcon.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface UserDAO extends JpaRepository<User, String> {
    @Query(value = "select * from member m where m.user_id = ?1 and m.user_pw = ?2", nativeQuery = true)
    int login(@PathVariable("user_id") String user_id, @PathVariable("user_pw") String user_pw);
}
