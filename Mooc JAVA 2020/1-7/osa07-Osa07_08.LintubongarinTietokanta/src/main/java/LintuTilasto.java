
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
public class LintuTilasto {

    private ArrayList<Lintu> havainnot;

    public LintuTilasto() {
        this.havainnot = new ArrayList<>();
    }
    
   
    public void lisaa(Lintu e) {
        havainnot.add(e);
    }
    
    public void lisaaHavainto(String nimi) {
        boolean loytyi=false;
        for (Lintu lintu : havainnot) {
            
            if (lintu.getNimi().equals(nimi)) {
                lintu.lisaaHavainto();
                loytyi=true;
            }
            
        }
        if (!loytyi) {
            System.out.println("Ei ole lintu!");
            
        }
        
    }

   public void tulostaKaikki() {
       for (Lintu lintu : havainnot) {
           System.out.print(lintu.getNimi());
           System.out.print("(");
           System.out.print(lintu.getLatNimi());
           System.out.print("): ");
           System.out.print(lintu.getHavainnot());
           System.out.print(" havaintoa");
           System.out.println("");
           
       }
       
       
   } 
   public void tulostaYksi (String nimi) {
       for (Lintu lintu : havainnot) {
           
           if (lintu.getNimi().equals(nimi)) {
               System.out.println(lintu.getNimi()+" ("+lintu.getLatNimi()+"): "+lintu.getHavainnot()+" havaintoa");
           }
           
       }
   }
    
    
    
    

}
