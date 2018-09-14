package utils;

import entities.Dog;
import entities.Master;

import java.util.ArrayList;

public class JpaTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        EntityManagerHelper.beginTransaction();
        Dog d = new Dog();
        d.setName("Poppy");



        Master m = new Master();
        m.setName("Gautier");
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(d);

        m.setDogs(dogs);

        EntityManagerHelper.getEntityManager().persist(d);

        EntityManagerHelper.getEntityManager().persist(m);

        EntityManagerHelper.commit();

        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
    }

}

