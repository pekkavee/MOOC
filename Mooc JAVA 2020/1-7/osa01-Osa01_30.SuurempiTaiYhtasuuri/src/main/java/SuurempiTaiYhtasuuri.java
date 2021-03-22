
import java.util.Scanner;

public class SuurempiTaiYhtasuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna ensimmäinen luku:");
        int luku = Integer.valueOf(lukija.nextLine());
        System.out.println("Anna toinen luku:");
        int lukuToinen = Integer.valueOf(lukija.nextLine());
        
        if (luku>lukuToinen) {
            System.out.println("Suurempi luku: "+luku);
        } else if (luku==lukuToinen) {
            System.out.println("Luvut ovat yhtä suuret!");
        } else {
            System.out.println("Suurempi luku: "+lukuToinen);
        }
    }
}