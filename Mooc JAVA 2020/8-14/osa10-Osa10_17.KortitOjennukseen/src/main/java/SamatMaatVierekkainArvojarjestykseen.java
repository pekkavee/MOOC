
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class SamatMaatVierekkainArvojarjestykseen implements Comparator<Kortti>{

    @Override
    public int compare(Kortti k1, Kortti k2) {
 
        int arvo= k1.getMaa().ordinal() - k2.getMaa().ordinal();
        
        if (arvo==0) {
         if (k1.getArvo() == k2.getArvo()) {
         
            return 0;
        } else if (k1.getArvo() > k2.getArvo()) {
            return 1;
        } else {
            return -1;
        }
    }
        return arvo;
    }
    
    @Override
    public Comparator<Kortti> reversed() {
        return Comparator.super.reversed(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparator<Kortti> thenComparing(Comparator<? super Kortti> other) {
        return Comparator.super.thenComparing(other); //To change body of generated methods, choose Tools | Templates.
    }

  
}
