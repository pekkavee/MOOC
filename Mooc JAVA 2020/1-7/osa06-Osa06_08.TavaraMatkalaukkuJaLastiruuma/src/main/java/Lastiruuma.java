
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Lastiruuma {
    private int maksiPaino;
    private ArrayList<Matkalaukku> laukut;
    private int paino;

    public Lastiruuma(int maksiPaino) {
        this.maksiPaino = maksiPaino;
        this.laukut=new ArrayList();
        this.paino=0;
    }
    public void lisaaMatkalaukku(Matkalaukku laukku) {
      if (this.maksiPaino>=(laukku.yhteispaino()+this.paino)) {
            laukut.add(laukku);
            this.paino=this.paino+laukku.yhteispaino();
    } }

    @Override
    public String toString() {
        return laukut.size()+" matkalaukkua ("+this.paino+"kg)";
    }
    public void tulostaTavarat(){
        for (Matkalaukku matkalaukku : laukut) {
            matkalaukku.tulostaTavarat();
            
        }
        
    }
    
    
}
