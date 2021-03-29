/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanakirja;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 *
 * @author Administrator
 */
public class MuistavaSanakirja {
    private HashMap<String, String> sanat = new HashMap<String, String>();
    private String tiedosto;

    public MuistavaSanakirja() {
    }
    
    public void lisaa(String sana, String kaannos) {
      //  sanat.putIfAbsent(kaannos,sana);
       sanat.putIfAbsent(sana,kaannos);
    }
    public String kaanna(String sana) {
        
        String kaannos=null;
        
         for (Map.Entry me : sanat.entrySet()) {
          //if(!sanat.containsValue(me.getKey())) {
          
          
        //  sanat.remove(me.getValue());
         if (me.getKey().equals(sana)) {
             kaannos=me.getValue().toString();
         } else if (me.getValue().equals(sana)) {
             kaannos=me.getKey().toString();
         }
          
          //kirjoittaja.println(me.getKey() + ":" + me.getValue());
         // indeksi++;
          
          //sanat.remove(me.getValue());
         
         }
         return kaannos;
       
    }
    public void poista(String sana)  {
        

        String kaannos = sanat.get(sana);
      
        Set set = sanat.entrySet();
        
        Iterator i = set.iterator();
// Display elements
while(i.hasNext()) {
   Map.Entry me = (Map.Entry)i.next();
   if (me.getKey().equals(sana)) {
       i.remove();
   } else if (me.getValue().equals(sana)) {
       i.remove();
   }

}
        
    }
    public MuistavaSanakirja(String tiedosto) {
        this.tiedosto=tiedosto;
 
}
    public boolean lataa() {
              
        List<String> rivit = new ArrayList<>();
        try {
            Files.lines(Paths.get(tiedosto)).forEach(rivi -> rivit.add(rivi));
            
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        for (String string : rivit) {
            String[] osat = string.split(":"); 
            String sana1=osat[0];
            String sana2=osat[1];
            this.lisaa(sana1, sana2);
        }
        return true;
    }
    
    public boolean tallenna()  {
        
            Iterator it = sanat.entrySet().iterator();
 
        
        try{
        PrintWriter kirjoittaja = new PrintWriter(this.tiedosto);
         
           
         for (Map.Entry me : sanat.entrySet()) {
          //if(!sanat.containsValue(me.getKey())) {
          
          
        //  sanat.remove(me.getValue());
          
          kirjoittaja.println(me.getKey() + ":" + me.getValue());
         // indeksi++;
          
          //sanat.remove(me.getValue());
         
         }
        
        kirjoittaja.close();
        return true;
        } catch (Exception e) {
            return false;
        }
    }
      
}
