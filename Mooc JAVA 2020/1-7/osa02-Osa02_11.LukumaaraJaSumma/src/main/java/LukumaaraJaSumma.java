
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa=0;
        int lkm =0;
        while (true) {
            System.out.println("Syötä luku");
            int syote = Integer.valueOf(lukija.nextLine());
            if (syote==0) {
                break;
            } else {
                summa=summa+syote;
                lkm++;
            }
        }
        System.out.println("Lukuja yhteensä " +lkm);
        System.out.println("Lukujen summa " +summa);
    }
}
