
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mihin asti?");
        int luku = Integer.valueOf(lukija.nextLine());
        System.out.println("Mistä lähtien?");
        int lukuMista = Integer.valueOf(lukija.nextLine());
        
        for (int i = lukuMista; i <= luku; i++) {
            System.out.println(i);
            
        }
            // KIRJOITA OHJELMASI TÄNNE
    }
}
