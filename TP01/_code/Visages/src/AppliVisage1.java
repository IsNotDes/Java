import javax.swing.JFrame;

public class AppliVisage1 {
	public static void main(String[] args) {
		JFrame laFenetre = new JFrame("VISAGE ANIME");
		laFenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		laFenetre.setSize(512, 512);
		Dessin d = new Dessin();
		laFenetre.add(d);
		laFenetre.setVisible(true);
		VisageRond v1 = new VisageRond();
		d.ajouterObjet(v1);
		while (true) {
			if (v1.bordAtteint())
				v1.inverserDxEtDy();
			v1.deplacer();
			d.repaint();
			d.pause(50);
		}
	}
} 
