package validointi;

public class Henkilo {

    private String nimi;
    private int ika;

    public Henkilo(String nimi, int ika) {
        
        if (nimi==null) {
           throw new IllegalArgumentException("Nimi ei kelpaa");        
        } else if (nimi.isEmpty()||nimi.length()>40) {
            throw new IllegalArgumentException("Nimi ei kelpaa");
        } else if (ika <0 || ika>120) {
            throw new IllegalArgumentException("Ikä ei kelpaa");
        }
        this.nimi = nimi;
        this.ika = ika;
    }

    public String getNimi() {
        return nimi;
    }

    public int getIka() {
        return ika;
    }
}
