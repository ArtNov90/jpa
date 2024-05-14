package fr.diginamic.d02202024.jpa;

import fr.diginamic.d02202024.jpa.entites.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnexionJpa {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		  // C -> CRUD
		
		// Créer un nouvel objet Livre 
        Livre livreACreer = new Livre("Germinal", "Emile Zola");
        
        entityManager.persist(livreACreer);
        
        // Après la persistance, l'ID sera défini automatiquement
        System.out.println("ID du livre créé : " + livreACreer.getId());
        entityManager.getTransaction().commit();
        
        // U -> Update
        //Mettre à jour 
        Livre livre = entityManager.find(Livre.class, 2);        
        if (null != livre) {
        	System.out.println(livre);
        }

        
        entityManager.close();
        entityManagerFactory.close();

	}

}
