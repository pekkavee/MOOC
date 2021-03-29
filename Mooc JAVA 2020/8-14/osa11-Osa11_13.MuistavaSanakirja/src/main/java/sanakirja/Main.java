package sanakirja;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Testaa sanakirjaa täällä
MuistavaSanakirja s = new MuistavaSanakirja("test-21034.txt");
s.lisaa("tietokone", "computer");
s.tallenna();
    }
}
