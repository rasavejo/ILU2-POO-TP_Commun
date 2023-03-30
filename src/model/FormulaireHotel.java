package model;

public class FormulaireHotel extends Formulaire {
	private int nbLitSimple;
	private int nbLitDouble;
	private int numChambre;
	
	
	
	public int getNbLitSimple() {
		return nbLitSimple;
	}



	public void setNbLitSimple(int nbLitSimple) {
		this.nbLitSimple = nbLitSimple;
	}



	public int getNbLitDouble() {
		return nbLitDouble;
	}



	public void setNbLitDouble(int nbLitDouble) {
		this.nbLitDouble = nbLitDouble;
	}



	public int getNumChambre() {
		return numChambre;
	}



	public void setNumChambre(int numChambre) {
		this.numChambre = numChambre;
	}



	public FormulaireHotel(int jour, int mois, int nbLitSimple, int nbLitDouble, int numChambre) {
		super(jour, mois);
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
		this.numChambre = numChambre;
	}
}
