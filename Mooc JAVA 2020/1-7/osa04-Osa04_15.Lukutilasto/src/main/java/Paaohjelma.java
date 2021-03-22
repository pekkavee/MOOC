
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit tehdä testikoodia tänne
        // poista kaikki ylimääräinen koodi kuitenkin tehtävän viimeisiä osia tehdessäsi

        // Jotta testi toimisi, on oliot luotava pääohjelmassa oikeassa järjestyksessä 
        //  eli ensin kaikkien summan laskeva olio, toisena parillisten summan laskeva 
        //  ja viimeisenä parittomien summan laskeva olio)!
        Lukutilasto LukuLuke =new Lukutilasto();
        Lukutilasto LukuLukeParil =new Lukutilasto();
        Lukutilasto LukuLukeParit =new Lukutilasto();
        
        System.out.println("Anna lukuja:");
        while(true) {
            int luku =Integer.valueOf(lukija.nextLine());
            if (luku==-1) {
                break;
            }
            LukuLuke.lisaaLuku(luku);
            if (luku%2==0) {
                LukuLukeParil.lisaaLuku(luku);
            } else {
                LukuLukeParit.lisaaLuku(luku);
            }
        }
        
        System.out.println("Summa: "+LukuLuke.summa());
        System.out.println("Parillisten umma: "+LukuLukeParil.summa());
        System.out.println("Parittomien summa: "+LukuLukeParit.summa());
    }
}
