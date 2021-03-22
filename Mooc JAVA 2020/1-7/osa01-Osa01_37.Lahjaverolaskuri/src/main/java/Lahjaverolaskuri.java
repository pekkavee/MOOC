
import java.util.Scanner;

public class Lahjaverolaskuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Lahjan suuruus?");
        double lahja = Double.valueOf(lukija.nextLine());
        double vero=0.0;
        
        if (lahja <5000) {
            System.out.println("Ei veroa!");
        } else if (lahja <=25000) {
            vero = (lahja-5000)*0.08+100;
            
        } else if (lahja <=55000) {
            vero = (lahja-25000)*0.10+1700;
        } else if (lahja <=200000) {
            vero = (lahja-55000)*0.12+4700;
        } else if (lahja <=1000000) {
            vero = (lahja-200000)*0.15+22100;        
        } else {
            vero = (lahja-1000000)*0.17+142100;  
            
        }
        
        if (lahja >=5000) {
            System.out.println("Vero: "+vero);
        }
        /*
        Lahjan suuruus?
        3500
        Ei veroa!
        
        Vero: 100.0
        
        5 000 — 25 000          100	8
        25 000 — 55 000         1 700	10
        55 000 — 200 000            4 700	12
        200 000 — 1 000 000      22 100	15
        1 000 000 —             142 100	17
        */

    }
}
