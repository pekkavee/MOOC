/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Kertoja {
    private int luku;

    public Kertoja(int luku) {
        this.luku = luku;
    }
    
    public int kerro (int luku) {
        return this.luku*luku;
    }

    @Override
    public String toString() {
        return "Kertoja{" + "luku=" + luku + '}';
    }
    
    
    
}
