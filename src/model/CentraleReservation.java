package model;

public class CentraleReservation <T extends EntiteReservable<Formulaire>,U extends Formulaire>{
	private T[] entites;
	private int nbEntite = 0;
	
	
	public CentraleReservation(T[] entites) {
		this.entites = entites;
	}
	
	public int ajouteEntite(T entite) {
		entites[nbEntite] = entite;
		nbEntite++;
		entite.setNumero(nbEntite);
		return entite.getNumero();
	}
	
	public int[] donnerPossibilites(U formulaire) {
		int[] tab = new int[nbEntite];
		for (int i = 0;i<nbEntite;i++) {
			tab[i] = 0;
			if (entites[i].estCompatible(formulaire))
				tab[i] = entites[i].getNumero();
		}
		return tab;
	}
	
	public Reservation reserver(int numeroEntite,U formulaire) {
		EntiteReservable<Formulaire> entite = entites[numeroEntite-1];
		formulaire.setIdentificationEntite(numeroEntite);
		return entite.reserver(formulaire);
	}

}