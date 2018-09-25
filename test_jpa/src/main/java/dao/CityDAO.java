package dao;

import entities.City;
import utils.EntityManagerHelper;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Map;

public class CityDAO implements BaseDAO<City>{
    public City save(City o) {
        // save entity
        EntityManagerHelper.beginTransaction();
        EntityManagerHelper.getEntityManager().persist(o);
        EntityManagerHelper.commit();

        return o;
    }

    public City read(Long id) {
        EntityManager entityManager = EntityManagerHelper.getEntityManager();
        Query query = entityManager.createQuery("SELECT c FROM City c WHERE c.id = :id").setParameter("id", id);

        return (City) query.getSingleResult();
    }

    public City update(Long id, Map<String, Object> map) {
        return null;
    }

    public void delete(Long id) {

    }

    public void delete(City o) {

    }
}
