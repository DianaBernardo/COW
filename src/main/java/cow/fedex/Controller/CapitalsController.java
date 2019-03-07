package cow.fedex.Controller;

import cow.fedex.Model.Country;
import cow.fedex.Service.CapitalService;
import cow.fedex.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CapitalsController {
  CapitalService capitalService;
  CountryService countryService;

  @Autowired
  public CapitalsController(CapitalService capitalService, CountryService countryService) {
    this.capitalService = capitalService;
    this.countryService = countryService;
  }

  @GetMapping("capitals/{level}")
  public String showquestion (@PathVariable int level, Model model) {
    List<Country> countryList = countryService.getAllCountriesByDifficulty(level);
    List<Country> limitedCountryList = countryService.getAndRemoveNRandomCountriesFromList(countryList, 4);
    String rightCountryName = countryService.pickRandomCountryNameFromCountryList(limitedCountryList);
    List<String> capitalOptionsList = capitalService.getCapitalsFromCountryList(limitedCountryList);
    model.addAttribute("capitalOptions", capitalOptionsList);
    model.addAttribute("rightCountry", rightCountryName);
    return "displayQuestion";
  }
}
