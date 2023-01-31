package TP03.src.Restaurant;

public class Consommable {
    private String nom;
    private int prix; // en centimes d'euros

    public Consommable(String nom, int prix){
    	this.nom = nom;
    	this.prix = prix;
    }

    public String getNom(){
    	return this.nom;
    }
	
    public int getPrix(){
    	return this.prix;
    }
}
