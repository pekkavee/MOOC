
public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne koodia jolla testaat ohjelmoimasi luokan toimintaa
        Raha r1 = new Raha(10, 0);Raha r2 = new Raha(7, 40);Raha r3 = r1.miinus(r2);
        System.out.println(r3);
    }
}
