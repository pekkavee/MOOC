/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public class Lampomittari implements Sensori{
    private boolean paalla;

    public Lampomittari() {
        this.paalla=false;
    }
    
    
    @Override
    public boolean onPaalla() {
        return this.paalla;
    }

    @Override
    public void paalle() {
        this.paalla=true;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void poisPaalta() {
        this.paalla=false;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int mittaa() {
        if (!this.paalla) {
            throw new IllegalStateException();
        }
        int luku = new Random().nextInt(61);
        luku = luku-30;
        return luku;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
