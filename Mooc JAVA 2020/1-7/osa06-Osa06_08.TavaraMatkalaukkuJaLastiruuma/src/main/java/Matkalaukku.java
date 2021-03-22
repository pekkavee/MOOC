
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
public class Matkalaukku {
    private int maksimipaino;
     private ArrayList<Tavara> tavarat;
     private int painoYht;
     

    public Matkalaukku() {
        this.tavarat=new ArrayList();
       
    }

    public Matkalaukku(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.tavarat=new ArrayList();
        this.painoYht=0;
    }
    
    public void lisaaTavara(Tavara tavara) {
        if (this.maksimipaino>=(tavara.getPaino()+this.painoYht)) {
            tavarat.add(tavara);
            this.painoYht=this.painoYht+tavara.getPaino();
    } }
    
    public void tulostaTavarat() {
        for (Tavara tavara : tavarat) {
            System.out.println(tavara.getNimi()+ " ("+tavara.getPaino()+" kg)");
            
        }
        
        
    }
    
    public Tavara raskainTavara(){
        Tavara t = null;
        int paino=0;
        for (Tavara tavara : tavarat) {
            if (tavara.getPaino()>paino) {
                t=tavara;
                paino=tavara.getPaino();
            }
            
            
        }
        return t;
    }
    
    public int yhteispaino(){
        return this.painoYht;
        
    }
    @Override
    public String toString() {
        if (tavarat.size()==0) {
            return "ei tavaroita (0 kg)";
        } else if (tavarat.size()==1) {
            return tavarat.size() +" tavara ("+this.painoYht+" kg)";
        } else {
        return tavarat.size() +" tavaraa ("+this.painoYht+" kg)";
        }
    }
    
}
