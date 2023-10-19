package bookpra.bookcon.service;

import bookpra.bookcon.dao.BookDAO;
import bookpra.bookcon.entity.Book;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Setter
public class BookService {

    @Autowired
    private BookDAO dao;

    public List<Book> findAll() {
        return dao.findAll();
    }

    public void save(Book b) {
        dao.save(b);
    }

    public Book getOne(int bookid) {
        return dao.getOne(bookid);
    }

    public void deleteById(int bookid) {
        dao.deleteById(bookid);
    }

}
