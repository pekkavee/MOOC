/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class MuistavaTuotevarasto extends Tuotevarasto{
    private Muutoshistoria muutoshistoria;

    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        super.lisaaVarastoon(alkuSaldo);
        this.muutoshistoria =new Muutoshistoria();
        this.muutoshistoria.lisaa(alkuSaldo);
    }

    public String historia() {
        return this.muutoshistoria.toString();
    }
  
     @Override
    public void lisaaVarastoon(double maara) {
        super.lisaaVarastoon(maara);
        double saldo=super.getSaldo();
        this.muutoshistoria.lisaa(saldo);
    }
    @Override
    public double otaVarastosta(double maara)  {
        double ota = super.otaVarastosta(maara);
        double saldo=super.getSaldo();
        this.muutoshistoria.lisaa(saldo);
        return ota;
       
    }
    
    public void tulostaAnalyysi(){
        System.out.println("Tuote: "+this.getNimi()+"\n"+"Historia: " +muutoshistoria
        +"\nSuurin tuotemäärä: " +muutoshistoria.maxArvo()+
        "\nPienin tuotemäärä: " +muutoshistoria.minArvo()+
         "\nKeskiarvo: " +muutoshistoria.keskiarvo()      );
        
    }
}
    
    

