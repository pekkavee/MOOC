
public class Tulostelua {

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
     //   tulostaTahtia(1);
      //  System.out.println("\n---");  // tulostetaan kuvioiden välille ---
   
        tulostaKolmio(3);
        System.out.println("\n---");
    }

    public static void tulostaTahtia(int maara) {
        for (int i = 0; i < maara; i++) {
            System.out.print("*");
            
        }
        System.out.println("");
    }

    public static void tulostaNelio(int sivunpituus) {
        // tehtävän toinen osa
        for (int i = 0; i < sivunpituus; i++) {
            tulostaTahtia(sivunpituus);
            
        }
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        // tehtävän kolmas osa
        for (int i = 0; i < korkeus; i++) {
            tulostaTahtia(leveys);
            
        }
    }

    public static void tulostaKolmio(int koko) {
        // tehtävän neljäs osa
        for (int i = 1; i <= koko; i++) {
            tulostaTahtia(i);
        }
    }
}
