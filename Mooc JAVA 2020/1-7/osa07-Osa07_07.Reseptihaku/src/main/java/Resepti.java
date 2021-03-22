
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Resepti {
    private String nimi;
    private String keittoaika;
    private ArrayList<String> ainekset;

    public Resepti(String nimi, String keittoaika, ArrayList<String> ainekset) {
        this.nimi = nimi;
        this.keittoaika = keittoaika;
        this.ainekset = ainekset;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getKeittoaika() {
        return keittoaika;
    }

    public void setKeittoaika(String keittoaika) {
        this.keittoaika = keittoaika;
    }

    public ArrayList<String> getAinekset() {
        return ainekset;
    }

    public void setAinekset(ArrayList<String> ainekset) {
        this.ainekset = ainekset;
    }

    @Override
    public String toString() {
        return "Resepti{" + "nimi=" + nimi + ", keittoaika=" + keittoaika + ", ainekset=" + ainekset + '}';
    }
    
    
    
}
