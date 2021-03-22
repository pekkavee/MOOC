
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna tunnus:");
        String tunnus = lukija.nextLine();
        System.out.println("Anna salasana:");
        String salaSana = lukija.nextLine();
       
        if (tunnus.equals("aleksi") && salaSana.equals("tappara")) {
            System.out.println("Olet kirjautunut järjestelmään");
        } else if (tunnus.equals("elina") && salaSana.equals("kissa")) {
            System.out.println("Olet kirjautunut järjestelmään");
        } else {
            System.out.println("Virheellinen tunnus tai salasana!");
        }
        

    }
}
