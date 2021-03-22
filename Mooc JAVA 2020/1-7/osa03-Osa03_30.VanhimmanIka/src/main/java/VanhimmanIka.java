
import java.util.Scanner;

public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int vanhin=0;
        while(true) {
            String sana =lukija.nextLine();
            if (sana.equals("")) {
                break;
            }
            String sanat[]=sana.split(",");
            
            if(Integer.parseInt(sanat[1])>vanhin) {
                vanhin=Integer.parseInt(sanat[1]);
            }
        }
        System.out.println("Vanhimman ikä: "+vanhin);

    }
}
