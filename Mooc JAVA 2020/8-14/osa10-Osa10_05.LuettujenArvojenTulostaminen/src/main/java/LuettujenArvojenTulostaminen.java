
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuettujenArvojenTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<String> syotteet = new ArrayList<>();

        // luetaan syotteet
        while (true) {
            String rivi = lukija.nextLine();
            if (rivi.equals("")) {
                break;
            }

            syotteet.add(rivi);
        }
    
    syotteet.stream()
    
    .forEach(luku -> System.out.println(luku));
    }
    
}
