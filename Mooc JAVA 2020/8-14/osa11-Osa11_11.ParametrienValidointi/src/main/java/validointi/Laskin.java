package validointi;

public class Laskin {

    public int kertoma(int luvusta) {
        
        if (luvusta<0) {
            throw new IllegalArgumentException("luku ei kelpaa!!");
        }

        int kertoma = 1;
        for (int i = 1; i <= luvusta; i++) {
            kertoma *= i;
        }

        return kertoma;
    }

    public int binomikerroin(int joukonKoko, int osaJoukonKoko) {
        
        if (joukonKoko<0 || osaJoukonKoko<0) {
            throw new IllegalArgumentException("luku ei kelpaa!!");
        } else if (osaJoukonKoko>=joukonKoko) {
            throw new IllegalArgumentException("luku ei kelpaa!!");
        }

        int osoittaja = kertoma(joukonKoko);
        int nimittaja = kertoma(osaJoukonKoko) * kertoma(joukonKoko - osaJoukonKoko);

        return osoittaja / nimittaja;
    }
}
