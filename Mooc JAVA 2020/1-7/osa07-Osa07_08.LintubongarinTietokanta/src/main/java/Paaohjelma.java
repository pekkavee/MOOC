
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // HUOM! Älä luo ohjelmassa muita Scanner-olioita. Jos ja toivottavasti
        // kun teet muita luokkia, anna allaoleva Scanner-olio niille
        // tarvittaessa parametrina.

        Scanner lukija = new Scanner(System.in);
        LintuTilasto tilasto=new LintuTilasto();

        
        while(true) {
            
            
            System.out.println("?");
            
            String komento=lukija.nextLine();
            
            if (komento.equals("Lopeta")) {
                break;
            }
            
            if(komento.equals("Lisaa")) {
                System.out.println("Nimi:");
                String nimi = lukija.nextLine();
                System.out.println("Latinankielinen Nimi:");
                String nimiLat = lukija.nextLine();
                Lintu lintu =new Lintu(nimi, nimiLat);
                tilasto.lisaa(lintu);
                
            } else if(komento.equals("Havainto")) {
                System.out.println("Mikä havaittu?");
                String mika = lukija.nextLine();
                tilasto.lisaaHavainto(mika);
                
            } else if(komento.equals("Tilasto")) {
                tilasto.tulostaKaikki();
            } else if(komento.equals("Nayta")) {
                System.out.println("Mikä?");
                String mika = lukija.nextLine();
                tilasto.tulostaYksi(mika);
            }
            
            
        }
    }

}
