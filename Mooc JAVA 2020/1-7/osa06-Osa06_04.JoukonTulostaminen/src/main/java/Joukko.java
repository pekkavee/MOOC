
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

    @Override
    public String toString() {
        


        int maara=this.alkiot.size();
        String listString = "Joukossa "+nimi+" on "+maara+" alkiota:";
        if (maara==1) {
            listString = "Joukossa "+nimi+" on "+maara+" alkio:";
        }
        if(maara==0) {
            return "Joukko " +nimi+" on tyhjä." ;
        } else {
            
            for (String string : alkiot) {
                listString +="\n"+ string ;
            }
    

        return listString;
        }
    }



}
