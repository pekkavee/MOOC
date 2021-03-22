
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Tehtavalista lista = new Tehtavalista();
        Scanner lukija = new Scanner(System.in);

        Kayttoliittyma liittyma = new Kayttoliittyma(lista, lukija);
        liittyma.kaynnista();

    }
}
