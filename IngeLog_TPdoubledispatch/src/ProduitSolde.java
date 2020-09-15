
public class ProduitSolde extends Produit {

	
	public ProduitSolde(String string, double d) {
		super(string, d);
		// TODO Auto-generated constructor stub
	}

	
	public double getPrixLocation(){
		System.out.println("gPL produit soldé "+ super.getTitre());
		return super.getPrixLocation()/2;
	}
}
