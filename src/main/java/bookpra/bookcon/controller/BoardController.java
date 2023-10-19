package bookpra.bookcon.controller;

import bookpra.bookcon.entity.Board;
import bookpra.bookcon.service.BoardService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class BoardController {

    private BoardService bs;

    @GetMapping("/board/insert/{no}")
    public ModelAndView insertForm(@PathVariable int no) {
        ModelAndView mav = new ModelAndView("/board/insert");
        mav.addObject("no", no);
        return mav;
    }

    @PostMapping("/board/insert")
    public ModelAndView insert(Board b, HttpServletRequest request) {
        int no = bs.getNextNo();
        int b_ref = no;
        int b_step = 0;
        int b_level = 0;


        //if 답글
        int pno = b.getNo();
        if (pno != 0) {
            Board p = bs.findById(pno);
            b_ref = p.getB_ref();
            b_step = p.getB_step();
            b_level = p.getB_level();
            bs.updateStep(b_ref, b_step);
            b_step++;
            b_level++;
        }

        b.setNo(no);
        b.setB_ref(b_ref);
        b.setB_step(b_step);
        b.setB_level(b_level);

        String ip = request.getRemoteAddr();
        b.setIp(ip);
        ModelAndView mav = new ModelAndView("redirect:/board/list");
        bs.insert(b);
        return mav;
    }

    @GetMapping("/board/list")
    public void list(Model model) {
        model.addAttribute("list", bs.selectAll());
    }

    @GetMapping("/board/detail/{no}")
    public ModelAndView detail(@PathVariable int no) {
        ModelAndView mav = new ModelAndView("/board/detail");
        mav.addObject("b", bs.findById(no));
        return mav;
    }
}
