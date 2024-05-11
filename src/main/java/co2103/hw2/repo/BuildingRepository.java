package co2103.hw2.repo;

import co2103.hw2.model.Building;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BuildingRepository extends CrudRepository<Building, Integer> {
    List<Building> findByCountry(String country);
    List<Building> findByPenthouseName(String name);

}
