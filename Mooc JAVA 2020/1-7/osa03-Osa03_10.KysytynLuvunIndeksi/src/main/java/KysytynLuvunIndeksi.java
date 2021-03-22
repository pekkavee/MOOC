
import java.util.ArrayList;
import java.util.Scanner;

public class KysytynLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }

        System.out.println("");

        // toteuta tänne toiminnallisuus luvun etsimiseen
        System.out.println("Mitä etsitään?");
        int luku = Integer.valueOf(lukija.nextLine());
        for (int i = 0; i < lista.size(); i++) {
            if(luku==lista.get(i)) {
                System.out.println("Luku "+luku+" on indeksissä "+i);
            }
            
        }
    }
}
