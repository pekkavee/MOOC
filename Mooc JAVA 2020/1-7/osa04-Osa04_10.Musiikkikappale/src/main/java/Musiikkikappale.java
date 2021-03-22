/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Musiikkikappale {
    private String nimi;
    private int pituusSekunteina;
    
    public Musiikkikappale(String kappaleenNimi, int kappaleenPituus) {
        this.nimi=kappaleenNimi;
        this.pituusSekunteina=kappaleenPituus;
    }
    public String nimi() {
        return this.nimi;
    }
    public int pituus() {
        return this.pituusSekunteina;
    }
    
}
