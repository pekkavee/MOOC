
import java.util.Scanner;

public class TietoaLuvuista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int luku = Integer.valueOf(lukija.nextLine());
        int lukuKaksi = Integer.valueOf(lukija.nextLine());
        
        if (luku==lukuKaksi){
            System.out.println("Luku "+luku+"on yhtä suuri kuin luku "+lukuKaksi+".");
        } else if (luku > lukuKaksi) {
            System.out.println("Luku "+luku+"on suurempi kuin luku "+lukuKaksi+".");
        } else {
            System.out.println("Luku "+luku+"on pienempi kuin luku "+lukuKaksi+".");
        }

    }
}
