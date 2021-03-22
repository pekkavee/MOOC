
public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] luvut = {8, 3, 7, 9, 1, 2, 4};
Paaohjelma.jarjesta(luvut);
    }
    
    public static int pienin(int[] taulukko) {
        int pienin=taulukko[0];
        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i]<pienin) {
                pienin=taulukko[i];
            }
            
        }
        return pienin;
    }
        public static int pienin(int[] taulukko, int aloitus) {
        int pienin=taulukko[aloitus];
        for (int i = aloitus; i < taulukko.length; i++) {
            if (taulukko[i]<pienin) {
                pienin=taulukko[i];
            }
            
        }
        return pienin;
    }
    public static int pienimmanIndeksi(int[] taulukko) {
        int pienin = pienin(taulukko);
        
        int indeksi=0;
        for (int i = 0; i < taulukko.length; i++) {
            if (pienin==taulukko[i]) {
                indeksi=i;
            }
            
        }
        return indeksi;
    // kirjoita koodia tähän
    }
    
   public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
    // kirjoita koodia tähän
     int pienin = pienin(taulukko, aloitusIndeksi);
        
        int indeksi=aloitusIndeksi;
        for (int i = indeksi; i < taulukko.length; i++) {
            if (pienin==taulukko[i]) {
                indeksi=i;
            }
            
        }
        return indeksi;
    }
    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
    // kirjoita koodia tähän
        int eka = taulukko[indeksi1];
        int toka =taulukko[indeksi2];
        taulukko[indeksi1]=toka;
        taulukko[indeksi2]=eka;
    }
    public static void jarjesta(int[] taulukko) {
        for (int i = 0; i < taulukko.length; i++) {
            int pienin = pienimmanIndeksiAlkaen(taulukko, i);
            vaihda(taulukko, pienin, i);
           
            
        }
       

    }
}
