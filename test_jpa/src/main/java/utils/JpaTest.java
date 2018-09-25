package utils;

import dao.CityDAO;
import dao.PersonDAO;
import entities.City;
import entities.Person;

import java.util.ArrayList;
import java.util.Arrays;

public class JpaTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        City c1 = new City();
        c1.setName("Angers");

        City c2 = new City();
        c2.setName("Nantes");

        CityDAO cityDAO = new CityDAO();

        // persist entities
        cityDAO.save(c1);
        cityDAO.save(c2);

        Person p = new Person();
        p.setName("Gautier");
        p.setCities(Arrays.asList(c1, c2));

        PersonDAO personDAO = new PersonDAO();
        personDAO.save(p);

        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
    }

}

