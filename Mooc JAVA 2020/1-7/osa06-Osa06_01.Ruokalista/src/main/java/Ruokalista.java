
import java.util.ArrayList;

public class Ruokalista {

    private ArrayList<String> ateriat;

    public Ruokalista() {
        this.ateriat = new ArrayList<>();
    }
    
    public void lisaaAteria(String ateria) {
        if (!this.ateriat.contains(ateria)) {
            this.ateriat.add(ateria);
        }
        
    }
    public void tulostaAteriat() {
        for (String string : this.ateriat) {
            System.out.println(string);
            
        }
    }
    public void tyhjennaRuokalista() {
        this.ateriat.clear();
    }
    // toteuta tänne tarvittavat metodit
}
