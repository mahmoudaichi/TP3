package PackControl;

public class Moto extends Vehicule {
	private boolean avecCasque ;
	public Moto (String matricule ,String marque, boolean avecCasque) {
		super(matricule,marque);
		this.avecCasque=avecCasque;	
		
	}
	@Override
	public void stationner () {
		System.out.println("Le moto se gare dans la place réservée aux deux-roues");
		
	}
	@Override
	public void afficher () {
		super.afficher();
		if(avecCasque) {
			System.out.println("Porte le casque");
			
			
		}else {
			System.out.println("Ne porte pas le casque");
			
		}
		System.out.println("Matricule :"+ matricule + ",Marque:" + marque);
		
		
	}
	
	

}