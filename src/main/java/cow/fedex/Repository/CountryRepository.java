package cow.fedex.Repository;

import cow.fedex.Model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Long> {
  List<Country> findAllByDifficulty(int difficulty);
}
