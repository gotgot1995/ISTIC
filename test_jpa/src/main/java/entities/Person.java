package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person extends BaseEntity {

    private String name;

    private List<City> cities;

    @ManyToMany(cascade = CascadeType.PERSIST)
    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
