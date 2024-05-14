package banque.entitees;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "VIREMENT")
public class Virement {
	@Column(name = "ID")
	private Integer id;
	@Column(name = "BENEFICIAIRE")
	private String beneficiaire;

	public Virement() {
		super();
	}

	public Virement(Integer id, String beneficiaire) {
		super();
		this.id = id;
		this.beneficiaire = beneficiaire;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBeneficiaire() {
		return beneficiaire;
	}

	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

}
