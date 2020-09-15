
public class CompteAvecSeuil extends Compte {
	
	private int nbLoc;

	public CompteAvecSeuil(Client cl) {
		super(cl);
		// TODO Auto-generated constructor stub
	}
	
	public CompteAvecSeuil(Client cl, int nbtruc) {
		// TODO Auto-generated constructor stub
		super(cl);
		this.nbLoc = nbtruc;
	}

	public double prixLocation(Produit p){
		
		if(getNbLoc()==10)
        {
                setNbLoc(0);
                return 0;
        }
        else
        {
                setNbLoc(getNbLoc()+1);
                return super.prixLocation(p);
        }
	}

	public int getNbLoc() {
		return nbLoc;
	}

	public void setNbLoc(int nbLoc) {
		this.nbLoc = nbLoc;
	}

}
