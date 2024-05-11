package co2103.hw2.controller;

import co2103.hw2.model.Apartment;
import co2103.hw2.model.Building;
import co2103.hw2.repo.ApartmentRepository;
import co2103.hw2.repo.BuildingRepository;
import co2103.hw2.repo.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeleteController {
    @Autowired
    private BuildingRepository buildingRepository;
    @Autowired
    private  ApartmentRepository apartmentRepository;
    @Autowired
    private  TenantRepository tenantRepository;



    @GetMapping("/deleteBuilding")
    public String deleteBuilding(@RequestParam("id") int id) {
        buildingRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/deleteApartment")
    public String deleteApartment(@RequestParam String name) {
        Apartment apartment = apartmentRepository.findByName(name);
        if (apartment != null) {
            for (Building building : apartment.getBuildings()) {
                building.getApartments().remove(apartment);
                buildingRepository.save(building);
            }
            apartmentRepository.delete(apartment);
        }
        return "redirect:/";
        //return new RedirectView("http://localhost:8080/");
    }
    @GetMapping("/deleteTenant")
    public String deleteTenant(@RequestParam int identifier){
        tenantRepository.deleteById(identifier);
        return "redirect:/";
    }

}




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
//    @GetMapping("/deleteBuilding")
//    public RedirectView deleteBuilding(@RequestParam("id") int id) {
//        buildingRepository.deleteById(id);
//        return new RedirectView("http://localhost:8080/");
//    }
//
//    @GetMapping("/deleteApartment")
//    public RedirectView deleteApartment(@RequestParam String name) {
//        Apartment apartment = apartmentRepository.findByName(name).orElse(null);
//        if (apartment != null) {
//            for (Building building : apartment.getBuildings()) {
//                building.getApartments().remove(apartment);
//                buildingRepository.save(building);
//            }
//            apartmentRepository.delete(apartment);
//        }
//        return new RedirectView("http://localhost:8080/");
//    }
//    @GetMapping("/deleteTenant")
//    public RedirectView deleteTenant(@RequestParam int identifier){
//        tenantRepository.deleteById(identifier);
//        return new RedirectView("http://localhost:8080/");
//    }
