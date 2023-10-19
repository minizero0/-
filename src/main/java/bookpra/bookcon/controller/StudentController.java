package bookpra.bookcon.controller;

import bookpra.bookcon.entity.Student;
import bookpra.bookcon.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class StudentController {
    private StudentService service;

    @GetMapping("/student/list")
    public void list(Model model) {
        model.addAttribute("list", service.findAll());
    }

    @GetMapping("/student/insert")
    public void insert() {
    }

    @PostMapping("/student/save")
    public ModelAndView save(Student student) {
        service.save(student);
        ModelAndView mav = new ModelAndView("redirect:/student/list");
        return mav;
    }

    @GetMapping("/student/update/{studentCode}")
    public ModelAndView update(@PathVariable int studentCode) {
        ModelAndView mav = new ModelAndView("/student/update");
        mav.addObject("s", service.findById(studentCode).get());
        return mav;
    }

    @GetMapping("/student/delete/{studentCode}")
    public ModelAndView delete(@PathVariable int studentCode) {
        service.deleteById(studentCode);
        ModelAndView mav = new ModelAndView("redirect:/student/list");
        return mav;
    }
}
