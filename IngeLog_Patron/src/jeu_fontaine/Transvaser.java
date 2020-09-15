package jeu_fontaine;

public class Transvaser extends Command{

	private Bidon cible;
	
	public Transvaser(Bidon source, Bidon cible){
		super(source);
	}
	
	public void faire(){
		this.bide.setVolumeContenu(this.cible.getVolumeContenu());
		this.bide.transvaser(this.bide , this.cible);
	}
	

	public void deFaire(){
		
	}
}
