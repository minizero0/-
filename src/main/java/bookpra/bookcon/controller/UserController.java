package bookpra.bookcon.controller;

import bookpra.bookcon.entity.User;
import bookpra.bookcon.service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
@AllArgsConstructor
public class UserController {
    private UserService us;

    @GetMapping("/main/signUp")
    public void signUp() { }

    @PostMapping("/main/save")
    public ModelAndView user_save(User user) {
        us.signUp(user);
        ModelAndView mav = new ModelAndView("redirect:/main/login");
        return mav;
    }

    @GetMapping("/main/login")
    public void login(HttpSession session) {
        System.out.println(session.getAttribute("login_user"));
    }

    @PostMapping("/main/login")
    public ModelAndView login_f(String user_id, String user_pw, HttpSession session) {
        ModelAndView mav = new ModelAndView("redirect:/book/list");
        int answer = us.login(user_id, user_pw);
        if (answer == 1) {
            session.setAttribute("login_user", us.findById(user_id));
        }
        else {
            mav.addObject("msg", "로그인 실패");
            mav.setViewName("error");
        }
        return mav;
    }




}
