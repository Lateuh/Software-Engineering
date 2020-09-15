
public class main {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Produit lgv = new Produit("La_grande_vadrouille", 10.0);
//		Client cl = new Client("Dupont");
//		Compte cmt = new Compte(cl);
//		cmt.prixLocation(lgv);
//		
//		
//	}
	
	
    public static void main(String[] args) {
        Produit lgv = new Produit("La grande vadrouille", 10.0);
        Client cl = new Client("Dupont");
        Compte cmt = new Compte(cl);
        cmt.prixLocation(lgv);
        int reduc = 20;
        CompteAvecReduction cptR = new CompteAvecReduction(cl,reduc);
        int nbtruc = 9;
        CompteAvecSeuil cptS = new CompteAvecSeuil(cl, nbtruc);
        
        double temp;
        temp = cmt.prixLocation(lgv);
        System.out.println("Prix Location : " + temp);
        temp = cptR.prixLocation(lgv);
        System.out.println("Prix Location : " + temp);
        temp = cptS.prixLocation(lgv);
        System.out.println("Prix Location : " + temp);
        temp = cptS.prixLocation(lgv);
        System.out.println("Prix Location : " + temp);
        temp = cptS.prixLocation(lgv);
        System.out.println("Prix Location : " + temp);
    }
    
    
}