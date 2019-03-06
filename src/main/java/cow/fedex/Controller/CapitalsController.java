package cow.fedex.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CapitalsController {

  @GetMapping("capitals/{level}")
  public String showquestion (@PathVariable int level) {
    return "displayQuestions";
  }
}
