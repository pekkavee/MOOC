
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku = Integer.valueOf(lukija.nextLine());
        int lukuKaksi = Integer.valueOf(lukija.nextLine());
        int summa = luku+lukuKaksi;
        
        double neliojuuri= Math.sqrt(summa);
        
        System.out.println(neliojuuri);
        
        
    }
}
