package co2103.hw2;

import co2103.hw2.model.Apartment;
import co2103.hw2.model.Building;
import co2103.hw2.model.Tenant;
import co2103.hw2.repo.ApartmentRepository;
import co2103.hw2.repo.BuildingRepository;
import co2103.hw2.repo.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Component
public class Hw2Application implements CommandLineRunner {
    @Autowired
    private BuildingRepository buildingRepository;

    @Autowired
    private ApartmentRepository apartmentRepository;

    @Autowired
    private TenantRepository tenantRepository;

    public static void main(String[] args) {
        SpringApplication.run(Hw2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Create and store Building Instance
        Building building = new Building();
        building.setCountry("France");
        buildingRepository.save((building));


        //Create and store Apartment instance
        Apartment apartment = new Apartment();
        apartment.setName("Walexis Apartments");
        apartmentRepository.save(apartment);

//        //Doubting this line below
//        List<Tenant> tenants = new ArrayList<>();
//        //Add tenants to list
//        tenants.add(new Tenant("Abdullahi Abdullateef"));
//        tenants.add(new Tenant("Jane Doe"));


        //Create and store Tenant instance
        Tenant tenant = new Tenant();
        tenant.setAge(24);
        tenantRepository.save(tenant);


        //Save instances in database




    }


}