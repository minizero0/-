package bookpra.bookcon.controller;

import bookpra.bookcon.entity.Market;
import bookpra.bookcon.service.MarketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class MarketController {
    private MarketService marketService;

    @GetMapping("/market/list")
    public void list(Model model) {
        model.addAttribute("list", marketService.findAll());
    }

    @GetMapping("/market/insert")
    public void insert() {
    }

    @GetMapping("/market/update/{market_id}")
    public ModelAndView update(@PathVariable int market_id) {
        ModelAndView mav = new ModelAndView("/market/update");
        mav.addObject("c", marketService.findById(market_id).get());
        return mav;
    }

    @PostMapping("/market/save")
    public ModelAndView save(Market market) {
        marketService.save(market);
        ModelAndView mav = new ModelAndView("redirect:/market/list");
        return mav;
    }

    @GetMapping("/market/delete/{market_id}")
    public ModelAndView delete(@PathVariable int market_id) {
        marketService.deleteById(market_id);
        ModelAndView mav = new ModelAndView("redirect:/market/list");
        return mav;
    }

}
