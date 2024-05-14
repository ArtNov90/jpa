package banque.entitees;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLIENT")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "NOM")
	private String nom;
	@Column(name = "PRENOM")
	private String prenom;
	@Column(name = "DATENAISSANCE")
	private LocalDate dateNaissance;
	@ManyToMany
	@JoinTable(name = "CLIENT_COMPTE", joinColumns = @JoinColumn(name = "CLIENT_ID"), inverseJoinColumns = @JoinColumn(name = "COMPTE_ID"))
	private Set<Compte> comptes;
	@ManyToOne
	@JoinColumn(name = "BANQUE_ID")
	private Banque banque;
	@Embedded
    private Adresse adresse;
	public Client() {
		super();
	}

	public Client(Integer id, String nom, String prenom, LocalDate dateNaissance) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public void setAdresse(Adresse adresse2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", comptes=" + comptes + ", banque=" + banque + ", adresse=" + adresse + "]";
	}

	

}
