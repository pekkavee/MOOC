
import java.util.ArrayList;
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
public class Lauma implements Siirrettava{
    private List<Siirrettava> siirrettavat;

    public Lauma() {
        this.siirrettavat = new ArrayList<>();
    }
    
    
    
    public void lisaaLaumaan(Siirrettava siirrettava)  {
        this.siirrettavat.add(siirrettava);
    }

    @Override
    public void siirra(int dx, int dy) {
        for (Siirrettava siirrettava : siirrettavat) {
            siirrettava.siirra(dx, dy);
            
        }
    }

    @Override
    public String toString() {
        
        String palautettava="";
        
        for (Siirrettava siirrettava : siirrettavat) {
            palautettava+=siirrettava.toString()+"\n";
            
            
        }
        return palautettava;
    }
    
    
}
