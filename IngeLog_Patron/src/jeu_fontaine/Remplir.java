package jeu_fontaine;

public class Remplir extends Command{
	
	public Remplir(Bidon b){
		super(b);
	}
	
	public void faire(){
		this.setVolumeEauDeplace(this.bide.getVolumeContenu()-this.bide.getCapaciteMax());
		this.bide.remplir();
	}
	
	public void deFaire(){
		
	}
}
