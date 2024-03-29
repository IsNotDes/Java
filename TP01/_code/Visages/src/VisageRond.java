package TP01._code.Visages.src;
import java.awt.Graphics;

public class VisageRond {
    public static final int LARGEUR_MIN = 15;
    public static final int HAUTEUR_MIN = 15;
    private Dessin d;
    private int xhg = 0;
    private int yhg = 0;
    private int largeur = 50;
    private int hauteur = 50;
    private int dx = 5;
    private int dy = 5;
    public VisageRond(int xg, int yg) {
         xhg = xg;
         yhg = yg;
    }
    public VisageRond(int xg, int yg, int larg, int haut){
         xhg = xg;
         yhg = yg;
         largeur = Math.max(larg, LARGEUR_MIN);
         hauteur = Math.max(haut, HAUTEUR_MIN);
    }
    public int getDx() {
        return dx;
    }
    public void setDx(int v) {
        this.dx = v;
    }
    public int getDy() {
        return dy;
    }
    public void setDy(int v) {
        this.dy = v;
    }
    public void inverserDx() {
        dx = -dx;
    }
    public void inverserDy() {
        dy = -dy;
    }
    public void inverserDxEtDy() {
        dx = -dx;
        dy = -dy;
    }
    public void deplacer() {
        xhg += dx;
        yhg += dy;
    }
    public boolean bordGaucheAtteint() {
        return (xhg < 0);
    }
    public boolean bordDroitAtteint() {
        return ((xhg + largeur) > d.getLargeur());
    }
    public boolean bordHautAtteint() {
        return (yhg < 0);
    }
    public boolean bordBasAtteint() {
        return ((yhg + hauteur) >= d.getHauteur());
    }
    public boolean bordAtteint() {
        return  bordDroitAtteint() || bordGaucheAtteint() || bordHautAtteint() || bordBasAtteint();
    }
    public void setDessin(Dessin d) {
        this.d = d;
    }
    public void dessiner(Graphics g){
        g.drawOval(xhg, yhg, largeur, hauteur);
        g.drawLine(xhg + largeur / 4, yhg + (2*hauteur)/3, xhg + (3*largeur)/4, yhg + (2*hauteur)/3);
        int largeurOeil = largeur / 5;
        int hauteurOeil = hauteur / 5;
        g.drawOval(xhg + largeurOeil, yhg + hauteurOeil, largeurOeil, hauteurOeil);
        g.drawOval(xhg + 3 * largeurOeil, yhg + hauteurOeil, largeurOeil, hauteurOeil);
	}  
}