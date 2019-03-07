package cow.fedex.Service;

import cow.fedex.Model.Country;
import cow.fedex.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

//  public Map<Integer, String> countryOptions(int difficulty) {
//    Map<Integer, Country> countryMap = countryService.options(difficulty);
//    Map<Integer, String> countryOptionsMap = new HashMap<Integer, String>() {
//      {
//        for (int i = 0; i < countryMap.size(); i++) {
//          put(i, countryMap.get(i).getCapital());
//        }
//      }
//    };
//    return countryOptionsMap;
//  }

//  public Map<String, String> countryOptions(int difficulty) {
//    Map<Integer, Country> countryMap = countryService.options(difficulty);
//    Map<String, String> countryOptionsMap = new HashMap<String, String>();
//        for (int i = 0; i < countryMap.size(); i++) {
//          countryOptionsMap.put(countryMap.get(i).getName(), countryMap.get(i).getCapital());
//        }
//    return countryOptionsMap;
//  }

//  public String chosenCountryName (Map<Integer, Country> countryMap) {
//    return ;
//  }

  public List<String> getCapitalsFromCountryList(List<Country> randomizedCountryList) {
    List<String> capitalsList = new ArrayList<>();
    for (int i = 0; i < randomizedCountryList.size(); i++) {
      capitalsList.add(randomizedCountryList.get(i).getCapital());
    }
    return capitalsList;
  }

  public boolean isCountryCorrect(Country country, String capital) {
    return country.getCapital().equals(capital);
  }
}
