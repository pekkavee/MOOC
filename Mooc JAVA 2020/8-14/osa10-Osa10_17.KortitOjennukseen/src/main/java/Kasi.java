
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
public class Kasi implements Comparable<Kasi>{
    private List<Kortti>kadessa;

    public Kasi() {
        this.kadessa=new ArrayList<>();
    }
    public void lisaa(Kortti kortti) {
        this.kadessa.add(kortti);
    }
    public void tulosta () {
        
        for (Kortti kortti : kadessa) {
            System.out.println(kortti.toString());
        }
    }
    public void jarjesta() {
        Comparator<Kortti> vertailija = Comparator
              .comparing(Kortti::getArvo)
              .thenComparing(Kortti::getMaa);

        Collections.sort(kadessa, vertailija);
    

        
    }
    public int arvo () {
        int arvo =0;
        
        for (Kortti kortti : kadessa) {
            arvo+=kortti.getArvo();
            
        }
        return arvo;
        
    }

    @Override
    public int compareTo(Kasi m) {
        if (this.arvo() == m.arvo()) {
         
            return 0;
        } else if (this.arvo() > m.arvo()) {
            return 1;
        } else {
            return -1;
        }
        
    }
    
    public void jarjestaMaittain() {
          /*      Comparator<Kortti> vertailija = Comparator
            
              .comparing(Kortti::getMaa)
              .thenComparing(Kortti::getArvo);

        Collections.sort(kadessa, vertailija);
    

        
        */
          Collections.sort(kadessa, new SamatMaatVierekkainArvojarjestykseen());
        
    }
    
}
