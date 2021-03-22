
import java.util.Scanner;

public class Viesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kirjoita merkkijono!");
        String palautettu = lukija.nextLine();
        System.out.println(palautettu);
    }
}
