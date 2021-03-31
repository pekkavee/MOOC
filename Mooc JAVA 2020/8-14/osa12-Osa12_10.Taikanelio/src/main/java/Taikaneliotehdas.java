
public class Taikaneliotehdas {
    
    

    public Taikaneliotehdas() {
    }
    
    

    public Taikanelio luoTaikanelio(int n) {

        Taikanelio nelio = new Taikanelio(n);

        // toteuta taikaneliön luominen Siamese method -algoritmilla tänne
        int keskikohta= n/2;
        int rivi=0;
        int luku=0;
        int riviA=0;
        int keskikohtaA=keskikohta;
        for (int i = 0; i < n*n; i++) {

            

            
           /* System.out.println(keskikohta);
            System.out.println(rivi);
            System.out.println("___");*/
          
            

            riviA=rivi;
            keskikohtaA=keskikohta;
           
            nelio.asetaArvo(keskikohta,rivi, i+1);
            keskikohta++;
            if(keskikohta>n-1) {
                keskikohta=0;
            }
            rivi--;
            if (rivi<0) {
                rivi=n-1;
            }
            luku=nelio.annaArvo(keskikohta, rivi);
          //  System.out.println(luku);
            if (luku!=0) {
                rivi=riviA;
                keskikohta=keskikohtaA;
                
                rivi++;
                if(rivi>n-1) {
                    rivi=0;
                }
                
            }
    }
        return nelio;
}
}

       
