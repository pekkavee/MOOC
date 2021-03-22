
import java.nio.file.Paths;
import java.util.Scanner;

public class TiedotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Mikä tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();
        
        // luodaan lukija tiedoston lukemista varten
    try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {

    // luetaan kaikki tiedoston rivit
        while (tiedostonLukija.hasNextLine()) {
            String rivi = tiedostonLukija.nextLine();
            String[] palat = rivi.split(",");
            String nimi = palat[0];
            int ika = Integer.valueOf(palat[1]);
            String vuosi=" vuotta";
            if (ika==1) {
                vuosi=" vuosi";
                
            }

            System.out.print(nimi+",");
            System.out.print("ikä: " + ika +vuosi);
            System.out.println("");

        // mikäli rivi on tyhjä, ei käsitellä sitä
            if (rivi.isEmpty()) {
                continue;
            }

            // tehdään jotain tiedolla

        }
    } catch (Exception e) {
    System.out.println("Virhe: " + e.getMessage());
    }
        
    }
}
