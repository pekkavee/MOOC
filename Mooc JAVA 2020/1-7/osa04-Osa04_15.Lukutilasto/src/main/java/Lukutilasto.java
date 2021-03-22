public class Lukutilasto {
    private int lukujenMaara;
    private int summa;
   
    public Lukutilasto() {
        // alusta tässä muuttuja lukujenMaara
        this.lukujenMaara=this.lukujenMaara;
        this.summa=0;
    }

    public void lisaaLuku(int luku) {
        // kirjoita koodia tähän
        this.lukujenMaara++;
        this.summa=this.summa+luku;
        
    }

    public int haeLukujenMaara() {
        // kirjoita koodia tähän
        return this.lukujenMaara;
    }
    
    public int summa() {
        // kirjoita koodia tähän
        return this.summa;
    }
    public double keskiarvo () {
        if (this.lukujenMaara>0) {
            return 1.0*this.summa/this.lukujenMaara;
        } else {
            return 0;
        }
                
    }
  
}