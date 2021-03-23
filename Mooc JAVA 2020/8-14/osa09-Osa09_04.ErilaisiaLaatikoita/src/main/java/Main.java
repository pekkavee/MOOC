

public class Main {

    public static void main(String[] args) {
        // Testaa ohjelmaasi täällä
        
Laatikko laatikko = new MaksimipainollinenLaatikko(5);
laatikko.lisaa(new Tavara("a", 1));
laatikko.lisaa(new Tavara("b", 2));
laatikko.lisaa(new Tavara("c", 2));
laatikko.lisaa(new Tavara("d", 1));
laatikko.lisaa(new Tavara("f", 0));
        System.out.println(laatikko.onkoLaatikossa(new Tavara("d")));
    }
}
