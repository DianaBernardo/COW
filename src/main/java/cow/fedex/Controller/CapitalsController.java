package cow.fedex.Controller;

import cow.fedex.Service.CapitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CapitalsController {
  CapitalService capitalService;

  @Autowired
  public CapitalsController(CapitalService capitalService) {
    this.capitalService = capitalService;
  }

  @GetMapping("capitals/{level}")
  public String showquestion (@PathVariable int level, Model model) {
    model.addAttribute("capitalOptions", capitalService.countryOptions(level));
    return "displayQuestions";
  }
}
