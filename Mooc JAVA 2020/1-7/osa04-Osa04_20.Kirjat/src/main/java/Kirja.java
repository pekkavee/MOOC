/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Kirja {
    
    private String nimi;
    private int sivuja;
    private int vuosi;

    public Kirja(String nimi, int sivuja, int vuosi) {
        this.nimi = nimi;
        this.sivuja = sivuja;
        this.vuosi = vuosi;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getSivuja() {
        return sivuja;
    }

    public void setSivuja(int sivuja) {
        this.sivuja = sivuja;
    }

    public int getVuosi() {
        return vuosi;
    }

    public void setVuosi(int vuosi) {
        this.vuosi = vuosi;
    }

    @Override
    public String toString() {
        return nimi + ", " + sivuja + " sivua, " + vuosi;
    }
    
    
    
}
