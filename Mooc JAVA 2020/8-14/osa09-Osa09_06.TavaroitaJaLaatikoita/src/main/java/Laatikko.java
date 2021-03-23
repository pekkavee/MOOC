
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
public class Laatikko implements Talletettava {
    private ArrayList<Talletettava>talletettavat;
    private double maksimi;
   

    public Laatikko(double maksimi) {
        this.talletettavat=new ArrayList<>();
        this.maksimi=maksimi;
    }
    
    public void lisaa(Talletettava talletettava) {
        if (this.maksimi-this.paino()>=talletettava.paino()) {
            talletettavat.add(talletettava);
        }
        
        
        
    }
    public double paino () {
        double yht=0.0;
        
        for (Talletettava talletettava : talletettavat) {
            yht+=talletettava.paino();
            
        }
        
        return yht;
    }

    @Override
    public String toString() {
        return "Laatikko: " + talletettavat.size()+ " esinettä, paino yhteensä "+this.paino()+" kiloa";
    }
    
    
    
    
}
