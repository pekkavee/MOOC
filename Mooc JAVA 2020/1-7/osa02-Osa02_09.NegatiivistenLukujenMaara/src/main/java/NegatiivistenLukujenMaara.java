
import java.util.Scanner;

public class NegatiivistenLukujenMaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lukuja =0;
        
        while (true) {
            System.out.println("Syötä luku");
            int syote = Integer.valueOf(lukija.nextLine());
            if (syote==0) {
                break;
            } else if (syote <0){
                lukuja++;
            }
        }
        System.out.println("Negatiivisia lukuja yhteensä " +lukuja);
    }
}
