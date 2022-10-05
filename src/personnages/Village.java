package personnages;

public class Village {
	private String nom;
	private Chef chef;
	
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	
	public Village(String nom, int nbVillageoisMaximum) {
	this.nom = nom;
	villageois = new Gaulois[nbVillageoisMaximum];
	this.nbVillageois = nbVillageoisMaximum;
	}
	
	public void ajouterHabitant(Gaulois g) {
		villageois[nbVillageois] = g;
		nbVillageois ++ ;
	}
	
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero];
	}
	
	public void setChef(Chef chef) {
	this.chef = chef;
	}
	
	public void main(String[] args) {
		new Village(nom = "village des irreductibles", nbVillageois = 30);
	}

	
	public String getNom() {
	return nom;
	}

}
