
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
public class Tekstikayttoliittyma {
    private Scanner lukija;
    private Sanakirja sanakirja;

    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.lukija = lukija;
        this.sanakirja = sanakirja;
    }
    

  

    public void kaynnista() {
        
       while (true) {
           System.out.println("Komento:");
           String komento=this.lukija.nextLine();
           if (komento.equals("lopeta")) {
               System.out.println("Hei hei!");
               break;
           } else if (komento.equals("lisaa")) {
               System.out.println("Sana:");
               String sana=this.lukija.nextLine();
               System.out.println("Kaannos:");
               String kaannos=this.lukija.nextLine();
               
               sanakirja.lisaa(sana, kaannos);
               
               
           } else if (komento.equals("hae")){
               System.out.println("Haettava:");
               String haettava = this.lukija.nextLine();
               String kaannos=sanakirja.kaanna(haettava);
               
              // System.out.println(sanakirja.kaanna(haettava));
             if (kaannos != null && !kaannos.isEmpty()) {
                 System.out.println(kaannos);
             } else {
                 
                 System.out.println("Sanaa "+haettava+" ei löydy");
             }
              
           } else {
           System.out.println("Tuntematon komento");
           
       }
       }
    }
    
    
    
}
