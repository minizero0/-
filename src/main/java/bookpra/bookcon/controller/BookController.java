package bookpra.bookcon.controller;

import bookpra.bookcon.entity.Book;
import bookpra.bookcon.service.BookService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Setter
public class BookController {

    @Autowired
    private BookService bs;

    @GetMapping("/book/insert")
    public void insert() {
    }

    @GetMapping("/book/list")
    public void list(Model model) {
        model.addAttribute("list", bs.findAll());
    }

    @PostMapping("/book/save")
    public ModelAndView save(Book b) {
        ModelAndView mav = new ModelAndView("redirect:/book/list");
        bs.save(b);
        return mav;
    }

    @GetMapping("/book/update/{bookid}")
    public ModelAndView update(@PathVariable int bookid) {
        ModelAndView mav = new ModelAndView("/book/update");
        mav.addObject("b", bs.getOne(bookid));
        return mav;
    }

    @GetMapping("/book/delete/{bookid}")
    public ModelAndView delete(@PathVariable int bookid) {
        ModelAndView mav = new ModelAndView("redirect:/book/list");
        bs.deleteById(bookid);
        return mav;
    }
}
