package banque.entitees;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="COMPTE")
@Inheritance(strategy = InheritanceType.JOINED)

public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "NUMERO")
	private String numeroCompte;
	@Column(name = "SOLDE")
	private Double solde;
	@ManyToMany(mappedBy = "comptes")
    private List<Client> clients;
	@OneToMany(mappedBy = "compte")
    private List<Operation> operations;
	public Compte() {
		super();
	}
	
	public Compte(Integer id, String numeroCompte, Double solde) {
		super();
		this.id = id;
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}
	
}
