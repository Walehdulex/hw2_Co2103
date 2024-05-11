package co2103.hw2.repo;

import co2103.hw2.model.Apartment;
import org.springframework.data.repository.CrudRepository;

public interface ApartmentRepository extends CrudRepository<Apartment, String> {
    public Apartment findByName(String name);
//    Optional<Apartment> findByName(String name);
}
