package cow.fedex.Controller;

import cow.fedex.Model.GameLogic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameLogicController {

  @GetMapping("/")
  public String mainpage(Model model, @ModelAttribute("gameLogic") GameLogic gameLogic) {
    model.addAttribute("gameLogic", gameLogic);
    return "index";
  }

//  @RequestMapping("/")
//  public String mainPage(@ModelAttribute("numberOfQuestions") int numberOfQuestions) {
//    return "redirect:/capitals/1";
//}

  @PostMapping("/")
  public ModelAndView reloadMainPage(@ModelAttribute("numberOfQuestions") int numberOfQuestions) {
    return new ModelAndView("redirect:/capitals/1");
  }
}

