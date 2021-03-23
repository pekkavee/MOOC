
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
public class UseanKaannoksenSanakirja {
    private HashMap<String, ArrayList<String>> kaannokset;

    public UseanKaannoksenSanakirja() {
        this.kaannokset = new HashMap<>();
    }
    public void lisaa(String sana, String kaannos) {
        this.kaannokset.putIfAbsent(sana, new ArrayList<>());

        // haetaan ensin käyttäjän tehtävät sisältävä lista ja tehdään siihen lisäys
        ArrayList<String> sanat = this.kaannokset.get(sana);
       // tehdyt.add(tehtava);
       sanat.add(kaannos);
    }        
    public ArrayList<String> kaanna(String sana) {
      
      //ArrayList<String> kaannokset = this.kaannokset.get(sana);
     
      return this.kaannokset.getOrDefault(sana, new ArrayList<String>());
      
    }        
    public void tulostakaikki () {
        
         for (String nimi: kaannokset.keySet()) {
            System.out.println(nimi + ": " + kaannokset.get(nimi));
        }
    }
    public void poista(String sana) {
        kaannokset.remove(sana);
    }
    
}
