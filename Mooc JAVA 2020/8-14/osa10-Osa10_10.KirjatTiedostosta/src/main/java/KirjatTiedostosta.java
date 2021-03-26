
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class KirjatTiedostosta {
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // testaa metodia täällä
        String tiedosto = lukija.nextLine();
        lueKirjat(tiedosto);

    }
    public static List<Kirja> lueKirjat(String tiedosto) {
                try {
            return Files.lines(Paths.get(tiedosto))
                    .map(rivi -> rivi.split(","))
                    .map(palat -> new Kirja(palat[0], Integer.valueOf(palat[1]), Integer.valueOf(palat[2]), palat[3]))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        
        return new ArrayList<>();
    }
    
   
        /*
        List<String> rivit = new ArrayList<>();
        List<Kirja> kirjat = new ArrayList<>();
        try {
            Files.lines(Paths.get(tiedosto)).forEach(rivi -> rivit.add(rivi));
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
          rivit.stream()
                .map(rivi -> rivi.split(","))
                .map(palat -> new Kirja(palat[0], Integer.valueOf(palat[1]),Integer.valueOf(palat[2]),palat[3]))
                .forEach(kirja -> kirjat.add(kirja));
          
          return kirjat;
                
    } */
        

}
