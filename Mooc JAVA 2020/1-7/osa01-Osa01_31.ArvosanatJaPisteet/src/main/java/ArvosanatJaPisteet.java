
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna pisteet [0-100]:");
        int pisteet = Integer.valueOf(lukija.nextLine());
        
        if (pisteet < 0) {
            System.out.println("Arvosana: mahdotonta!");
        } else if (pisteet <50) {
            System.out.println("Arvosana: hylätty");
        } else if (pisteet <60) {
            System.out.println("Arvosana: 1");
        } else if (pisteet <70) {
            System.out.println("Arvosana: 2");
        } else if (pisteet <80) {
            System.out.println("Arvosana: 3");
        } else if (pisteet <90) {
            System.out.println("Arvosana: 4");
        } else if (pisteet <101) {
            System.out.println("Arvosana: 5");
        } else {
            System.out.println("Arvosana: uskomatonta!");
        }
        
    /*    
        < 0	mahdotonta!
0-49	hylätty
50-59	1
60-69	 2
70-79	3
80-89	4
90-100	5
> 100	uskomatonta!
37
Arvosana: hylätty
*/
    }
}
