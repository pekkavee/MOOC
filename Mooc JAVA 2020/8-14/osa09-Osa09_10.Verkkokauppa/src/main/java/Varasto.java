
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Varasto {
    
    private Map<String, Integer>varastot;
    private Map<String, Integer>saldot;

    public Varasto() {
        this.varastot=new HashMap<>();
        this.saldot = new HashMap<>();
    }
    
    public void lisaaTuote(String tuote, int hinta, int saldo)  {
        varastot.put(tuote, hinta);
        saldot.put(tuote,saldo);
    }
    public int hinta(String tuote) {
      return varastot.getOrDefault(tuote, -99);
    }
    public int saldo(String tuote)  {
        return saldot.getOrDefault(tuote, 0);
    }
   public boolean ota(String tuote) {
       int saldo=saldo(tuote);
       if (saldo>0) {
           saldot.put(tuote, saldot.get(tuote) -1);
           return true;
       } else{
           return false;
       }
       
   }
   public Set<String> tuotteet() {
       Set <String> tuotteet =new HashSet<>();
       for (Map.Entry me : varastot.entrySet()) {
           tuotteet.add(me.getKey().toString());
         // System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }
       return tuotteet;
   }
}
