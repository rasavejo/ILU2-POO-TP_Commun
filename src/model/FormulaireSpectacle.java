package model;

public class FormulaireSpectacle extends Formulaire {
	private int zone;
	private int chaise;
	
	public FormulaireSpectacle(int jour,int mois, int zone,int chaise) {
		super(jour,mois);
		this.zone = zone;
		this.chaise = chaise;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}

	public int getChaise() {
		return chaise;
	}

	public void setChaise(int chaise) {
		this.chaise = chaise;
	}

	
	
}
