
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> syotteet = new ArrayList<>();

        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");
        while(true) {
            
            String komento = lukija.nextLine();
            
            if(komento.equals("loppu")) {
                break;
            }
            
            int luku=Integer.valueOf(komento);
            
            syotteet.add(komento);
            
            
            
        }
        
        long parillistenLukumaara = syotteet.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .filter(luku -> luku % 2 == 0)
        .count();
        
         long parillistenSumma = syotteet.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .filter(luku -> luku % 2 == 0)
        .sum();
         
         long parittomienLukumaara = syotteet.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .filter(luku -> luku % 2 != 0)
        .count();
        
         long parittomienSumma = syotteet.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .filter(luku -> luku % 2 != 0)
        .sum();
         
        OptionalDouble negKa = syotteet.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .filter(luku -> luku < 0)
        .average(); 
        
        OptionalDouble posKa = syotteet.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .filter(luku -> luku >= 0)
        .average(); 
         
         System.out.println("Tulostetaanko negatiivisten vai positiivisten lukujen keskiarvo? (n/p)");
         
         String asfsa= lukija.nextLine();
         
         if (asfsa.equals("n")) {
             System.out.println("Negatiivisten lukujen keskiarvo: "+negKa.getAsDouble());
         } else {
             System.out.println("Positiivisten lukujen keskiarvo: "+posKa.getAsDouble());
         }
    
    }
}
