
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {

        Vitsipankki vitsit = new Vitsipankki();
vitsit.lisaaVitsi("Vitsi vitsi 1");
vitsit.lisaaVitsi("Vitsi vitsi 2");
vitsit.lisaaVitsi("Vitsi vitsi 3");
Scanner lukija = new Scanner(System.in);

Kayttoliittyma liittyma = new Kayttoliittyma(vitsit, lukija);
liittyma.kaynnista();
}
}