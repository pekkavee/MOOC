
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        ArrayList<Kirja> kirjat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        while (true){
            System.out.println("Nimi:");
            String nimi = lukija.nextLine();
            if (nimi.equals("")) {
                break;
            }
            System.out.println("Sivuja:");
            int sivuja = Integer.valueOf(lukija.nextLine());
            System.out.println("Julkaisuvuosi:");
            int vuosi = Integer.valueOf(lukija.nextLine());
            
            
            Kirja esim =new Kirja(nimi,sivuja,vuosi);
            kirjat.add(esim);
        }
        
        System.out.println("Mitä tulostetaan?");
        String vastaus = lukija.nextLine();
        
        for (Kirja kirja : kirjat) {
            
       
        
        if (vastaus.equals("kaikki")) {
            System.out.println(kirja);
        } else {
            System.out.println(kirja.getNimi());
        }
        
        }
        
       
    }
}
