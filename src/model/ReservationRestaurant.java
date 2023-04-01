package model;

public class ReservationRestaurant extends Reservation{
	private int table;
	private int service;
	
	
	
	public ReservationRestaurant(int jour,int mois, int service,int table) {
		super(jour,mois);
		this.table = table;
		this.service = service;
	}



	@Override
	public String toString() {
		if (service == 1)
			return "Le "+ jour + "/" + mois + " : table " + table + " pour le premier service.\n";
		return "Le "+ jour + "/" + mois + " : table " + table + " pour le deuxi�me service.\n";
	}

}
