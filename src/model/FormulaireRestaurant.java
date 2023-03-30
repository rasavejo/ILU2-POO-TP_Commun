package model;

public class FormulaireRestaurant extends Formulaire {
	private int nbTable;
	private int numService;
	
	
	
	public FormulaireRestaurant(int jour,int mois, int table,int service) {
		super(jour,mois);
		this.nbTable = table;
		this.numService = service;
	}



	@Override
	public String toString() {
		if (numService == 1)
			return "Le "+ jour + "/" + mois + " : table n°" + nbTable + " pour le premier service.\n";
		return "Le "+ jour + "/" + mois + " : table n°" + nbTable + " pour le deuxième service.\n";
	}



	public int getNbTable() {
		return nbTable;
	}



	public void setNbTable(int nbTable) {
		this.nbTable = nbTable;
	}



	public int getNumService() {
		return numService;
	}



	public void setNumService(int numService) {
		this.numService = numService;
	}
	
	
	

}
