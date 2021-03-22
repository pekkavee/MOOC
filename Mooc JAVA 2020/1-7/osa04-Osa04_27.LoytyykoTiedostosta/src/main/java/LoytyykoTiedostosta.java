
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();
        

        ArrayList<String> lista = new ArrayList<>();
        boolean loytyi = false;
        // toteuta tiedoston lukeminen tässä.
        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {

    // luetaan kaikki tiedoston rivit
        
        while (tiedostonLukija.hasNextLine()) {
            if (etsittava.equals(tiedostonLukija.nextLine())){
                loytyi = true;
            } 
        }
        } catch (Exception e) {
            System.out.println("Tiedoston " + e.getMessage() +" lukeminen epäonnistui.");
        }
        
        if (loytyi) {
            System.out.println("Löytyi!");
        } else{
            System.out.println("Ei löytynyt");
        }


    }
}
