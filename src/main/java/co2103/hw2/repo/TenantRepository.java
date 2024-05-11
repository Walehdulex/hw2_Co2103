package co2103.hw2.repo;

import co2103.hw2.model.Tenant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TenantRepository extends CrudRepository<Tenant, Integer> {
    List<Tenant> findByAge(int age);
}
