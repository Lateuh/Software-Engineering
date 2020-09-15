package jeu_fontaine;

public class Bidon {
	private float capaciteMax;
	private float volumeContenu;
	private String nomBidon;
	
	public Bidon(float capMax, String nom){
		this.setCapaciteMax(capMax);
		this.setVolumeContenu(0);
		this.setNomBidon(nom);
	}
	
	public float getCapaciteMax() {
		return capaciteMax;
	}
	public void setCapaciteMax(float capaciteMax) {
		this.capaciteMax = capaciteMax;
	}
	public float getVolumeContenu() {
		return volumeContenu;
	}
	public void setVolumeContenu(float volumeContenu) {
		this.volumeContenu = volumeContenu;
	}

	public String getNomBidon() {
		return nomBidon;
	}

	public void setNomBidon(String nomBidon) {
		this.nomBidon = nomBidon;
	}

	public void vider() {
		this.setVolumeContenu(0);
	}

	public void remplir() {
		this.setVolumeContenu(this.getCapaciteMax());
	}

	public void transvaser(Bidon bide, Bidon cible) {
		
	}

	
	
}
