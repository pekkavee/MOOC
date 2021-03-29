/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lento;

/**
 *
 * @author Administrator
 */
public class Lento {
    private String alku;
    private String loppu;

    public Lento(String alku, String loppu) {
        this.alku = alku;
        this.loppu = loppu;
    }

    @Override
    public String toString() {
        return "("+this.alku+"-"+this.loppu+")";
    }
    public String tulosta () {
        return "("+this.alku+"-"+this.loppu+")";
    }
    
    
}
