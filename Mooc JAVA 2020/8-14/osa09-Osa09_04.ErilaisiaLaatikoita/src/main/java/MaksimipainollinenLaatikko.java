
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
public class MaksimipainollinenLaatikko extends Laatikko {
    private int maksimipaino;
    
    private ArrayList<Tavara>tavarat;

    public MaksimipainollinenLaatikko(int maksimipaino) {
        this.maksimipaino = maksimipaino;
      // this.paino=0;
        tavarat=new ArrayList<>();
    }
    
    

    @Override
    public void lisaa(Tavara tavara) {
        int painoYht=0;
        
        for (Tavara tavara1 : tavarat) {
            painoYht+=tavara1.getPaino();
            
        }
        if (maksimipaino>=(painoYht+tavara.getPaino())) {
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
