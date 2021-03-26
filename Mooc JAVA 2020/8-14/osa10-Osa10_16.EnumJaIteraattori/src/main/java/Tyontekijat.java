
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Tyontekijat {
    private List<Henkilo>tyontekijat;

    public Tyontekijat() {
        this.tyontekijat = new ArrayList<>();
    }
    public void lisaa(Henkilo lisattava) {
        tyontekijat.add(lisattava);
    }
    
    public void lisaa(List<Henkilo> lisattavat) {
       tyontekijat = Stream.concat(tyontekijat.stream(), lisattavat.stream())
                             .collect(Collectors.toList());
    }
    public void tulosta() {
        Iterator<Henkilo> iteraattori = tyontekijat.iterator();
           while (iteraattori.hasNext()) {
                System.out.println(iteraattori.next().toString());
            }
        
    }
    
    public void tulosta(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = tyontekijat.iterator();
           while (iteraattori.hasNext()) {
                       Henkilo seuraavanaVuorossa = iteraattori.next();

            if (seuraavanaVuorossa.getKoulutus().equals(koulutus)) {
                System.out.println(seuraavanaVuorossa.toString());
            }
        }
            
        }
    
    public void irtisano(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = tyontekijat.iterator();
           while (iteraattori.hasNext()) {
                       Henkilo seuraavanaVuorossa = iteraattori.next();

            if (seuraavanaVuorossa.getKoulutus().equals(koulutus)) {
                iteraattori.remove();
            }
        }
            
        
    }
    }
    
    

