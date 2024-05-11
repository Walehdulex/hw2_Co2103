package co2103.hw2.model;

import jakarta.persistence.*;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;
@Entity
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String country;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Apartment>apartments;
    @ManyToOne
    private  Apartment penthouse;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(List<Apartment> apartments) {
        this.apartments = apartments;
    }

    public Apartment getPenthouse() {
        return penthouse;
    }

    public void setPenthouse(Apartment penthouse) {
        this.penthouse = penthouse;
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", apartments=" + apartments +
                ", penthouse=" + penthouse +
                '}';
    }
}
