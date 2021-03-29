/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Keskiarvosensori implements Sensori{
   // private boolean paalla;
    
    private List<Sensori>sensorit;
    private List<Integer> keskiarvot;

    public Keskiarvosensori() {
        this.sensorit=new ArrayList<>();
      //  this.paalla=true;
        this.keskiarvot=new ArrayList<>();
    }
    public void lisaaSensori(Sensori lisattava) {
        this.sensorit.add(lisattava);
       
    }
    

    @Override
    public boolean onPaalla() {
       //  boolean paalla =true;
        for (Sensori sensori : sensorit) {
            if (!sensori.onPaalla()) {
                return false;
            }
            
        }
        return true;
    }

    @Override
    public void paalle() {
        for (Sensori sensori : sensorit) {
            sensori.paalle();
            
        }
        
    }

    @Override
    public void poisPaalta() {
        for (Sensori sensori : sensorit) {
            sensori.poisPaalta();
            
        }
        
    }

    @Override
    public int mittaa() {
        int sum=0;
        if (this.sensorit.isEmpty()||!this.onPaalla()) {
            throw new IllegalStateException();
        }
        for (Sensori sensori : sensorit) {
            sum+=sensori.mittaa();
            
        }
        keskiarvot.add(sum/sensorit.size());
        return sum/sensorit.size();
    }
    public List<Integer> mittaukset() {
       return keskiarvot;
    }
}
