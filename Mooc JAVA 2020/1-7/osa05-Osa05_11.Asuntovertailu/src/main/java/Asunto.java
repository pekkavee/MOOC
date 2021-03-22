
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }
    
    public boolean suurempi(Asunto verrattava) {
        if (this.nelioita>verrattava.nelioita) {
            return true;
        } else {
            return false;
        }
    }
    public int hintaero(Asunto verrattava) {
        int hintaero=(this.neliohinta*this.nelioita)-(verrattava.nelioita*verrattava.neliohinta);
        if (hintaero<0) {
            hintaero=hintaero*-1;
        }
        return hintaero;
    }
    public boolean kalliimpi(Asunto verrattava) {
        int hintaero=(this.neliohinta*this.nelioita)-(verrattava.nelioita*verrattava.neliohinta);
        if (hintaero<0) {
            return false;
        }
        return true;
    }

}
       
