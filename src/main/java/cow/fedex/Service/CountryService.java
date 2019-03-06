package cow.fedex.Service;

import cow.fedex.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
CountryRepository countryRepository;

  @Autowired
  public CountryService(CountryRepository countryRepository) {
    this.countryRepository = countryRepository;
  }
}
