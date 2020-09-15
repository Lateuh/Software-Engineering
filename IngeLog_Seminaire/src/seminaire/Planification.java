package seminaire;

public class Planification extends EtatCycleSeminaire{
	CycleSeminaire cs;
	public void setTitre(String t){
		cs.setTitre();
	}
	
	public void ouvertureReservation(){
		cs.changeEtat(new PlacesDisponibles());
	}
}
