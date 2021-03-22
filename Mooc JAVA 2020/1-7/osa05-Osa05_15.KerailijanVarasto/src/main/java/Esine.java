/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Esine {
    private String tunnus;
    private String nimi;

    public Esine(String tunnus, String nimi) {
        this.tunnus = tunnus;
        this.nimi = nimi;
    }
    
    public boolean equals(Object verrattava) {
        // jos muuttujat sijaitsevat samassa paikassa, ovat ne samat
        if (this == verrattava) {
            return true;
        }

        // jos verrattava olio ei ole Henkilo-tyyppinen, oliot eivät ole samat
        if (!(verrattava instanceof Esine)) {
            return false;
        }

        // muunnetaan olio Henkilo-olioksi
        Esine verrattavaEsine = (Esine) verrattava;

        // jos olioiden oliomuuttujien arvot ovat samat, ovat oliot samat
        if (this.tunnus.equals(verrattavaEsine.tunnus)
            ) {
            return true;
        }

        // muulloin oliot eivät ole samat
        return false;
        
    }

    @Override
    public String toString() {
        return tunnus + ": " + nimi;
    }
    
    
    
}
