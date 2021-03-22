
import java.util.HashMap;

/*
public static void tulostaAvaimet(HashMap<String, String> hajautustaulu), joka tulostaa parametrina annetun hajautustaulun avaimet.
public static void tulostaAvaimetJoissa(HashMap<String, String> hajautustaulu, String merkkijono), joka tulostaa parametrina annetun hajautustaulun avaimista ne, jotka sisältävät parametrina annetun merkkijonon.
public static void tulostaArvotJosAvaimessa(HashMap<String, String> hajautustaulu, String merkkijono), joka tulostaa parametrina annetun hajautustaulun ne arvot, joihin liittyvät avaimet sisältävät parametrina annetun merkkijonon.

*/

public class Ohjelma {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
        
HashMap<String, String> hm = new HashMap<>();
hm.put("abcd", "jkl");
hm.put("def", "mno");
hm.put("ghi", "pqr");
tulostaArvotJosAvaimessa(hm, "a");
    }
    
    public static void tulostaAvaimet(HashMap<String, String> hajautustaulu) {
        
        for (String eka : hajautustaulu.keySet()) {
            System.out.println(eka);
            
        }
        
    }
    public static void tulostaAvaimetJoissa(HashMap<String, String> hajautustaulu, String merkkijono) {
        
        
        for (String eka : hajautustaulu.keySet()) {
            if (eka.contains(merkkijono)) {
                System.out.println(eka);
            }
            
        }
        
    }
    public static void tulostaArvotJosAvaimessa(HashMap<String, String> hajautustaulu, String merkkijono) {
        
        for (String eka : hajautustaulu.keySet()) {
            //System.out.println(merkkijono);
            //System.out.println(eka);
            if (eka.replaceAll("\\s+","").contains(merkkijono)) {
                System.out.println(hajautustaulu.get(eka));
            }
            }
            
        }
        
    }


