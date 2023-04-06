package frontiere;

import java.util.Scanner;

import control.ControlReserverTable;

public class BoundaryReserverTable {
	private ControlReserverTable controleur;
	private Scanner scanner = new Scanner(System.in);
	
	
	public BoundaryReserverTable(ControlReserverTable controleur) {
		super();
		this.controleur = controleur;
	}


	public void reserverTable(int numClient) {
		System.out.println("Quand souhaitez vous resevez ?");
		System.out.println("Pour quel mois ?");
		int mois = scanner.nextInt();
		System.out.println("Pour quel jour ?");
		int jour = scanner.nextInt();
		System.out.println("Pour combien de personnes ?");
		int nbPersonnes = scanner.nextInt();
		System.out.println("Pour quel service ?");
		int service = scanner.nextInt();
		
		int[] possibilites = controleur.trouverPossibilite(jour, mois, nbPersonnes, service);
		
		for (int i = 1;i<possibilites.length && possibilites[i] != 0;i++)
			System.out.println("Numero de table : " + possibilites[i]);
		
		System.out.println("Choississez votre table : ");
		int table = scanner.nextInt();
		controleur.reserver(numClient, table, possibilites[0]);
	}
}
