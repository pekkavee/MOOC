
import java.util.Scanner;

public class YhdestaParametriin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int kertoja=Integer.valueOf(lukija.nextLine());
        
        tulostaLukuunAsti(kertoja);
        
        

    }
    
    public static void tulostaLukuunAsti(int luku) {
        
        for (int i = 1; i <= luku; i++) {
            System.out.println(i);
            
        }
        
        
    }
  

}
