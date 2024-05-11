//package co2103.hw2;
//
//import co2103.hw2.model.Apartment;
//import co2103.hw2.model.Building;
//import co2103.hw2.model.Tenant;
//import co2103.hw2.repos.ApartmentRepository;
//import co2103.hw2.repos.BuildingRepository;
//import co2103.hw2.repos.TenantRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.stereotype.Component;
//
//@SpringBootApplication
//@Component
//public class Hw2Application implements CommandLineRunner {
//    @Autowired
//    private BuildingRepository buildingRepository;
//
//    @Autowired
//    private ApartmentRepository apartmentRepository;
//
//    @Autowired
//    private TenantRepository tenantRepository;
//
//    public static void main(String[] args) {
//        SpringApplication.run(Hw2Application.class, args);
//    }
//
//    @Override
//    public void run(String... args) throws  Exception {
//        //Create and store Building Instance
//        Building building = new Building();
//        building.setCountry("France");
//        buildingRepository.save((building));
//
//        //Create and store Apartment instance
//        Apartment apartment = new Apartment();
//        apartment.setName("Walexis Apartments");
//        apartmentRepository.save(apartment);
//
//        //Create and store Tenant instance
//        Tenant tenant = new Tenant();
//        tenant.setAge(24);
//        tenantRepository.save(tenant);
//
//    }




/////DELETE CONTROLLER
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//@Controller
//public class DeleteController {
//    private final BuildingRepository buildingRepository;
//    private final ApartmentRepository apartmentRepository;
//    private final TenantRepository tenantRepository;
//
//    @Autowired
//    public DeleteController(BuildingRepository buildingRepository, ApartmentRepository apartmentRepository, TenantRepository tenantRepository) {
//        this.buildingRepository = buildingRepository;
//        this.apartmentRepository = apartmentRepository;
//        this.tenantRepository = tenantRepository;
//    }
//
//    @DeleteMapping("/building/{id}")
//    public String deleteBuilding(@PathVariable int id) {
//        buildingRepository.deleteById(id);
//        return "redirect:/listBuilding";
//    }
//
//    @DeleteMapping("/apartment/{name}")
//    public String deleteApartment(@PathVariable String name) {
//        apartmentRepository.deleteById(name);
//        return "redirect:/listApartment";
//    }
//
//    @DeleteMapping("/tenant/{identifier}")
//    public String deleteTenant(@PathVariable int identifier) {
//        tenantRepository.deleteById(identifier);
//        return "redirect:/listTenant";
//    }
//}
//
//
//
//
//
//}