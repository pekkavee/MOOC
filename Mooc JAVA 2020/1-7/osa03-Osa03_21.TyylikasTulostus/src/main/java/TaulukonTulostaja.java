
public class TaulukonTulostaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        // Kirjoita koodia tänne
        int indeksi=0;
        for (int i : taulukko) {
            System.out.print(i);
            indeksi++;
            if (indeksi!=taulukko.length) {
                System.out.print(",");
            }
          
            
        }
        
    }
}
