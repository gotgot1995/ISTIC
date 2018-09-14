package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Master {

    private long id;

    private String name;

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private List<Dog> dogs;


    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "DOG_ID")
    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
