
import java.util.ArrayList;
import java.util.Scanner;

public class Henkilotiedot {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Henkilotieto> henkilotiedot = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        while (true){
            System.out.println("Etunimi:");
            String etunimi = lukija.nextLine();
            if (etunimi.equals("")) {
                break;
            }
            System.out.println("Sukunimi:");
            String sukunimi = lukija.nextLine();
            System.out.println("Henkilötunnus:");
            String hlo = lukija.nextLine();
            
            Henkilotieto hloo = new Henkilotieto(etunimi, sukunimi, hlo);
            
            henkilotiedot.add(hloo);
            
         
        }
        
        for (Henkilotieto henkilotieto : henkilotiedot) {
            System.out.print(henkilotieto.getEtunimi()+" "+henkilotieto.getSukunimi());
            System.out.println("");
            
        }
            
        }
    }

