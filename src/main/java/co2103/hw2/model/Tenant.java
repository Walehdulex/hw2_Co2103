package co2103.hw2.model;

import jakarta.persistence.*;

@Entity
public class Tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identifier;
    private int age;



    public Tenant() {
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tenant{" +
                "identifier=" + identifier +
                ", age=" + age +
                '}';
    }
}
