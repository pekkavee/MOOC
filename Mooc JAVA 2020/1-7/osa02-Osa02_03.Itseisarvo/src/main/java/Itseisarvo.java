
import java.util.Scanner;

public class Itseisarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku = Integer.valueOf(lukija.nextLine());
        System.out.println(Math.abs(luku));
    }
}
