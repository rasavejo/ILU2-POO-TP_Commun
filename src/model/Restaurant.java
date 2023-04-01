package model;

public class Restaurant {
	 private CentraleReservation<Table,FormulaireRestaurant> centrale;
	 
	 public Restaurant() {
		 centrale = new CentraleReservation<>(new Table[50]);
	 }
	 
	 public void ajouterTable(int nbChaises) {
		 Table table = new Table(nbChaises);
		 centrale.ajouteEntite(table);
	 }
	 
	 public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
		 return centrale.donnerPossibilites(formulaire);
	 }
	 
	 public Reservation reserver(int numeroEntite,FormulaireRestaurant formulaire) {
		 return centrale.reserver(numeroEntite, formulaire);
	 }
	
}
