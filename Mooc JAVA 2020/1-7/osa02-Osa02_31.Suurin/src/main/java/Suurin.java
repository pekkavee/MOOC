
public class Suurin {

    public static int suurin(int luku1, int luku2, int luku3) {
        int suuri = luku1;
        if (luku2>luku1 && luku2>luku3) {
            suuri=luku2;
        } else if (luku3>luku1){
            suuri=luku3;
        }
        return suuri;
    }

    public static void main(String[] args) {
        int vastaus = suurin(2, 7, 3);
        System.out.println("Suurin: " + vastaus);
    }
}
