
import java.util.Scanner;

public class EnsimmaisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while(true) {
            String sana =lukija.nextLine();
            if (sana.equals("")) {
                break;
            }
            String sanat[]=sana.split(" ");
            
            System.out.println(sanat[0]);
        }
    }
}
