public class Livre extends Document {
    String auteur;
    int nbPages;

    public Livre(int ne, String n, String a, int np) {
        super(ne,n);
        auteur = a;
        nbPages = np;
    }

    public String toString(){
        return(super.toString()+, "+auteur+" ("+nbPages+" pages));
    }
}