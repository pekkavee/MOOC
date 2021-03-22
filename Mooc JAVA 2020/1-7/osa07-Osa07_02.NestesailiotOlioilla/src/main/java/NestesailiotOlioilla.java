
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int ensimmainen =0;
        int toinen = 0;
        
        Sailio yksi = new Sailio();
        Sailio kaksi = new Sailio();

      while (true) {
            System.out.println("Ensimmainen: "+yksi.sisalto() +"/100");
            System.out.println("Toinen: "+kaksi.sisalto() +"/100");

            String luettu = lukija.nextLine();
            String[] osat = luettu.split(" ");
            String eka =osat[0];
           // System.out.println(eka);
            if (luettu.contains("lopeta")) {
                break;
            }
            else if (eka.contains("lisaa")) {
                int maara = Integer.valueOf(osat[1]);
                yksi.lisaa(maara);
            } else if (eka.contains("siirra")) {
                int maara2 = Integer.valueOf(osat[1]);
                if (yksi.sisalto()>=maara2) {
                                 
                yksi.poista(maara2);
                kaksi.lisaa(maara2);
                } else {
                   kaksi.lisaa(yksi.sisalto());
                   yksi.poista(maara2);
                }
            } else if (eka.contains("poista")) {
                int maara3 = Integer.valueOf(osat[1]);
                kaksi.poista(maara3);
            }
      }
    }
}


    
   
