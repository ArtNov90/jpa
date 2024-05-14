package banque.entitees;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name="ASSURANCE_VIE")
public class AssuranceVie extends Compte{
	@Column(name = "ID")
	private Integer id;
	@Column(name = "DATE_FIN")
	private LocalDate dateFin;
	@Column(name = "TAUX")
	private Double taux;

	public AssuranceVie() {
		super();
	}

	public AssuranceVie(Integer id, LocalDate dateFin, Double taux) {
		super();
		this.id = id;
		this.dateFin = dateFin;
		this.taux = taux;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public Double getTaux() {
		return taux;
	}

	public void setTaux(Double taux) {
		this.taux = taux;
	}
}
