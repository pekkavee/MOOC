
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit testata luokkaasi täällä
Hajautustaulu h = new Hajautustaulu();
Pari p = new Pari(1,1);
h.lisaa(p);
        System.out.println(h.hae(1));
    }

}
