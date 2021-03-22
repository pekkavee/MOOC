
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Urheilutilastot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        System.out.println("Minkä nimisen joukkueen tiedot tulostetaan?");
        String joukkue = lukija.nextLine();
        int lkm=0;
        int voittoja =0;
        int tappioita=0;
        
        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {

        // luetaan kaikki tiedoston rivit
        while (tiedostonLukija.hasNextLine()) {
            String rivi = tiedostonLukija.nextLine();
            String []tiedot = rivi.split(",");
            
            

            // mikäli rivi on tyhjä, ei käsitellä sitä
            if (rivi.isEmpty()) {
                continue;
            }
            
            if (tiedot[0].equals(joukkue) || tiedot[1].equals(joukkue)) {
                lkm++;
            }
            
            int ekaTulos = Integer.valueOf(tiedot[2]);
            int tokaTulos= Integer.valueOf(tiedot[3]);
            
            String jengi = tiedot[0];
            String jengiKaksi =tiedot[1];
            
            if (joukkue.equals(jengi)) {
                if (ekaTulos>tokaTulos) {
                    voittoja++;
                } else {
                    tappioita++;
                }
                
            } else if (joukkue.equals(jengiKaksi)) {
                if (tokaTulos>ekaTulos) {
                    voittoja++;
                } else {
                    tappioita++;
                }
            }
            
            

        // tehdään jotain tiedolla

        }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        
        System.out.println("Otteluita: "+lkm);
        System.out.println("Voittoja: "+voittoja);
        System.out.println("Tappioita: "+tappioita);

    }
}

