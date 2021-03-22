/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Laskuri {
    private int alkuarvo;

    public Laskuri() {
        this.alkuarvo = 0;
    }

    public Laskuri(int alkuarvo) {
        this.alkuarvo = alkuarvo;
    }
    public int arvo() {
        return this.alkuarvo;
    }
    public void lisaa (){
        this.alkuarvo=this.alkuarvo+1;
    }
    public void vahenna (){
        this.alkuarvo=this.alkuarvo-1;
    }
    
    public void lisaa (int lisays){
        if (lisays<0) {
        lisays=0;
    }
        this.alkuarvo=this.alkuarvo+lisays;
    }
    public void vahenna (int vahennys){
        if (vahennys<0) {
            vahennys=0;
        }
        this.alkuarvo=this.alkuarvo-vahennys;
    }
    
}
