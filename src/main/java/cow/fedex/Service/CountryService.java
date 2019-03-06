package cow.fedex.Service;

import cow.fedex.Model.Country;
import cow.fedex.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CountryService {
CountryRepository countryRepository;

  @Autowired
  public CountryService(CountryRepository countryRepository) {
    this.countryRepository = countryRepository;
  }
  public List<Country> getAllCountriesByDifficulty (int difficulty) {
    return countryRepository.findAllByDifficulty(difficulty);
  }

  public int numberOfCountriesAtGivenDifficulty (int difficulty) {
    return getAllCountriesByDifficulty(difficulty).size();
  }

  public Country randomCountryByDifficulty (int difficulty) {
    return getAllCountriesByDifficulty(difficulty).get((int) (Math.random() * (numberOfCountriesAtGivenDifficulty(difficulty) + 1)));
  }

  public Map<Integer, Country> options (int difficulty) {
    Map<Integer, Country> optionsMap = new HashMap<Integer, Country>() {{
      put(0, randomCountryByDifficulty(difficulty));
      put(1, randomCountryByDifficulty(difficulty));
      put(2, randomCountryByDifficulty(difficulty));
      put(3, randomCountryByDifficulty(difficulty));
    }};
    return optionsMap;
  }
}
