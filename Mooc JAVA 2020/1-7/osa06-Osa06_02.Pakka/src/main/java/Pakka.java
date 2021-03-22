
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
public class Pakka {
       private ArrayList<String> kortit;

    public Pakka() {
        this.kortit = new ArrayList<>();
    } 
    public boolean onTyhja() {
       if(this.kortit.isEmpty()) {
           return true;
       } else {
           return false;
       }
    }
    public void lisaa(String arvo) {
        this.kortit.add((arvo));
    }
    public ArrayList<String> arvot() {
        return this.kortit;
    }
    
    public String ota () {
        String ota = this.kortit.get(this.kortit.size()-1);
        this.kortit.remove(this.kortit.size()-1);
        return ota;
    }
}
