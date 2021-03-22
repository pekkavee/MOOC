
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Kayttoliittyma {
    private Tehtavalista tehtava;
    private final Scanner lukija;

    public Kayttoliittyma(Tehtavalista tehtava, Scanner lukija) {
        this.tehtava = tehtava;
        this.lukija = lukija;
    }
    
    public void kaynnista() {
        
        while(true){
            
            System.out.println("Komento:");
            String komento=this.lukija.nextLine();
            if (komento.equals("lopeta")) {
                
                break;
            } else if (komento.equals("lisaa")) {
                System.out.println("Lisättävä:");
                String lisattava=this.lukija.nextLine();
                tehtava.lisaa(lisattava);
            } else if (komento.equals("listaa")) {
                tehtava.tulosta();
            } else if (komento.equals("poista"))  {
                System.out.println("Mikä poistetaan?");
                int poistettava=Integer.valueOf(this.lukija.nextLine());
                tehtava.poista(poistettava);
            }
        }
        
    }
    
}
