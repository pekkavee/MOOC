import java.util.ArrayList;
import java.util.Random;

public class Lottorivi {
    private ArrayList<Integer> numerot;

    public Lottorivi() {
        this.arvoNumerot();
    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
    }

    public boolean sisaltaaNumeron(int numero) {
        // Testaa tässä onko numero jo arvottujen numeroiden joukossa
        for (Integer integer : numerot) {
            if (numero==integer) {
                return true;
            }
        }
        return false;
    }

    public void arvoNumerot() {
        // alustetaan lista numeroille
        this.numerot = new ArrayList<>();
        int numeroita=0;
        // Kirjoita numeroiden arvonta tänne käyttämällä metodia sisaltaaNumeron()
        Random arpoja = new Random(); // luodaan apuväline arpoja
        
        while (true) {
        
        if(numeroita==7) {
            break;
        }
        int luku = arpoja.nextInt(40)+1;
        if(!this.sisaltaaNumeron(luku)) {
            this.numerot.add(luku);
            numeroita++;
          //  System.out.println(numeroita);
        }
        }
    }

    public boolean equals(Object toinen) {
        return false;
    }
}