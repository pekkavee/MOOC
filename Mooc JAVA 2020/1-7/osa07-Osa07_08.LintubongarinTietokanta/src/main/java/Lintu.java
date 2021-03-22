/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Lintu {
    private String nimi;
    private String latNimi;
    private int havainnot;

    public Lintu(String nimi, String latNimi) {
        this.nimi = nimi;
        this.latNimi = latNimi;
        this.havainnot = 0;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getLatNimi() {
        return latNimi;
    }

    public void setLatNimi(String latNimi) {
        this.latNimi = latNimi;
    }

    public int getHavainnot() {
        return havainnot;
    }

    public void setHavainnot(int havainnot) {
        this.havainnot = havainnot;
    }
    
    public void lisaaHavainto () {
        this.havainnot++;
    }
    
    
    
}
