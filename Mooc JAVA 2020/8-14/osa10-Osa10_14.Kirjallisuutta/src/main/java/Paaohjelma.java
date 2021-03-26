
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Kirja> kirjat = new ArrayList();
        
        Comparator<Kirja> vertailija = Comparator
              .comparing(Kirja::getIka)
              .thenComparing(Kirja::getNimi);
        
        
        
        while (true) {
            
            System.out.println("Syötä kirjan nimi, tyhjä lopettaa: ");
            
            String komento = lukija.nextLine();
            
            if (komento.isEmpty()) {
                break;
            }
            
            System.out.println("Syötä kirjan pienin kohdeikä:");
            
            int ika = Integer.valueOf(lukija.nextLine());
            
            Kirja kirja = new Kirja(komento, ika);
            
            kirjat.add(kirja);
        }
        
        Collections.sort(kirjat, vertailija);
        
        System.out.println("Yhteensä " +kirjat.size()+" kirjaa.");
        System.out.println("");
        System.out.println("Kirjat:");
        for (Kirja kirja : kirjat) {
            System.out.println(kirja);
            
        }
    }

}
