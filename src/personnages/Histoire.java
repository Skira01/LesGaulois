package personnages;

public class Histoire {

    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Asterix", 8);
        Gaulois obelix = new Gaulois("Obelix", 8);
        Druide panoramix = new Druide("Panoramix",5,10);
        Romain minus = new Romain("Minus", 6);

        panoramix.parler("Je vais aller préparer une petite potion");
        
       
        panoramix.booster(obelix);
        obelix.parler("Par Bélénos, ce n'est pas juste !");
        panoramix.booster(asterix);
        asterix.parler("Bonjour");
        minus.parler("UN GAU... UN GAUGAU..");
        asterix.frapper(minus);
        asterix.frapper(minus);
        
    }
    
} 


