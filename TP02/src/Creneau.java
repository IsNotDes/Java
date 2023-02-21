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

        if (!verifCapacite()) {
            System.exit(1);
        }
        if (!verifDuree()) {
            System.exit(1);
        }
        if (!verifSalle()) {
            System.exit(1);
        }
    }

    private boolean verifSalle() {
        //TODO
        return true;
    }

    private boolean verifCapacite() {
        //TODO
        return true;
    }

    private boolean verifDuree() {
        if (getDuree() == 90) {
            return true
        }

        else {
            return false
        }
    }

    public Salle getSalle() {
        return salle;
    }

    public Activite getActivite() {
        return activite;
    }

    public int getDuree() {
        return duree;
    }

    public String toString() {
        return jour + "/" + mois + "/" + annee + " " + heure + ":" + minute + " (" + duree + ") : " + activite + " " + salle;
    }

    public boolean intersection(Creneau c) {
        int debut1 = heure * 60 + minute;
        int fin1 = debut1 + duree;
        int debut2 = c.heure * 60 + c.minute;
        int fin2 = debut2 + c.duree;

        if (((debut1 <= debut2) && (debut2 < fin1)) || ((debut2 <= debut1) && (debut1 < fin2))) {
            return true
        }

        else {
            return false
        }
    }
}
