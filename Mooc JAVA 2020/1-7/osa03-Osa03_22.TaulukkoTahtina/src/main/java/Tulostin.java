
public class Tulostin {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 5};
        tulostaTaulukkoTahtina(taulukko);
    }

    public static void tulostaTaulukkoTahtina(int[] taulukko) {
        // Kirjoita tulostuskoodi tänne
        for (int i : taulukko) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
            
        }
    }

}
