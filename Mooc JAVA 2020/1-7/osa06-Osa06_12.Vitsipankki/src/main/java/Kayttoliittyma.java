
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
    private Vitsipankki vitsipankki;
    private Scanner lukija;

 

    public Kayttoliittyma(Vitsipankki vitsipankki, Scanner lukija) {
        this.vitsipankki = vitsipankki;
        this.lukija = lukija;
    }
    
    
    public void kaynnista() {
        
        while(true) {
            System.out.println("Komennot:"); 
            System.out.println("1 - lisää vitsi");
            System.out.println("2 - arvo vitsi");
            System.out.println("3 - listaa vitsit");
            System.out.println("X - lopeta");

            String komento =lukija.nextLine();
            
            if (komento.equals("X")) {
                break;
            } else if (komento.equals("1")){
                System.out.println("Kirjoita lisättävä vitsi:");
                String vitsi = lukija.nextLine();
                vitsipankki.lisaaVitsi(vitsi);
            } else if (komento.equals("2")){
                System.out.println(vitsipankki.arvoVitsi());
            } else if (komento.equals("3")) {
                vitsipankki.tulostaVitsit();
            }
            
        }
    }
    
    
}
