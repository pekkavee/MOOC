
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
public class Tehtavalista {
    private ArrayList<String> tehtavat;

    public Tehtavalista() {
        this.tehtavat=new ArrayList<>();
    }
    
    public void lisaa(String tehtava) {
        tehtavat.add(tehtava);
        
        
    }
    public void tulosta() {
        int indeksi =1;
        for (String string : tehtavat) {
            System.out.println(indeksi+": "+string);
            indeksi++;
            
        }
        
    }
    public void poista(int numero) {
        tehtavat.remove(numero-1);
                
    }
}
