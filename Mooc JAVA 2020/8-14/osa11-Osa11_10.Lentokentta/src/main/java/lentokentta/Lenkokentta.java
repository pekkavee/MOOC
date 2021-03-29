/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lentokentta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lentokone.Lentokone;

/**
 *
 * @author Administrator
 */
public class Lenkokentta {
    
    private Scanner lukija;
    private List<lentokone.Lentokone>lentokoneet;

    public Lenkokentta() {
        lukija= new Scanner(System.in);
        lentokoneet= new ArrayList<>();
    }
    
    public void kaynnista() {
          hallitse();
        System.out.println();
        lentopalvelu();
        System.out.println();
    }
        
    
    public void hallitse() {
        /*
        Valitse toiminto:
        [1] Lisää lentokone
        [2] Lisää lento
        [x] Poistu hallintamoodista
        > 
        */
        System.out.println("Lentokentän hallinta");
        System.out.println("--------------------");
        System.out.println();
        while (true) {
        System.out.println("Valitse toiminto:");
        System.out.println("[1] Lisää lentokone");
        System.out.println("[2] Lisää lento");
        System.out.println("[x] Poistu hallintamoodista");
        System.out.println("> ");
        
        String komento = lukija.nextLine();
        
        if (komento.equals("x")) {
            
           
            break;
        }
        
        if (komento.equals("1")) {
           /* Anna lentokoneen tunnus: HA-LOL
            Anna lentokoneen kapasiteetti: 42
            */
                   
            System.out.println("Anna lentokoneen tunnus:");
            String tunnus = lukija.nextLine();
            System.out.println("Anna lentokoneen kapasiteetti:");
            int kapas = Integer.valueOf(lukija.nextLine());
            
            Lentokone kone = new Lentokone(tunnus, kapas);
            lentokoneet.add(kone);
           
        } else if (komento.equals("2")) {
           /* 
            Anna lentokoneen tunnus: HA-LOL
            Anna lähtöpaikan tunnus: HEL
            Anna kohdepaikan tunnus: BAL
            */
            System.out.println("Anna lentokoneen tunnus: ");
            String tunnus = lukija.nextLine();
            System.out.println("Anna lähtöpaikan tunnus: ");
            String lahto = lukija.nextLine();
            System.out.println("Anna kohdepaikan tunnus: ");
            String tulo = lukija.nextLine();
            
            for (Lentokone lentokone : lentokoneet) {
                if (lentokone.getTunnus().equals(tunnus)) {
                    lentokone.lisaaLento(lahto, tulo);
                }
                
            }
           
        }
        }
    }
    
    public void lentopalvelu() {
        
        System.out.println("Lentopalvelu");
        System.out.println("------------");
        System.out.println();
        
        while (true) {
        System.out.println("Valitse toiminto:");
        System.out.println("[1] Tulosta lentokoneet");
        System.out.println("[2] Tulosta lennot");
        System.out.println("[3] Tulosta lentokoneen tiedot");
        System.out.println("[x] Lopeta");
        System.out.println("> ");
        
        String komento = lukija.nextLine();
        
        if (komento.equals("x")) {
            
            
            break;
        }
        
        if (komento.equals("1")) {
           /* Anna lentokoneen tunnus: HA-LOL
            Anna lentokoneen kapasiteetti: 42
            */
            for (Lentokone lentokone : lentokoneet) {
                //System.out.println("täällä");
                System.out.println(lentokone);
                
            }
        } else if (komento.equals("2")) {
            for (Lentokone lentokone : lentokoneet) {
                lentokone.tulostaLennot();
                
            }
           
        } else if (komento.equals("3")) {
            
            System.out.println("Mikä kone:");
            String kone=lukija.nextLine();
            boolean ei=true;
            for (Lentokone lentokone : lentokoneet) {
                
                String kone2=lentokone.getTunnus();
                if (kone.equals(kone2)) {
                    //System.out.println(lentokone.getTunnus());
                    System.out.println(lentokone.toString());
                    ei =false;
                }
                
            }
            if (ei)  {
                System.out.println("Tunnuksella " + kone + " ei ole lentokonetta");
            }
        }
        }
        
    }
   
    
}
