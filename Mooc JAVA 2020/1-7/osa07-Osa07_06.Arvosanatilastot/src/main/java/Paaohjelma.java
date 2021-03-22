
import java.util.ArrayList;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
        int yhteispisteet=0;
        int maara=0;
        int yhtH=0;
        int maaraH=0;
     
        ArrayList<Integer>pisteet=new ArrayList<>();
        
        
        System.out.println("Syötä yhteispisteet, -1 lopettaa:");
        
        while (true) {
            int pistet=Integer.valueOf(lukija.nextLine());
            if (pistet==-1){
                break;
            }
            if (pistet<0 || pistet>100) {
                continue;
            }
            if (pistet>=50 ){
                yhtH+=pistet;
                maaraH++;
            }
            if (pistet<50) {
                pisteet.add(0);
            } else if (pistet<60) {
                pisteet.add(1);
            } else if (pistet<70) {
                pisteet.add(2);
            } else if (pistet<80) {
                pisteet.add(3);
            } else if (pistet<90) {
                pisteet.add(4);
            } else if (pistet<=100) {
                pisteet.add(5);
            }
            yhteispisteet+=pistet;
            maara++;
        }
        double ka = 1.0*yhteispisteet/maara;
        double kaH=0.0;
        double hyPr=0.0;
        if (maaraH>0){
         kaH=1.0*yhtH/maaraH;
         hyPr=100.0*maaraH/maara;
        }
        
       // double 
        System.out.println("Pisteiden keskiarvo (kaikki): "+ka);
        System.out.println("Pisteiden keskiarvo (hyväksytyt): "+kaH);
        System.out.println("Hyväksymisprosentti:  "+hyPr);
        System.out.println("Arvosanajakauma:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i+": ");
            for (Integer integer : pisteet) {
                if (integer==i) {
                    System.out.print("*");
                }
                
            }
            System.out.println("");
            
            
        }
        
    }
}
