package jeu_fontaine;

public abstract class Command {
	
	private float volumeEauDeplace;
	protected Bidon bide;
	
	public Command(Bidon b){
		
	}

	public float getVolumeEauDeplace() {
		return volumeEauDeplace;
	}

	public void setVolumeEauDeplace(float volumeEauDeplace) {
		this.volumeEauDeplace = volumeEauDeplace;
	}
	
	public void faire(){
		
	}
	
	public void deFaire(){
		
	}
}
