package co2103.hw2.controller;

import co2103.hw2.repo.ApartmentRepository;
import co2103.hw2.repo.BuildingRepository;
import co2103.hw2.repo.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListController{
    private final BuildingRepository buildingRepository;
    private final ApartmentRepository apartmentRepository;
    private final TenantRepository tenantRepository;

    @Autowired
    public ListController(BuildingRepository buildingRepository, ApartmentRepository apartmentRepository, TenantRepository tenantRepository){
        this.buildingRepository = buildingRepository;
        this.apartmentRepository = apartmentRepository;
        this.tenantRepository = tenantRepository;
    }

    @GetMapping("/listBuilding")
    public String listBuilding(Model model){
        model.addAttribute("data", buildingRepository.findAll());
        return "list";

    }

    @GetMapping("/listApartment")
    public String listApartments(Model model){
        model.addAttribute("data", apartmentRepository.findAll());
        return "list";
    }

    @GetMapping("/listTenant")
    public String listTenants(Model model){
        model.addAttribute("data", tenantRepository.findAll());
        return "list";
    }
}
