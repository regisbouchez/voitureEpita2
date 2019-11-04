package fr.epita.persitance;

import fr.epita.entite.VoitureEntite;
import fr.epita.entite.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Repository
public class VoitureRepositoryImpl implements VoitureRepository {
  //   @Autowired
   // VoitureDAO voitureDAO;
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("voiturePU") ;
       EntityManager em = emf.createEntityManager() ;
    @Override
    public void save(VoitureEntite voiture) {
    //    voitureDAO.save(voiture);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("voiturePU") ;
        EntityManager em = emf.createEntityManager() ;
        System.out.println("juste avant de créer");
        try {
            em.getTransaction().begin();
            em.persist(voiture);
            em.getTransaction().commit();
        }catch(Exception se) {
            em.getTransaction().rollback();
        }
        finally {
            em.close();
        }
    }
}
