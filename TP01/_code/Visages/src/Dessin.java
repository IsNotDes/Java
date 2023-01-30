import java.awt.*;
import java.util.*;

public class Dessin extends Canvas {
	private static final long serialVersionUID = 6735831829715194549L;
	private Dimension offDimension;
   private Image offImage;
   private Graphics offGraphics = null;
   private Vector<VisageRond> listeDesVisages = new Vector<VisageRond>();
   public int getLargeur(){return getWidth();}
   public int getHauteur(){return getHeight();}
   public void ajouterObjet(VisageRond v) {
  	   if (! listeDesVisages.contains(v)) {
  		   listeDesVisages.add(v);
  		   v.setDessin(this);
  		   repaint();
  	 }
	}
   public void pause(int duree){
  	   try {
  		   Thread.sleep(duree);
  	   } catch (Exception e) {}
	}
   /**
    * rafraichissement de la zone de dessin.
    * @param g le contexte graphique
    */
   public void update(Graphics g){
  	 Dimension d = getSize();
  	 if ((offGraphics == null) || (d.width != offDimension.width) || (d.height != offDimension.height)){
  		 offDimension = d;
  		 offImage = createImage(d.width, d.height);
  		 offGraphics = offImage.getGraphics();
  	 }
  	 offGraphics.setColor(getBackground());
  	 offGraphics.fillRect(0, 0, d.width, d.height);
  	 offGraphics.setColor(getForeground());
  	 dessinerLesVisages(offGraphics);
  	 g.drawImage(offImage, 0, 0, this);
	}
   /**
    * Parcourt la liste des Visages pour afficher chacun d'eux.
    * @param g le contexte graphique
    */
  private void dessinerLesVisages(Graphics g){ 
  	 for(VisageRond v : listeDesVisages) {v.dessiner(g);}
	}
} // Dessin
