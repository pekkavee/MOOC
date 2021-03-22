
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }
    
    public Raha plus(Raha lisattava) {
    Raha uusi = new Raha(this.euroa+lisattava.eurot(),this.senttia+lisattava.sentit()); // luodaan uusi Raha-olio jolla on oikea arvo

    // palautetaan uusi Raha-olio
    return uusi;
    }
    
    public boolean vahemman(Raha verrattava) {
        if(this.euroa>verrattava.euroa) {
            return false;
        } else if (this.euroa<verrattava.euroa) {
            return true;
        } else {
            
         if(this.senttia>verrattava.senttia) {
            return false;
        } else if (this.senttia<verrattava.senttia) {
            return true;
        } else {
            return false;
        }
        }
        
    }
    public Raha miinus(Raha vahentaja) {
        int sentit=this.euroa*100+this.senttia ;
        int sentitUusi=vahentaja.euroa*100+vahentaja.senttia;
        int eurot=0;
        
        
        
        if (sentit-sentitUusi<0) {
            sentit=0;
        } else {
            sentit=sentit-sentitUusi;
            
            if (sentit>99) {
                eurot=sentit/100;
                sentit=sentit%100;
            }
            
            
        }
        Raha uusi = new Raha(eurot,sentit);
        return uusi;
        
    }
    
    
}
        
    


        
