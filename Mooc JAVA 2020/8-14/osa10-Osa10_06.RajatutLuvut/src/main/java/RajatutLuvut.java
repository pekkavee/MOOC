
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RajatutLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> syotteet = new ArrayList<>();
        
        
        while (true) {
            int rivi = Integer.valueOf(lukija.nextLine());
            
            if (rivi<0) {
                break;
            }

            syotteet.add(rivi);
        }
    
    syotteet.stream()
    .filter(luku -> luku >0)
    .filter(luku -> luku <6)
    .forEach(luku -> System.out.println(luku));
    }
    }

