
import java.nio.file.Paths;
import java.util.Scanner;

public class KysytynTiedostonTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Minkä tiedoston sisältö tulostetaan?");
        String name = lukija.nextLine();
        
        try (Scanner tiedostonLukija = new Scanner(Paths.get(name))) {

        // luetaan tiedostoja kunnes kaikki rivit on luettu
        while (tiedostonLukija.hasNextLine()) {
            // luetaan yksi rivi
            String rivi = tiedostonLukija.nextLine();
            // tulostetaan luettu rivi
            System.out.println(rivi);
        }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        

    }
}
