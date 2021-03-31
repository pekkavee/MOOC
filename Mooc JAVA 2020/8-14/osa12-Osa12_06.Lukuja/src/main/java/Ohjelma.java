
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Montako satunnaislukua tulostetaan?");
        int luku = Integer.valueOf(lukija.nextLine());
        arvoLuvut(luku);
        
        
    }
    public static void arvoLuvut(int maara) {
        Random arpoja = new Random(); // luodaan apuväline arpoja
        
        for (int i = 0; i < maara; i++) {
            int luku = arpoja.nextInt(11);
            System.out.println(luku);
            
        }
        
    }
}
