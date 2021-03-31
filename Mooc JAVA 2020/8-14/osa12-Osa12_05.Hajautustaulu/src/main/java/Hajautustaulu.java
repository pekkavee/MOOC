
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
public class Hajautustaulu<K, A> {

    private List<Pari> arvot=new ArrayList<>();
    private int arvoja;

    public Hajautustaulu() {
        
        this.arvoja = 0;
    }
    public void lisaa (Pari p)  {
        arvot.add(p);
        
    }
    public A hae(K avain) {
        for (Pari pari : arvot) {
            if(pari.getAvain().equals(avain)){
                return (A) pari.getArvo();
            }
        }
        return null;
}
  
}