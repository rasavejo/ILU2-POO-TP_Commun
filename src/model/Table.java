package model;

public class Table extends EntiteReservable<Formulaire> {
	private CalendrierAnnuel calendrierDeuxiemeService = new CalendrierAnnuel();
	private int nbChaises;
	

	public Table(int nbChaises) {
		this.nbChaises = nbChaises;
	}

	
	// Forcé de caster car mettre en argument empeche d'Override et mettre
	// la genericite a FormulaireRestaurant empeche d'instancier une centrale.
	public boolean estCompatible(Formulaire f) {
		FormulaireRestaurant formulaire = (FormulaireRestaurant) f;
		if (!(nbChaises == formulaire.getNbTable() || formulaire.getNbTable() == nbChaises - 1)) return false;
		if (formulaire.getNumService() == 1)
			return calendrier.estLibre(formulaire.getJour(),formulaire.getMois());
		return calendrierDeuxiemeService.estLibre(formulaire.getJour(),formulaire.getMois());
	}
	
	public ReservationRestaurant reserver(Formulaire f) {
		FormulaireRestaurant formulaire = (FormulaireRestaurant) f;
		boolean reservation = false;
		ReservationRestaurant res = null;
		if (formulaire.getNumService() == 1)
			reservation = calendrier.reserver(formulaire.getJour(), formulaire.getMois());
		else 
			reservation = calendrierDeuxiemeService.reserver(formulaire.getJour(), formulaire.getMois());
		if (reservation) 
			res = new ReservationRestaurant(formulaire.getJour(), formulaire.getMois(), formulaire.getNumService(), formulaire.getNbTable());	
		return res;
	}
}
