
import java.util.ArrayList;
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        int yht=0;
        int lkm=0;
        double ka=0.0;
        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");
        while(true) {
            
            String komento = lukija.nextLine();
            
            if(komento.equals("loppu")) {
                break;
            }
            
            int luku=Integer.valueOf(komento);
            yht+=luku;
            lkm++;
            
            
            
        }
        ka=1.0*yht/lkm;
        System.out.println("Lukujen keskiarvo: "+ka);
        
    }
}
