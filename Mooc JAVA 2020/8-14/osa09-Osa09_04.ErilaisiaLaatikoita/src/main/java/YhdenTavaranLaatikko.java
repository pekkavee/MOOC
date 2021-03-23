
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
public class YhdenTavaranLaatikko extends Laatikko {
    private ArrayList<Tavara>tavarat;

    public YhdenTavaranLaatikko() {
        this.tavarat=new ArrayList<>();
    }
    
    
   

    @Override
    public void lisaa(Tavara tavara) {
        if (this.tavarat.size()<1) {
            tavarat.add(tavara);
            
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
                for (Tavara tavara1 : tavarat) {
            if (tavara.getNimi().equals(tavara1.getNimi()) ) {
                return true;
            }
            
        }
        return false;
    }
    }
    

