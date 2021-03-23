
import java.util.Objects;


public class Tavara {

    private String nimi;
    private int paino;

    public Tavara(String nimi, int paino) {
        this.nimi = nimi;
        this.paino = paino;
    }

    public Tavara(String nimi) {
        this(nimi, 0);
    }

    public String getNimi() {
        return nimi;
    }

    public int getPaino() {
        return paino;
    }
    
    public boolean equals(Object object) {
    if (this == object) {
        return true;
    }


    if (!(object instanceof Tavara)) {
        return false;
    }

    // muunnetaan olio paivays-olioksi
    Tavara verrattavaTavara = (Tavara) object;

    // jos olioiden oliomuuttujien arvot ovat samat, ovat oliot samat
    if (this.nimi.equals(verrattavaTavara.nimi)  ) {
        return true;
    }

    // muulloin oliot eivät ole samat
    return false;
    }
    
        @Override
    public int hashCode() {
        return Objects.hash(nimi);
    }
}
