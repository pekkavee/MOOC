/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lentokone;

import java.util.ArrayList;
import java.util.List;
import lento.Lento;

/**
 *
 * @author Administrator
 */
public class Lentokone {
    private String tunnus;
    private int kapasiteetti;
    private List<Lento>lennot;

    public Lentokone(String tunnus, int kapasiteetti) {
        this.tunnus = tunnus;
        this.kapasiteetti=kapasiteetti;
        this.lennot = new ArrayList<>();
    }

    public String getTunnus() {
        return tunnus;
    }

    public void setTunnus(String tunnus) {
        this.tunnus = tunnus;
    }

    public int getKapasiteetti() {
        return kapasiteetti;
    }

    public void setKapasiteetti(int kapasiteetti) {
        this.kapasiteetti = kapasiteetti;
    }

    public List<Lento> getLennot() {
        return lennot;
    }

    public void setLennot(List<Lento> lennot) {
        this.lennot = lennot;
    }
    
    public void lisaaLento (String lahto, String tulo) {
        Lento lento = new Lento(lahto,tulo);
        this.lennot.add(lento);
    }

    @Override
    public String toString() {
        return tunnus +" ("+kapasiteetti+" henkilöä)";
    }
    public void tulostaLennot() {
        for (Lento lento : lennot) {
            System.out.println(this.toString()+" " +lento.toString());
            
        }
    }
    

    
}
