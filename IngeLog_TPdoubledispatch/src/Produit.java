
public class Produit {
	private String titre;
	private double prixLocation;
	
	public Produit(String string, double d) {
		// TODO Auto-generated constructor stub
		this.setTitre(string);
		this.setPrixLocation(d);
	}

	public double getPrixLocation(){
		System.out.println("gPL produit "+ titre);
		return this.prixLocation;
	}

	public String getTitre(){
		return this.titre;
	}
	public void setTitre(String s){
		this.titre = s;
	}
	
	public void setPrixLocation(double d){
		this.prixLocation = d;
	}
}
