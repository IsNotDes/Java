package TP02.src;

public class Creneau {
    private int annee;
    private int mois; 
    private int jour; 
    private int heure; 
    private int minute; 
    private int duree; 
    private Salle salle;
    private Activite activite;
	
    public Creneau(int a, int m, int j, int h, int min, int d, Salle s, Activite ac) {
		annee = a; 
        mois = m; 
        jour = j;
        heure = h; 
        minute = min; 
        duree = d;
	    salle = s;
	    activite = ac;
	
        if(!verifCapacite()) {
	        System.exit(1); 
	    }

	    if(!verifDuree()) {
	        System.exit(1);
	    }

	    if(!verifSalle()) {
	        System.exit(1);
	    }
    }
    
    // Verifie l'adéquation de la salle : la salle affectée doit être une des salles appropriées de l'activité. Indication: utiliser une methode de liste.
    private boolean verifSalle(){
	//TODO : change implem
	return true;
    }
    
    // Verifie que la taille de la salle convient à la promo
    private boolean verifCapacite(){
	//TODO : change implem
	return true;
    }
    
    // Verifie que le début et la fin du créneau sont dans la même journée, entre 8h et 19h
    private boolean verifDuree(){
	//TODO : change implem
	return true;
    }
    
    public Salle getSalle(){
	return salle;
    }
    
    public Activite  getActivite(){
	return activite;
    }
    
    public int  getDuree(){
	return duree;
    }
    
    public String toString(){
	return jour + "/" + mois + "/" + annee + " " + heure + ":" + minute +" (" + duree +") : " + 
	    activite + " " + salle;
    }

    
    // Intersection
    public boolean intersection(Creneau c){
	//TODO : change implem
	//Vous pouvez utiliser toutes les fonctions auxiliaires que vous voulez.
	//
	return true;
    }    


}
