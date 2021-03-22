
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Reseptihaku {

    public static void main(String[] args) {
    Scanner lukija = new Scanner(System.in);
    
    ArrayList<Resepti>reseptit=new ArrayList<>();
    int printedLines=0;
    boolean print=false;
    
    System.out.println("Mistä luetaan?");
    String tiedosto=lukija.nextLine();
    System.out.println("");
    String nimi ="";
    String keittoAika="";
    ArrayList<String>ainekset = new ArrayList();
    try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
       

    
    // luetaan tiedostoja kunnes kaikki rivit on luettu

    
    while (tiedostonLukija.hasNextLine()) {
        // luetaan yksi rivi
        String rivi = tiedostonLukija.nextLine();

        //String koko="";
        // tulostetaan luettu rivi
        if (rivi.isEmpty()) {
            printedLines=0;
            Resepti r = new Resepti (nimi, keittoAika, ainekset);
            reseptit.add(r);
            ainekset=new ArrayList();
            
         
        } else {
            printedLines++;
        }
        if (printedLines==1) {           
            nimi = rivi;
            
        } else if (printedLines==2) {
            keittoAika=rivi;
        } else if (printedLines>0) {
            ainekset.add(rivi);
        }
         
      
       
    }
    } catch (Exception e) {
        System.out.println("Virhe: " + e.getMessage());
    }
            Resepti r = new Resepti (nimi, keittoAika, ainekset);
            reseptit.add(r);
        
        System.out.println("Komennot:\n" +
"listaa - listaa reseptit\n" +
"lopeta - lopettaa ohjelman\n" +
"hae nimi - hakee reseptiä nimen perusteella\n" +
"hae keittoaika - hakee reseptiä keittoajan perusteella\n"+
                "hae aine - hakee reseptiä raaka-aineen perusteella\n");
        
    while (true) {
        System.out.println("Syötä komento:");
        String komento = lukija.nextLine();
        if (komento.equals("lopeta")) {
            break;
        } else if(komento.equals("listaa")) {
            System.out.println("Reseptit:");
            for (Resepti resepti: reseptit) {
                System.out.println(resepti.getNimi()+", keittoaika: "+resepti.getKeittoaika());
                
                
            }
        } else if (komento.equals("hae nimi")) {
            System.out.println("Mitä haetaan:");
            String mita = lukija.nextLine();
            for (Resepti resepti: reseptit) {
                if(resepti.getNimi().contains(mita)) {
                    System.out.println(resepti.getNimi()+", keittoaika: "+resepti.getKeittoaika());
                }
                
            }
        } else if (komento.equals("hae keittoaika")) {
            System.out.println("Keittoaika korkeintaan:");
            int aika = Integer.valueOf(lukija.nextLine());
            for (Resepti resepti: reseptit) {
                int keitAika=Integer.valueOf(resepti.getKeittoaika());
                if(keitAika<=aika) {
                    System.out.println(resepti.getNimi()+", keittoaika: "+resepti.getKeittoaika());
                }
                
            }
        } else if (komento.equals("hae aine")) {
            System.out.println("Mitä raaka-ainetta haetaan:");
            String aine =lukija.nextLine();
            for (Resepti resepti: reseptit) {
                if (resepti.getAinekset().contains(aine)) {
                    System.out.println(resepti.getNimi()+", keittoaika: "+resepti.getKeittoaika());
                }
                
            }
        }
        
    } 
        
              
}

}
