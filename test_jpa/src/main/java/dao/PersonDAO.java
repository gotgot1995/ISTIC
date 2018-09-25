package dao;

import entities.City;
import entities.Person;
import utils.EntityManagerHelper;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.*;
import java.util.Map;

public class PersonDAO implements BaseDAO<Person> {
    public Person save(Person o) {
        // save entity
        EntityManagerHelper.beginTransaction();
        EntityManagerHelper.getEntityManager().persist(o);
        EntityManagerHelper.commit();

        return o;
    }

    public Person read(Long id) {
        EntityManager entityManager = EntityManagerHelper.getEntityManager();
        Query query = entityManager
                .createQuery("SELECT p FROM Person p WHERE p.id = :id")
                .setParameter("id", id);

        return (Person) query.getSingleResult();
    }

    public Person update(Long id, Map<String, Object> map) {
        return null;
    }

    public void delete(Long id) {

    }

    public void delete(Person o) {

    }
}
