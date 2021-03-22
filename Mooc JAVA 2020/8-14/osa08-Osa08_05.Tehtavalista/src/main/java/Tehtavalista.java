
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

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
    private ArrayList<String>tehtavat;

    public Tehtavalista() {
        this.tehtavat=new ArrayList<>();
    }
    public void lisaa(String tehtava) {
        tehtavat.add(tehtava);
    }
    public void tulosta() {
        int indeksi=1;
        
        for (String string : tehtavat) {
            System.out.println(indeksi+": "+string);
            indeksi++;
            
        }
    }
    public void poista(int nro) {
        int indeksi=0;
        String x="";
        
        for (String string : tehtavat) {
            indeksi++;
            if (indeksi==nro) {
                x=tehtavat.get(indeksi-1);
              //  System.out.println(x);
                break;
            }
            
        }
        tehtavat.remove(x);
    }
    
}
