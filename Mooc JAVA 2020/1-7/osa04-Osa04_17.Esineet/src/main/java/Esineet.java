
import java.util.ArrayList;
import java.util.Scanner;

public class Esineet {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Esine> esineet = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true){
            System.out.println("Nimi:");
            String nimi = lukija.nextLine();
            if (nimi.equals("")) {
                break;
            }
            
            Esine esim =new Esine(nimi);
            esineet.add(esim);
        }
        
        for (Esine esine : esineet) {
            System.out.println(esine);
            
        }

    }
}
