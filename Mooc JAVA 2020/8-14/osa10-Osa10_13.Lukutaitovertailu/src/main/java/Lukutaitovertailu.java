
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lukutaitovertailu {
    
    public static void main(String[] args) {
        List<Maa> maat = new ArrayList();
        String lukutait = "lukutaito.csv";
        maat=lue(lukutait);
        
        Collections.sort(maat);
        
        
        
        for (Maa maa : maat) {
            System.out.println(maa.toString());
        }

    }
    
    public static List<Maa> lue(String tiedosto) {
                try {
            return Files.lines(Paths.get(tiedosto))
                    .map(rivi -> rivi.split(","))
                    .map(palat -> new Maa(palat[2].trim(), (palat[3]).trim(), Integer.valueOf(palat[4]),Double.valueOf(palat[5]) ))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        
        return new ArrayList<>();
    }
    
}
