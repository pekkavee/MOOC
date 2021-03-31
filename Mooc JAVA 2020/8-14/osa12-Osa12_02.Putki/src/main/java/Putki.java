
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
public class Putki <T>{
    private List<T>oliot=new ArrayList<>();

    public Putki() {
    }
    
    
    
    public void lisaaPutkeen(T arvo) {
        this.oliot.add(arvo);
        
    }
    public T otaPutkesta() {
        
        if (this.oliot.size()==0){
            return null;
            
        }
        T t = oliot.get(0);
        this.oliot.remove(0);
        return t;
    }
    public boolean onkoPutkessa(){
        if (this.oliot.isEmpty()){
            return false;
        } else {
            return true;
        }
    }
}
