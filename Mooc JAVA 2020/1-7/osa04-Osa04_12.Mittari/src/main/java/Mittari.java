/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Mittari {
    private int mitta;
    
    /*
    Metodi public void lisaa() kasvattaa oliomuuttujan mitta arvoa yhdellä. Ei kasvata arvoa yli viiden.
    Metodi public void vahenna() vähentää oliomuuttujan mitta arvoa yhdellä. Ei vähennä arvoa negatiiviseksi.
    Metodi public int mitta() palauttaa oliomuuttujan mitta arvon.
    Metodi public boolean taynna() palauttaa true mikäli oliomuuttujan mitta on viisi, palauttaa muulloin false.
    */
    public void lisaa() {
        if (this.mitta<5) {
            this.mitta=this.mitta+1;
        }
    }
    
    public void vahenna() {
         if (this.mitta>0) {
            this.mitta=this.mitta-1;
        }
       
    }
    
    public int mitta() {
        return this.mitta;
    }
    
    public boolean taynna(){
        if (this.mitta==5) {
            return true;
        } else {
            return false;
        }
              
    }
    
}
