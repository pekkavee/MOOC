
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        
        while(true) {
            String komento = lukija.nextLine();
            
            if (komento.equals("loppu")) {
                break;
            } else {
                int luku = Integer.valueOf(komento);
                
                System.out.println(luku*luku*luku);
                
                
            }
           
            
        }

    }
}
