
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Ostoskori {
    private List<Ostos> ostokset;

    public Ostoskori() {
        this.ostokset=new ArrayList<>();
    }
    
    public void lisaa(String tuote, int hinta) {
        boolean lisaa=true;
        for (Ostos ostos : ostokset) {
            if(ostos.getTuote().equals(tuote)) {
                ostos.kasvataMaaraa();
                lisaa=false;
            }
            
        }
        if (lisaa) {
            Ostos ostos = new Ostos(tuote, 1, hinta);
            ostokset.add(ostos);
        }
    }
    public int hinta() {
        int hinta=0;
        for (Ostos ostos : ostokset) {
            hinta+=ostos.hinta();
            
        }
        return hinta;
    }
    public void tulosta(){
        for (Ostos ostos : ostokset) {
            System.out.println(ostos);
            
        }
    }
    public boolean onKorissa(Ostos ostos) {
        for (Ostos ostos1 : ostokset) {
            if(ostos1.getTuote().equals(ostos.getTuote())) {
                return true;
            }
            
        }
        return false;
            
    }
    
}
