
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Ajoneuvorekisteri {

    private HashMap<Rekisterinumero, String> rekkarit; 
    
    public Ajoneuvorekisteri() {
        this.rekkarit = new HashMap<>();
    }
    
    public boolean lisaa(Rekisterinumero rekkari, String omistaja){
        if (!rekkarit.containsKey(rekkari)) {
            rekkarit.put(rekkari, omistaja);
            return true;
        } else {
            return false;
        }
        
    }
    public String hae(Rekisterinumero rekkari) {
        return rekkarit.getOrDefault(rekkari, null);
        
        
    }
    public boolean poista(Rekisterinumero rekkari) {
        if (rekkarit.containsKey(rekkari)) {
            rekkarit.remove(rekkari);
            return true;
        } else {
            return false;
        }
        
    }
    
    public void tulostaOmistajat() {
        ArrayList<String>nimet = new ArrayList<>();
        for (String arvo : rekkarit.values()) {
            if (nimet.contains(arvo)) {
                continue;
            } else {
                System.out.println(arvo);
                nimet.add(arvo);
            }
        }
        
        
    }
    
    public void tulostaRekisterinumerot() {
     
    for (Rekisterinumero arvo : rekkarit.keySet()) {
        System.out.println(arvo.getRekNro());

}
        
        
    }
}
