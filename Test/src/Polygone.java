public class Polygone {
  private int lgCôté;
  private int nbDeCôtés;

  public void initialiser(int nombre, int longueur) {
    lgCôté = longueur;
    if (nombre > 2)
      nbDeCôtés = nombre;
    else
      nbDeCôtés = 3;
  }

  public int périmètre() { 
    return lgCôté * nbDeCôtés; 
  }
}
