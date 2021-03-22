
public class EnsimmainenTilisi {

    public static void main(String[] args) {
        // Tili.Java:ssa olevaan koodiin ei tule koskea
        // tee ohjelmasi tänne
        //Luo tilin nimeltä "Matin tili" saldolla 1000
        //Luo tilin nimeltä "Oma tili" saldolla 0
        //Nostaa matin tililtä 100.0
        //Panee omalle tilille 100.0
        //Tulostaa molemmat tilit
        Tili matinTili = new Tili("Matin tili", 100.0);
      
       
        matinTili.pano(20.0);
        System.out.println(matinTili);
        //System.out.println(omaTili);
    }
}
