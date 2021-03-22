/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Maksukortti {
    private double saldo;

    public Maksukortti(double alkusaldo) {
        this.saldo = alkusaldo;
    }

    public String toString() {
        // kirjoita koodia tähän
        return "Kortilla on rahaa " +this.saldo +" euroa";
    }
    public void syoEdullisesti() {
    // kirjoita koodia tähän
        if (this.saldo>=2.60) {
            this.saldo=this.saldo-2.60;
        } else{
            this.saldo=this.saldo;
        }
    }

    public void syoMaukkaasti() {
    // kirjoita koodia tähän
        if (this.saldo>=4.60) {
            this.saldo=this.saldo-4.60;
        } else{
            this.saldo=this.saldo;
        }
    }
    
    public void lataaRahaa(double rahamaara) {
    // kirjoita koodia tähän
        if (rahamaara>0) {
            this.saldo=this.saldo+rahamaara;
        }
        if (this.saldo>150){
            this.saldo=150;
        }
    }
    
}