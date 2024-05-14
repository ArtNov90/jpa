package banque.entitees;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.time.LocalDate;

public class ConnexionBanque {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		// Création d'une nouvelle banque
		Banque banque = new Banque();
		banque.setNom("Credit Agricole");
		entityManager.persist(banque);

		// Création d'un nouveau compte
		Compte compte = new Compte();
		compte.setNumeroCompte("123456");
		compte.setSolde(1000.0);
		entityManager.persist(compte);

		// Création d'une nouvelle adresse
		Adresse adresse = new Adresse();
		adresse.setNumeroAdresse(123);
		adresse.setRue("3 rue des Genets");
		adresse.setCodePostale("34970");
		adresse.setVille("Maurin");

		// Création d'un nouveau client avec l'adresse
		Client clientBanque = new Client();
		clientBanque.setNom("Novara");
		clientBanque.setPrenom("Arthur");
		clientBanque.setDateNaissance(LocalDate.now());
		clientBanque.setAdresse(adresse);
		entityManager.persist(clientBanque);

		// Création d'une nouvelle opération liée à un compte
		Operation operation = new Operation();
		operation.setDateOperation(LocalDate.now());
		operation.setMontant(100.0);
		operation.setMotif("Virement");
		operation.setCompte(compte);
		entityManager.persist(operation);

		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
	}
}
