
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
public class Vitsipankki {
    private ArrayList<String> vitsit;
    
    public Vitsipankki() {
        this.vitsit=new ArrayList<>();
    }
    
    public void lisaaVitsi(String vitsi) {
        vitsit.add(vitsi);
        
        
    }
    public void tulostaVitsit() {
        for (String string : vitsit) {
            System.out.println(string);
            
        }
        
    }
    public String arvoVitsi() {
        if (vitsit.size()==0) {
            return "Vitsit vähissä.";
        } else {
        int Min =0;
        int Max =vitsit.size()-1;
        int satunnainen = Min + (int)(Math.random() * ((Max - Min) + 1));
        //System.out.println(vitsit.get(satunnainen));

        return (vitsit.get(satunnainen));
    }
      
    }

}
