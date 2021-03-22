
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while(true) {
            String sana =lukija.nextLine();
            if (sana.equals("")) {
                break;
            }
            String sanat[]=sana.split(" ");
            
            for (String i : sanat) {
                System.out.println(i);
                
            }
        }
    }
}
