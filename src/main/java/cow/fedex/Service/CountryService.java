package cow.fedex.Service;

import cow.fedex.Model.Country;
import cow.fedex.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CountryService {
CountryRepository countryRepository;

  @Autowired
  public CountryService(CountryRepository countryRepository) {
    this.countryRepository = countryRepository;
  }

  public List<Country> getAllCountriesByDifficulty(int difficulty) {
    return countryRepository.findAllByDifficulty(difficulty);
  }

//  public int numberOfCountriesAtGivenDifficulty(int difficulty) {
//    return getAllCountriesByDifficulty(difficulty).size();
//  }
//
//  public Country randomCountryByDifficulty(int difficulty) {
//    return getAllCountriesByDifficulty(difficulty).get((int) (Math.random() * (numberOfCountriesAtGivenDifficulty(difficulty) + 1)));
//  }

  public List<Country> getAndRemoveNRandomCountriesFromList(List<Country> countryList, int numberOfCountriesToReturn) {
    Random random = new Random();
    List<Country> countryOptionsList = new ArrayList<>();
    for (int i = 0; i < numberOfCountriesToReturn; i++) {
      int randomIndex = random.nextInt(countryList.size());
      countryOptionsList.add(countryList.get(randomIndex));
      countryList.remove(randomIndex);
    }
    return countryOptionsList;
  }

  public String pickRandomCountryNameFromCountryList(List<Country> randomizedCountryList) {
    Random random = new Random();
    int randomIndex = random.nextInt(randomizedCountryList.size());
    return randomizedCountryList.get(randomIndex).getName();
  }

  public Country findCountryByName(String countryName) {
    return countryRepository.findCountryByName(countryName);
  }

//  public Map<Integer, Country> options(int difficulty) {
//    Map<Integer, Country> optionsMap = new HashMap<Integer, Country>() {{
//      put(0, randomCountryByDifficulty(difficulty));
//      put(1, randomCountryByDifficulty(difficulty));
//      put(2, randomCountryByDifficulty(difficulty));
//      put(3, randomCountryByDifficulty(difficulty));
//    }};
//    return optionsMap;
//  }
}
