package bookpra.bookcon.controller;

import bookpra.bookcon.entity.User;
import bookpra.bookcon.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class SingUpController {
    private UserService us;

    @GetMapping("/main/signUp")
    public void signUp() { }

    @PostMapping("/main/save")
    public ModelAndView user_save(User user) {
        us.signUp(user);
        ModelAndView mav = new ModelAndView("redirect:/");
        return mav;
    }
}
