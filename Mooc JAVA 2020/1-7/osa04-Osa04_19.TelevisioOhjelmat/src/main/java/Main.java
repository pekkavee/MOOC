
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa TelevisioOhjelma käyttävä ohjelmasi tänne

        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
            while (true){
            System.out.println("Nimi:");
            String etunimi = lukija.nextLine();
            if (etunimi.equals("")) {
                break;
            }
            System.out.println("Pituus:");
            String pituus = lukija.nextLine();
            
            TelevisioOhjelma tv = new TelevisioOhjelma(etunimi, Integer.parseInt(pituus));
            ohjelmat.add(tv);
         
        }
            
        System.out.println("Maksimipituus?");
        int maksPit =Integer.valueOf(lukija.nextLine());
        for (TelevisioOhjelma televisioOhjelma : ohjelmat) {
            if (televisioOhjelma.getPituus()<=maksPit) {
                System.out.println(televisioOhjelma);
            }
            
        }

    }
}
