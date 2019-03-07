package cow.fedex.controller;

import cow.fedex.Model.Country;
import cow.fedex.service.CountryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CountryController {

  CountryService countryService;

  public CountryController(CountryService countryService) {
    this.countryService = countryService;
  }

  @GetMapping("/capitals")
  public String capital(Model model) {
    List<Country> countries = countryService.countryList(1);
    model.addAttribute("countryList", countryService.filteredList(countries));
    model.addAttribute("countryName", countryService.countryAsked(countries));
    return "displayQuestion";
  }
}
