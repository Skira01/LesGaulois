package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		this.forcePotion = 1;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � " + effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
    public int preparerPotion() {
        Random random = new Random();
        int pot = random.nextInt(effetPotionMin, effetPotionMax);
        if (pot > 7) {
            parler("J'ai prepare une super potion de force" + pot);

        } else {
            parler("Je n'ai pas trouve tous les ingredients, ma potion est seulement de force" + pot);

        }

        return pot;

    }
    
    public void booster(Gaulois gaulois) {
        if (gaulois.getNom() == "Obelix"){
                parler("Non,Obelix !... Tu n'auras pas de potion magique !");
        }
        else {
        	gaulois.boirePotion(preparerPotion());
        }




    }
	
    public static void main(String[] args) {

    	Druide panoramix = new Druide("Panoramix",5,10);
    }
}