
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while (true){
            
            String nimi = lukija.nextLine();
            if (nimi.equals("loppu")) {
                break;
            }
            int luku =Integer.valueOf(nimi);
            luku = luku*luku*luku;
            System.out.println(luku);

        }

    }
}
