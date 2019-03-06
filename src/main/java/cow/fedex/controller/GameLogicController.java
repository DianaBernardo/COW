package cow.fedex.controller;

import cow.fedex.Model.GameLogic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class GameLogicController {

  @GetMapping("/")
  public String mainpage(Model model, @ModelAttribute("gameLogic") GameLogic gameLogic) {
    model.addAttribute("gameLogic", gameLogic);
    return "index";
  }
}

