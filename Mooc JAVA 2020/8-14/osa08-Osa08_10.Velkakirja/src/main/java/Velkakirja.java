
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
public class Velkakirja {
    private HashMap<String, Double> velat;

    public Velkakirja() {
        this.velat = new HashMap<>();
    }
    
    public void asetaLaina(String kenelle, double maara) {
        velat.put(kenelle, maara);
        
    }
    public double paljonkoVelkaa(String kuka) {
       /* try {
        return this.velat.get(kuka);
        } catch (Exception e) {
            return 0.0;
        }
       */
       return velat.getOrDefault(kuka, 0.0);
        
        
    }
}
