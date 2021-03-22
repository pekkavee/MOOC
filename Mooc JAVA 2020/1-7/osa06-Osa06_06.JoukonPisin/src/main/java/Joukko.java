
import java.util.ArrayList;

public class Joukko {

    private String nimi;
    private ArrayList<String> alkiot;

    public Joukko(String nimi) {
        this.nimi = nimi;
        this.alkiot = new ArrayList<>();
    }

    public void lisaa(String alkio) {
        this.alkiot.add(alkio);
    }

    public ArrayList<String> getAlkiot() {
        return this.alkiot;
    }
    public String pisin() {
        int pisin=0;
        String pitka=null;
        for (String string : alkiot) {
            if (string.length()>pisin) {
                pisin=string.length();
                pitka=string;
            }
            
        }
        return pitka;
    }

}
