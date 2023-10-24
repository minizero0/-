package bookpra.bookcon.controller;

import bookpra.bookcon.entity.Game;
import bookpra.bookcon.service.GameService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class GameController {

    private GameService gs;

    @GetMapping("/game/list")
    public void list(Model model) {
        model.addAttribute("list", gs.findAll());
    }

    @GetMapping("/game/insert")
    public void insert() {
    }

    @GetMapping("/game/update/{game_code}")
    public ModelAndView update(@PathVariable int game_code) {
        ModelAndView mav = new ModelAndView("/game/update");
        mav.addObject("c", gs.findById(game_code));
        return mav;
    }

    @PostMapping("/game/save")
    public ModelAndView save(Game game) {
        gs.save(game);
        ModelAndView mav = new ModelAndView("redirect:/game/list");
        return mav;
    }

    @GetMapping("/game/delete/{game_code}")
    public ModelAndView delete(@PathVariable int game_code) {
        gs.deleteById(game_code);
        ModelAndView mav = new ModelAndView("redirect:/game/list");
        return mav;
    }
}
