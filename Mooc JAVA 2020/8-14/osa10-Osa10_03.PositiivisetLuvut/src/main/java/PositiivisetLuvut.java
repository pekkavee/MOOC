
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiivisetLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // testaa metodia täällä
        List<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(7);
        lista.add(4);
        lista.add(2);
        lista.add(6);

    }
    public static List<Integer> positiiviset(List<Integer> luvut) {
        ArrayList<Integer> luvutPos = luvut.stream()
        .filter(luku -> luku >=0)
       // .map(luku -> luku * 2)
        .collect(Collectors.toCollection(ArrayList::new));
        
        return luvutPos;
    }

}
