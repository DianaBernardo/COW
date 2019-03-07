package cow.fedex.service;

import cow.fedex.Model.Country;
import cow.fedex.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class CountryService {

  CountryRepository countryRepository;
  String countryName;

  @Autowired
  public CountryService(CountryRepository countryRepository) {
    this.countryRepository = countryRepository;
  }

  public List<Country> countryList(int difficulty) {
    List<Country> countries = countryRepository.findAllByDifficulty(difficulty);
    return countries;
  }

  public List<Country> filteredList(List<Country> input) {
    Random random = new Random();
    int numberOfCountries = 4;
    List<Country> result = new ArrayList<>();

    for (int i = 0; i < numberOfCountries; i++) {
      int randomIndex = random.nextInt(input.size());
      result.add(input.get(randomIndex));
      Country randomElement = input.get(randomIndex);
      input.remove(randomElement);
    }
    return result;
  }


  public String countryAsked(List<Country> filteredList) {

    Random random = new Random();

    for (int i = 0; i < 1; i++) {
      int randomIndex = random.nextInt(filteredList.size());
      Country randomCountry = filteredList.get(randomIndex);
      countryName = randomCountry.getName();
    }
    return countryName;
  }
}
