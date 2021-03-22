
import java.util.HashMap;

/*
public static void tulostaArvot(HashMap<String, Kirja> hajautustaulu), joka tulostaa parametrina annetun hajautustaulun arvot niiden toString-metodia käyttäen.
public static void tulostaArvoJosNimessa(HashMap<String, Kirja> hajautustaulu, String merkkijono), joka tulostaa parametrina annetun hajautustaulun arvoista ne, joiden nimessä on parametrina annettu merkkijono. Nimen saa selville kirjan metodilla getNimi
*/

public class Ohjelma {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
        HashMap<String, Kirja> taulu = new HashMap<>();
        taulu.put("tunteet", new Kirja("Järki ja tunteet", 1811, "..."));
        taulu.put("luulot", new Kirja("Ylpeys ja ennakkoluulo", 1813, "...."));

        tulostaArvot(taulu);
        System.out.println("---");
        tulostaArvoJosNimessa(taulu, "ennakko");
    }
    public static void tulostaArvot(HashMap<String, Kirja> hajautustaulu) {
        for (Kirja arvo : hajautustaulu.values()) {
            System.out.println(arvo);
        }
        
        
    }
    public static void tulostaArvoJosNimessa(HashMap<String, Kirja> hajautustaulu, String merkkijono) {
        for (Kirja arvo : hajautustaulu.values()) {
            if (arvo.getNimi().contains(merkkijono)) {
                System.out.println(arvo);
            }
        }
    }
   //( public static void tulostaArvoJosNimessa(HashMap<String, Kirja> hajautustaulu {
        
        
   // }

}
