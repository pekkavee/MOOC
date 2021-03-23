
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Muutoshistoria {
   private ArrayList<Double> muutokset;

    public Muutoshistoria() {
        this.muutokset = new ArrayList<>();
    }
    public void lisaa(double tilanne) {
        muutokset.add(tilanne);
    }
    public void nollaa() {
        this.muutokset=new ArrayList<>();
    }
    
    public double maxArvo() {
        return Collections.max(muutokset);
    }
    public double minArvo() {
        return Collections.min(muutokset);
    }
    
    public double keskiarvo() {
        double ka=0.0;
        int maara=0;
        double yht=0.0;
        for (Double double1 : muutokset) {
            maara++;
            yht+=double1;
            
        }
        
       if (maara>0) {
           ka=yht/maara;
       }
       return ka;
    }

    @Override
    public String toString() {
        return this.muutokset.toString();
    }
   
}
