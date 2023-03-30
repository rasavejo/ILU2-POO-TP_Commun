package model;

public class Formulaire {
	protected int jour;
	protected int mois;
	protected int indentificationEntite;
	
	
	protected Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}


	public int getJour() {
		return jour;
	}


	public void setJour(int jour) {
		this.jour = jour;
	}


	public int getMois() {
		return mois;
	}


	public void setMois(int mois) {
		this.mois = mois;
	}


	public int getIdentificationEntite() {
		return indentificationEntite;
	}


	public void setIdentificationEntite(int indentificationEntite) {
		this.indentificationEntite = indentificationEntite;
	}
	
	

}
