/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Opiskelija extends Henkilo {
    
    private int opintopisteita;

    public Opiskelija(String nimi, String osoite) {
        super(nimi, osoite);
        this.opintopisteita=0;
    }
    public void opiskele () {
        this.opintopisteita++;
    }
    
    public int opintopisteita(){
        return this.opintopisteita;
    }

    @Override
    public String toString() {
        return this.getNimi()+"\n"+"  "+this.getOsoite()+"\n"+"  opintopisteitä "+this.opintopisteita;
    }
    
    
}
