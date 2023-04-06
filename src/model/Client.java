package model;

public class Client {
	private String nom;
	private String prenom;
	private String adresseMail;
	private String mdp;
	private Reservation[] reservations = new Reservation[20];

	public Client(String nom, String prenom, String adresseMail, String mdp) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresseMail = adresseMail;
		this.mdp = mdp;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public boolean connecterClient(String mdp) {
		return mdp.equals(this.mdp);
	}
	
	public void ajouterReservation(Reservation reservation) {
		int i;
		for (i = 0;reservations[i] != null;i++);
		reservations[i] = reservation;
	}

	// UNIQUEMENT POUR VERIFICATION
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("nom=" + nom + ", prenom=" + prenom);
		chaine.append(", adresseMail=" + adresseMail + ", mdp=" + mdp);
		return chaine.toString();
	}
}