package cow.fedex.Service;

import cow.fedex.Model.Country;
import cow.fedex.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CapitalService {
  CountryService countryService;

  @Autowired
  public CapitalService(CountryService countryService) {
    this.countryService = countryService;
  }


  public Map<Integer, String> countryOptions(int difficulty) {
    Map<Integer, Country> countryMap= countryService.options(difficulty);
    Map<Integer, String> countryOptionsMap = new HashMap<Integer, String>() {
      {
        for (int i = 0; i < countryMap.size(); i++) {
          put(i, countryMap.get(i).getName());
        }
      }
    };
    return countryOptionsMap;
  }
}
