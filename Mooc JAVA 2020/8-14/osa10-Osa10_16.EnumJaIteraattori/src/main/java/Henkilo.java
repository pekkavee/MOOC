/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Henkilo {
    private String nimi;
    private Koulutus koulutus;

    public Henkilo(String nimi, Koulutus koulutus) {
        this.nimi = nimi;
        this.koulutus = koulutus;
    }

    public String getNimi() {
        return nimi;
    }

    public Koulutus getKoulutus() {
        return koulutus;
    }

    @Override
    public String toString() {
        return this.nimi+", "+this.koulutus;
    }
    
    

}
