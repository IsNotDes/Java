import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialize1 {

  public static void main(final String argv[]) {
    UneClasse unObjet = new UneClasse("un paramètre");
    ObjectOutputStream oos = null;

    try {
      FileOutputStream fichier = new FileOutputStream("unObjet.ser");
      oos = new ObjectOutputStream(fichier);
      oos.writeObject(unObjet);
      oos.flush();
    } catch (final java.io.IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (oos != null) {
          oos.flush();
          oos.close();
        }
      } catch (final IOException ex) {
        ex.printStackTrace();
      }
    }
  }
}

