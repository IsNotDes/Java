package TD.Chrono;

public class Chrono {
    private int heures;
    private int minutes;
    private int secondes;
    public Chrono() {
        heures = 0;
        minutes = 0;
        secondes = 0;
    }
    public int getHeures() {
        return heures;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSecondes() {
        return secondes;
    }
    public void setHeures(int pHeures) {
        heures = pHeures;
    }
    public void setMinutes(int pMinutes) {
        minutes = pMinutes;
    }
    public void setSecondes(int pSecondes) {
        secondes = pSecondes;
    }
    public boolean rebours() {
        boolean res = true;
        if (secondes > 0) {
            secondes--;
        }
        else if (minutes > 0) {
            minutes--;
            secondes = 59;
        }
        else if (heures > 0) {
            heures--;
            minutes = 59;
            secondes = 59;
        }
        else {
            res = false;
        }
        return res;
    }
    public static void main(String[] args) {
        Chrono chrono = new Chrono();
        while(chrono.rebours()) {
            System.out.println("yes");
        }
        System.out.println("Fin du cours");
    }
}
