
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Ostos {
    private String tuote;
    private int kpl;
    private int yksikkohinta;
    
          
    public Ostos(String tuote, int kpl, int yksikkohinta) {
        this.tuote=tuote;
        this.kpl=kpl;
        this.yksikkohinta=yksikkohinta;
        
    }
    public int hinta() {
        return this.kpl*this.yksikkohinta;
    }
    public void kasvataMaaraa(){
        this.kpl++;
    }
    public String toString()  {
       return this.tuote+": "+this.kpl;
        
    }

    public String getTuote() {
        return tuote;
    }

    public void setTuote(String tuote) {
        this.tuote = tuote;
    }

    public int getKpl() {
        return kpl;
    }

    public void setKpl(int kpl) {
        this.kpl = kpl;
    }

    public int getYksikkohinta() {
        return yksikkohinta;
    }

    public void setYksikkohinta(int yksikkohinta) {
        this.yksikkohinta = yksikkohinta;
    }
    
}
