/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class CDLevy implements Talletettava{

    private String artisti;
    private String nimi;
    private int vuosi;
    private double paino;
    

    public CDLevy(String artisti, String nimi, int vuosi) {
        this.artisti = artisti;
        this.nimi = nimi;
        this.vuosi = vuosi;
        this.paino=0.1;
    }
    
    
    
    @Override
    public double paino() {
        return this.paino;
    }

    @Override
    public String toString() {
        return this.artisti+": "+this.nimi+" ("+this.vuosi+")";
    }
    
    
    
}
