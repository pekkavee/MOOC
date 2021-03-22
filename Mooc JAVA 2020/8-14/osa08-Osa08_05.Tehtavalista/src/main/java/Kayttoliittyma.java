
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
    private Tehtavalista lista;
    private Scanner lukija;

    public Kayttoliittyma(Tehtavalista lista, Scanner lukija) {
        this.lista = lista;
        this.lukija = lukija;
    }
    public void kaynnista(){
        while (true) {
            System.out.println("Komento:");
            String komento = lukija.nextLine();
            if (komento.equals("lopeta")) {
                break;
            } else if (komento.equals("lisaa")) {
                System.out.println("Lisättavä:");
                String lisattava = lukija.nextLine();
                lista.lisaa(lisattava);
                
            } else if (komento.equals("poista")) {
                System.out.println("Mikä poistetaan");
                int numero = Integer.valueOf(lukija.nextLine());
                lista.poista(numero);
                
            } else if (komento.equals("listaa")) {
                lista.tulosta();
                
            }
            
            
            
        }
}

    
}
