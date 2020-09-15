
public class Compte {

	private Client iencli;
	
	public double prixLocation(Produit p){
		return p.getPrixLocation();
	}
	
	public Compte(Client cl) {
		// TODO Auto-generated constructor stub
		this.setClient(cl);
		
	}

	public void setClient(Client c){
		this.iencli = c;
	}
}
