
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lkm=0;
        int summa=0;
        double ka=0.0;

        while (true) {
            
            int luku= Integer.valueOf(lukija.nextLine());
            if (luku==0) {
                break;
            } else if (luku>0) {
                summa+=luku;
                lkm++;
                
            }
            
        }
        
        if(summa==0) {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        } else {
            ka=1.0*summa/lkm;
            System.out.println(ka);
        }
    }
}
