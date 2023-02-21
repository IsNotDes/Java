public class Manuel extends Livre {
    int niveauScolaire;

    public Manuel(int ne, String n, String a, int np, int ns) {
        super(ne, n, a, np);
        niveauScolaire = ns;
    }

    public String toString() {
        return(super.toString()+" niveau "+niveauScolaire);
    }
}
