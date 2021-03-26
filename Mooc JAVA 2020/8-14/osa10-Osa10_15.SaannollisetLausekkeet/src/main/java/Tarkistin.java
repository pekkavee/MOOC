

public class Tarkistin {
public boolean onViikonpaiva(String merkkijono) {
    String regex ="(ma|ti|ke|to|pe|la|su)";
    return merkkijono.matches(regex) ;
}

public boolean kaikkiVokaaleja(String merkkijono) {
    String regex ="[aeuioåäö]*";
    return merkkijono.matches(regex) ;
}
public boolean kellonaika(String merkkijono) {
    return merkkijono.matches("([01][0123456789]|2[0123]):[012345][0123456789]:[012345][0123456789]");  
    /*
    int tunnit=0;
    int min=0;
    int sek=0;
    
    try{
    String []palat = merkkijono.split(":");
        int indeksi =0;
        for (String string : palat) {
            indeksi++;
            if (string.length()!=2) {
                return false;
            }
            try {
                int arvo = Integer.valueOf(string);
  switch (indeksi) {
  case 1:
    tunnit =arvo;   
    if (arvo<0 || arvo>24) {
        
        return false;
    }
  case 2:
    min = arvo;
    if (((arvo<0 || arvo>59) )) {
        
        return false;
    }
  case 3:
    sek = arvo;  
    if (arvo<0 || arvo>59) {
        return false;
    }

}
                
            }catch (Exception e) {
            return false;
        }
            
        }
} catch (Exception e) {
        return false;
        }
    if (tunnit==24 && (min!=0 || sek!=0) ) {
        return false;
    }
      
        return true;

*/
     } 
}

