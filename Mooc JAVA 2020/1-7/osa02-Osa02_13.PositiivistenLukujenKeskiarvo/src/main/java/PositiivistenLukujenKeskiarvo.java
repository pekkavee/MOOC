
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int summa=0;
        int lkm =0;
        while (true) {
          //  System.out.println("Syötä luku");
            int syote = Integer.valueOf(lukija.nextLine());
            if (syote==0) {
                break;
            } else if (syote>0) {
                summa=summa+syote;
                lkm++;
            }
        }
        
        if (lkm==0) {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        } else {
            System.out.println((1.0*summa/lkm));
        }
    }
}
