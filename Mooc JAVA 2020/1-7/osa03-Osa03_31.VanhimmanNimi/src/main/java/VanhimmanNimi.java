
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int vanhin=0;
        String nimi="";
        while(true) {
            String sana =lukija.nextLine();
            if (sana.equals("")) {
                break;
            }
            String sanat[]=sana.split(",");
            
            if(Integer.parseInt(sanat[1])>=vanhin) {
                vanhin=Integer.parseInt(sanat[1]);
                nimi=sanat[0];
                
            }
        }
        System.out.println("Vanhimman nimi: "+nimi);


    }
}
