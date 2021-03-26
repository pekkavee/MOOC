/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Maa implements Comparable<Maa>{
    
    private String sukupuoli;
    private String maa;
    private int vuosi;
    private double prosentti;

    public Maa(String sukupuoli, String maa, int vuosi, double prosentti) {
        this.sukupuoli = sukupuoli;
        this.maa = maa;
        this.vuosi = vuosi;
        this.prosentti = prosentti;
    }

    public String getSukupuoli() {
        return sukupuoli;
    }

    public void setSukupuoli(String sukupuoli) {
        this.sukupuoli = sukupuoli;
    }

    public String getMaa() {
        return maa;
    }

    public void setMaa(String maa) {
        this.maa = maa;
    }

    public int getVuosi() {
        return vuosi;
    }

    public void setVuosi(int vuosi) {
        this.vuosi = vuosi;
    }

    public double getProsentti() {
        return prosentti;
    }

    public void setProsentti(double prosentti) {
        this.prosentti = prosentti;
    }
    

    @Override
    public String toString() {
        
        if(this.sukupuoli.contains("female")) {
            this.sukupuoli="female";
        } else {
            this.sukupuoli="male";
        }
        return this.maa +" (" +this.vuosi+"), "+this.sukupuoli+ ", "+this.prosentti ;
    }
    
         

    @Override
    public int compareTo(Maa m) {
           if (this.prosentti == m.getProsentti()) {
            return 0;
        } else if (this.prosentti > m.getProsentti()) {
            return 1;
        } else {
            return -1;
        }
    }
    
}
