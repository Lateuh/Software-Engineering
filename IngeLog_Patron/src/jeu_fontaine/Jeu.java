package jeu_fontaine;

public class Jeu {

		private float volumeFin;
	
		public void run(){
			
		}
		
		public void init(){
			this.setVolumeFin(3);
			System.out.println("Le volume à atteindre est de "+ this.getVolumeFin());
			Bidon b1 = new Bidon(5, "b1");
			Bidon b2 = new Bidon(2, "b2");
			
		}
		
		private String getChoixJoueur(){
			String s = "Salut";
			return s;
		}
		
		private void effectuerChoixJoueur(){
			
		}
		
		private boolean testGagne(){
			return false;
		}

		public float getVolumeFin() {
			return volumeFin;
		}

		public void setVolumeFin(float volumeFin) {
			this.volumeFin = volumeFin;
		}
		
}
