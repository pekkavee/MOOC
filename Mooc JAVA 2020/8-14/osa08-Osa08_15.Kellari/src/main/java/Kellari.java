
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
public class Kellari {
    private HashMap<String, ArrayList<String>> tavarat;

    public Kellari() {
        this.tavarat = new HashMap<>();
    }
        public void lisaa(String komero, String tavara) {
        this.tavarat.putIfAbsent(komero, new ArrayList<>());

        // haetaan ensin käyttäjän tehtävät sisältävä lista ja tehdään siihen lisäys
        ArrayList<String> tavarat = this.tavarat.get(komero);
       // tehdyt.add(tehtava);
       tavarat.add(tavara);
    }    
        
        public ArrayList<String> sisalto(String komero) {
      
      //ArrayList<String> kaannokset = this.kaannokset.get(sana);
     
      return this.tavarat.getOrDefault(komero, new ArrayList<String>());
      
    }        
    
    public void poista(String komero, String tavara) {
        ArrayList<String> tavarat = this.tavarat.get(komero);
        tavarat.remove(tavara);
        
    }    
    public ArrayList<String> komerot() {
        ArrayList<String> nimet = new ArrayList<>();
        for (String nimi: tavarat.keySet()) {
            if (!tavarat.get(nimi).isEmpty()) {
            nimet.add(nimi);}
            
        }
        return nimet;
    }
        
    }
