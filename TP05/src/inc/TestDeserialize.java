import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserialize {
  public static void main(final String argv[]) {

    ObjectInputStream ois = null;

    try {
      final FileInputStream fichier = new FileInputStream("unObjet.ser");
      ois = new ObjectInputStream(fichier);
      UneClasse unObjet = (UneClasse) ois.readObject();
      System.out.println(unObjet.toString());
      
    } catch (final java.io.IOException e) {
