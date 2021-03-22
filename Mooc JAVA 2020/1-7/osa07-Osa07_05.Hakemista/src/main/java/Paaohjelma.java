
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // Alla on ohjelma tehtävässä toteuttamiesi hakualgoritmien testaamiseen.
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> kirjat = new ArrayList<>();
       System.out.println("Kuinka monta kirjaa luodaan?");
        int kirjoja = Integer.valueOf(lukija.nextLine());
        for (int i = 0; i < kirjoja; i++) {
            kirjat.add(new Kirja(i, "nimi kirjalle " + i));
        }

     // kirjat.add(new Kirja(828692, "828692"));
        System.out.println("Millä tunnuksella haetaan kirjaa?");
        int haettava = Integer.valueOf(lukija.nextLine());

        System.out.println("");
        System.out.println("Haetaan peräkkäishaulla:");
        long alku = System.currentTimeMillis();
        int perakkaishakuId = perakkaishaku(kirjat, haettava);
        System.out.println("Haku kesti " + (System.currentTimeMillis() - alku) + " millisekuntia.");
        if (perakkaishakuId < 0) {
            System.out.println("Ei löytynyt.");
        } else {
            System.out.println("Löytyi! " + kirjat.get(perakkaishakuId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Haetaan binäärihaulla:");
        alku = System.currentTimeMillis();
        int binaarihakuId = binaarihaku(kirjat, haettava);
        System.out.println("Haku kesti " + (System.currentTimeMillis() - alku) + " millisekuntia.");
        if (binaarihakuId < 0) {
            System.out.println("Ei löytynyt.");
        } else {
            System.out.println("Löytyi! " + kirjat.get(binaarihakuId));
        }

    }

    public static int perakkaishaku(ArrayList<Kirja> kirjat, int haettavaId) {
         int indeksi =-1;
         
         for (Kirja kirja : kirjat) {
             indeksi++;
             if (kirja.getId()==haettavaId) {
                 return indeksi;
             }
                 
            
        }
         return -1;
         
    }
    
        
    

    public static int binaarihaku(ArrayList<Kirja> kirjat, long haettavaId) {
        // oletetaan, että käytössä on muuttuja haettava
// oletetaan, että käytössä on muuttuja lista
        int alku = 0; // listan nollas indeksi
        int loppu = kirjat.size() - 1; // listan viimeinen indeksi

    //toista kunnes alku on suurempi kuin loppu:
    while (alku<=loppu) {
    int keski = (loppu + alku) / 2;
       // System.out.println(kirjat.get(keski).getId());
    if (kirjat.get(keski).getId()==haettavaId) {
       
    
        return keski;
        
    }
    if (kirjat.get(keski).getId()<haettavaId) {
        alku=keski+1;
    } else if (kirjat.get(keski).getId()>haettavaId){
        loppu = keski - 1;
    }

    }


        return -1;
    }
}

