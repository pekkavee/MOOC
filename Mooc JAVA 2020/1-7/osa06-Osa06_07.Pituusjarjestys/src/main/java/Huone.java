
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
public class Huone {
    
    private ArrayList<Henkilo> alkiot;

    public Huone() {
        this.alkiot=new ArrayList<>();
    }
    public void lisaa(Henkilo henkilo) {
        alkiot.add(henkilo);
    }
    public boolean onTyhja() {
        if (alkiot.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    public ArrayList<Henkilo> getHenkilot() {
        return alkiot;
    }
    
    public Henkilo lyhin() {
        
        int pituus=0;
        Henkilo h =null;
        for (Henkilo henkilo : alkiot) {
            if (pituus==0){
                pituus=henkilo.getPituus();
                h=henkilo;
            }
            if (henkilo.getPituus()<pituus){
                pituus =henkilo.getPituus();
                h=henkilo;
            }
            
        }
        return h;
    }
    public Henkilo ota() {
        Henkilo h =this.lyhin();
        alkiot.remove(this.lyhin());
        return h;
        
    }
    
    
}
