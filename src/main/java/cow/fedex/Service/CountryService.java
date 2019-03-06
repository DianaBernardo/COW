package cow.fedex.Service;

import cow.fedex.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
CountryRepository countryRepository;

  @Autowired
  public CountryService(CountryRepository countryRepository) {
    this.countryRepository = countryRepository;
  }

  public List<CountryRepository> getCountriesByLevel (int difficulty) {
    return countryRepository.findAllByDifficulty (difficulty);
  }
}
