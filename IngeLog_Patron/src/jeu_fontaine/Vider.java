package jeu_fontaine;

public class Vider extends Command{

	public Vider(Bidon b){
		super(b);
	}
	
	public void faire(){
		this.setVolumeEauDeplace(this.bide.getVolumeContenu());
		this.bide.vider();
	}
	
	public void deFaire(){
		
	}
}
