
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        String pisinNimi="";
        int yht=0;
        int maara=0;
        while(true) {
            String sana =lukija.nextLine();
            if (sana.equals("")) {
                break;
            }
            String sanat[]=sana.split(",");
            
            if(sanat[0].length()>pisinNimi.length()) {
                pisinNimi=sanat[0];
            }
            yht=yht+Integer.parseInt(sanat[1]);
            maara++;
        }
        System.out.println("Pisin nimi: "+pisinNimi);
        System.out.println("Syntymävuosien keskiarvo: " +(1.0*yht/maara));

    }
}
