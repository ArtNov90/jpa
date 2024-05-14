package fr.diginamic.d02202024.jpa;

import fr.diginamic.d02202024.jpa.entites.Client;
import fr.diginamic.d02202024.jpa.entites.Emprunt;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
    			EntityManager em = emf.createEntityManager()) {
    		
    		em.getTransaction().begin();
    		
    		//Récupération d'un emprunt numéro 2
    		Emprunt emprunt = em.find(Emprunt.class, 2);
    		if (null != emprunt) {
    			System.out.println(emprunt.getLivres());
    		}    		
    		
    		//Récupération le client numéro 1
    		Client client = em.find(Client.class, 1);
    		if (null != client) {
    			System.out.println(client.getEmprunts());
    		}
    		
    		
    		
    		em.getTransaction().commit();
    		
    	}
    }
}
