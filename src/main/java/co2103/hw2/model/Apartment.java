package co2103.hw2.model;

import jakarta.persistence.*;
import org.hibernate.annotations.TenantId;

import java.util.List;

@Entity
public class Apartment {
   @Id
    private String name;
    @ManyToMany(mappedBy = "apartments", cascade = CascadeType.ALL)
    private List<Building> buildings;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "apartment_id")
    private List<Tenant> tenants;
    @OneToOne
    private Tenant owner;

//    //still doubting
//    @ManyToOne
//    private Building building;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    public List<Tenant> getTenants() {
        return tenants;
    }

    public void setTenants(List<Tenant> tenants) {
        this.tenants = tenants;
    }

    public Tenant getOwner() {
        return owner;
    }

    public void setOwner(Tenant owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "name='" + name + '\'' +
                ", tenants=" + tenants +
                ", owner=" + owner +
                '}';
    }
}
