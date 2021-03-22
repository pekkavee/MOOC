
import java.util.Scanner;

public class Tunnussana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        
        String tunnusSana = "Caput Draconis";

        System.out.println("Tunnussana?");
        String sana = lukija.nextLine();
        if (sana.equals(tunnusSana)){
            System.out.println("Tervetuloa!");
        } else {
            System.out.println("Hus siitä!");
        }
    }
}
