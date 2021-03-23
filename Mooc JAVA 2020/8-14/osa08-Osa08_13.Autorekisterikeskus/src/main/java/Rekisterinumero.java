
import java.util.Objects;

public class Rekisterinumero {
    // älä muuta luokan jo valmiina olevia osia

    // oliomuuttujille on lisätty määre final, jolloin niiden arvoa ei asetuksen
    // jälkeen voi enää muuttaa
    private final String rekNro;
    private final String maa;

    public Rekisterinumero(String maa, String rekNro) {
        this.rekNro = rekNro;
        this.maa = maa;
    }

    public String getRekNro() {
        return rekNro;
    }

    public String getMaa() {
        return maa;
    }

    @Override
    public String toString() {
        return maa + " " + rekNro;
    }
    
    public boolean equals(Object object) {
    if (this == object) {
        return true;
    }


    if (!(object instanceof Rekisterinumero)) {
        return false;
    }

    // muunnetaan olio paivays-olioksi
    Rekisterinumero verrattavaRekkari = (Rekisterinumero) object;

    // jos olioiden oliomuuttujien arvot ovat samat, ovat oliot samat
    if (this.maa.equals(verrattavaRekkari.maa) &&
        this.rekNro.equals(verrattavaRekkari.rekNro)) {
        return true;
    }

    // muulloin oliot eivät ole samat
    return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(maa, rekNro);
    }

}
