
import java.util.Date;


public class Paivays {

    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivays(int paiva, int kuukausi, int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }

    @Override
    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    public boolean aiemmin(Paivays verrattava) {
        if (this.vuosi < verrattava.vuosi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi
                && this.kuukausi < verrattava.kuukausi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi
                && this.kuukausi == verrattava.kuukausi
                && this.paiva < verrattava.paiva) {
            return true;
        }

        return false;
    }

    public int erotusVuosissa(Paivays verrattava) {
        if (aiemmin(verrattava)) {
            return verrattava.erotusVuosissa(this);
        }

        int vuosiPois = 0;

        if (this.kuukausi < verrattava.kuukausi) {
            vuosiPois = 1;
        } else if (this.kuukausi == verrattava.kuukausi && this.paiva < verrattava.paiva) {
            vuosiPois = 1;
        }

        return this.vuosi - verrattava.vuosi - vuosiPois;
    }
    public boolean equals(Object object) {
    if (this == object) {
        return true;
    }


    if (!(object instanceof Paivays)) {
        return false;
    }

    // muunnetaan olio paivays-olioksi
    Paivays verrattavaPaivays = (Paivays) object;

    // jos olioiden oliomuuttujien arvot ovat samat, ovat oliot samat
    if (this.vuosi==verrattavaPaivays.vuosi &&
        this.kuukausi==verrattavaPaivays.kuukausi &&
        this.paiva==verrattavaPaivays.paiva) {
        return true;
    }

    // muulloin oliot eivät ole samat
    return false;
    }

}

    
