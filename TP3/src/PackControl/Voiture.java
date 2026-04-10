package PackControl;

public class Voiture extends  Vehicule {
	private int nbPortes ;
	public Voiture (String matricule ,String marque,int nbPortes) {
		super(matricule,marque);
		this.nbPortes=nbPortes;	
		
	}
	@Override
	public void stationner () {
		System.out.println("Le véhicule se gare dans la place standard");
		
	}
	@Override
	public void afficher () {
		super.afficher();
		System.out.println("Nombre de Porte : " + nbPortes);
		
		
	}

	
	

}