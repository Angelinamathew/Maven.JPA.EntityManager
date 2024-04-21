package services;


import javax.persistence.*;
import java.util.List;

public interface CURDService {
    @PersistenceUnit
    EntityManagerFactory em = Persistence.createEntityManagerFactory("my-persistence-unit");
    @PersistenceContext
    EntityManager manage = em.createEntityManager();

    public Object findByID(int id);
    public List findAll();


    Object update(Object dto);


    Object create(Object dto);

    public void update(int id);



}
