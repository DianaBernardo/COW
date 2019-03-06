package cow.fedex.Service;

import cow.fedex.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CapitalService extends CountryService{

  public CapitalService(CountryRepository countryRepository) {
    super(countryRepository);
  }

  public Map<Integer, String> options () {
     Map<Integer, String> optionsMap = new HashMap<Integer, String>() {{
       put(1, "");
       put(2, "");
       put(3, "");
       put(4, "");
     }};
    return optionsMap;
  }
}
