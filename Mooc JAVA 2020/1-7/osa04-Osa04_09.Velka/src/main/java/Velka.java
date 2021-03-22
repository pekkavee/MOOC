/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Velka {
    private double saldo;
    private double korkoKerroin;
    
    
    public Velka(double saldoAlussa, double korkokerroinAlussa) {
        this.saldo=saldoAlussa;
        this.korkoKerroin=korkokerroinAlussa;
    }
    
    public void tulostaSaldo() {
        System.out.println(this.saldo);
    }
    
    public void odotaVuosi() {
        this.saldo=this.saldo*this.korkoKerroin;
        
    }
    
    
}
