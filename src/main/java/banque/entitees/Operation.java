package banque.entitees;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="OPERATION")
@Inheritance(strategy = InheritanceType.JOINED)
public class Operation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "DATE")
	private LocalDate dateOperation;
	@Column(name = "MONTANT")
	private Double montant;
	@Column(name = "MOTIF")
	private String motif;
	@ManyToOne
    @JoinColumn(name = "COMPTE_ID")
    private Compte compte;
	public Operation() {
		super();
	}
	public Operation(Integer id, LocalDate dateOperation, Double montant, String motif) {
		super();
		this.id = id;
		this.dateOperation = dateOperation;
		this.montant = montant;
		this.motif = motif;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(LocalDate dateOperation) {
		this.dateOperation = dateOperation;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public void setCompte(Compte compte2) {
		// TODO Auto-generated method stub
		
	}
	
}
