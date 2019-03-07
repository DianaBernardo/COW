package cow.fedex.repository;

import cow.fedex.Model.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CountryRepository extends CrudRepository<Country, Long> {

  List<Country> findAllByDifficulty(int difficulty);
}
