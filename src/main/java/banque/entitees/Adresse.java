package banque.entitees;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Adresse {

	@Column(name = "NUMEROADRESSE")
	private Integer numeroAdresse;
	@Column(name = "RUE")
	private String rue;
	@Column(name = "CODEPOSTALE")
	private String codePostale;
	@Column(name = "VILLE")
	private String ville;

	public Adresse() {
		super();
	}

	public Adresse(Integer id, Integer numeroAdresse, String rue, String codePostale, String ville) {
		super();

		this.numeroAdresse = numeroAdresse;
		this.rue = rue;
		this.codePostale = codePostale;
		this.ville = ville;
	}

	public Integer getNumeroAdresse() {
		return numeroAdresse;
	}

	public void setNumeroAdresse(Integer numeroAdresse) {
		this.numeroAdresse = numeroAdresse;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
