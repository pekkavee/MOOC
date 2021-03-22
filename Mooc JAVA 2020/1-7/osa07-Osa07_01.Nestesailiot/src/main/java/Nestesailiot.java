
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int ensimmainen =0;
        int toinen = 0;


        while (true) {
            System.out.println("Ensimmainen: "+ensimmainen +"/100");
            System.out.println("Toinen: "+toinen +"/100");

            String luettu = lukija.nextLine();
            String[] osat = luettu.split(" ");
            String eka =osat[0];
           // System.out.println(eka);
            if (luettu.contains("lopeta")) {
                break;
            }
            else if (eka.contains("lisaa")) {
                
                int maara = Integer.valueOf(osat[1]);
                if (maara<0) {
                    maara=0;
                }
                
                if (ensimmainen+maara<=100) {
                    ensimmainen+=maara;
                } else {
                  /*  
                    int yli =(ensimmainen+maara)-100;
                   // System.out.println(yli);
                    if (toinen+yli<=100) {
                        toinen+=yli;
                        ensimmainen =100;
                    } else {
                        toinen=100;
                        ensimmainen=100;
                    }*/
                  ensimmainen=100;
                }
            } else if (eka.contains("siirra")) {
                int maara2 = Integer.valueOf(osat[1]);
                //ensimmainen =ensimmainen-maara2;
                if (ensimmainen<maara2) {
                    maara2=ensimmainen;
                }
                if (ensimmainen<0 ) {
                    ensimmainen=0;
                }
                 ensimmainen =ensimmainen-maara2;
                toinen = toinen+maara2;
                if (toinen>100) {
                    toinen=100;
                }
            } else if (eka.contains("poista")) {
                int maara3 = Integer.valueOf(osat[1]);
                toinen-=maara3;
                if (toinen<0){
                    toinen=0;
                }
            } 

        }
    }

}
