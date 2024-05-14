package banque.entitees;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="LIVRET_A")
public class LivretA extends Compte{
@Column(name = "ID")
private Integer id;
@Column(name = "TAUX")
private Double taux;

public LivretA() {
	super();
}

public LivretA(Integer id, Double taux) {
	super();
	this.id = id;
	this.taux = taux;
}

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Double getTaux() {
	return taux;
}
public void setTaux(Double taux) {
	this.taux = taux;
}

}
