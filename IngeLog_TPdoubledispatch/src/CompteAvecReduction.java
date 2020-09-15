
public class CompteAvecReduction extends Compte {

	
	private double reduc;
	
	public CompteAvecReduction(Client cl) {
		super(cl);
		// TODO Auto-generated constructor stub
	}
	
	public CompteAvecReduction(Client cl, double reduc2) {
		// TODO Auto-generated constructor stub
		
		super(cl);
		this.reduc = reduc2;
	}

	public double prixLocation(Produit p){
		return super.prixLocation(p)*(1.0-reduc/100.0);
	}

}
