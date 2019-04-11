package Rubrica;

import java.util.*;

public class Contatto {
	private String nome;
	private String cognome;
	private List<String> telefono;
	private String citta;
	private String provincia;
	private String cap;
	private String indirizzo;
	private List<String> email;
	private Date data;
	private String gruppo;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public List<String> getTelefono() {
		return telefono;
	}

	public void setTelefono(List<String> telefono) {
		this.telefono = telefono;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public List<String> getEmail() {
		return email;
	}

	public void setEmail(List<String> email) {
		this.email = email;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getGruppo() {
		return gruppo;
	}

	public void setGruppo(String gruppo) {
		this.gruppo = gruppo;
	}

	public Contatto(String nome, String cognome, List<String> nTelefono, String citta, String provincia, String cap, 
			String indirizzo, List<String> nMail, Date data, String gruppo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = nTelefono;
		this.citta = citta;
		this.provincia = provincia;
		this.cap = cap;
		this.indirizzo = indirizzo;
		this.email = nMail;
		this.data = data;
		this.gruppo = gruppo;
	}

	@Override
	public String toString() {
		return "Contatto [nome=" + nome + ", cognome=" + cognome + ", telefono=" + telefono + ", citta=" + citta
				+ ", provincia=" + provincia + ", cap=" + cap + ", indirizzo=" + indirizzo + ", email=" + email
				+ ", data=" + data + ", gruppo=" + gruppo + "]";
	}


}
