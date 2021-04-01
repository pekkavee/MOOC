package ristinolla;

//import java.awt.Button;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.lang.reflect.Array;

import java.util.ArrayList;
//import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.application.Application;
//import javafx.event.ActionEvent;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
//import javafx.scene.paint.Color;

import java.awt.Color;



import javafx.stage.Stage;


public class RistinollaSovellus extends Application {
private String vuor = "X";
boolean loppu =false;
private String[][] ruudukko=new String[3][3];
private ArrayList<Button>napit= new ArrayList<>();

    public static void main(String[] args) {
        
        launch(RistinollaSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) throws Exception {
        BorderPane asettelu = new BorderPane();

        
        GridPane ruudut = new GridPane();
        Label vuoro = new Label("Vuoro: "+vuor);
        Label vuoro2 = new Label("Nyk: ");
        vuoro.setPadding(new Insets(10, 10, 10, 10));
        Button nappi1 = new Button(" ");
        Button nappi2 = new Button(" ");
        ruudut.setPadding(new Insets(10, 10, 10, 10));
       // ruudut.setHgap(10);
       // ruudut.setVgap(10);       
        Button nappi3 = new Button(" ");     
        Button nappi4 = new Button(" ");     
        Button nappi5 = new Button(" ");     
        Button nappi6 = new Button(" ");     
        Button nappi7 = new Button(" ");     
        Button nappi8 = new Button(" ");     
        Button nappi9 = new Button(" ");   
        
        napit.add(nappi1);
        napit.add(nappi2);
        napit.add(nappi3);
        napit.add(nappi4);
        napit.add(nappi5);
        napit.add(nappi6);
        napit.add(nappi7);
        napit.add(nappi8);
        napit.add(nappi9);
        
        ruudut.add(nappi1, 1, 1);
        ruudut.add(nappi2, 2, 1);
        ruudut.add(nappi3, 3, 1);
        
        ruudut.add(nappi4, 1, 2);
        ruudut.add(nappi5, 2, 2);
        ruudut.add(nappi6, 3, 2);
        
        ruudut.add(nappi7, 1, 3);
        ruudut.add(nappi8, 2, 3);
        ruudut.add(nappi9, 3, 3);   
        
        vuoro.setFont(Font.font ("Verdana", 40));
        
        for (Button button : napit) {
            
        
        button.setMaxWidth(100);
        button.setMaxHeight(100);   
        button.setMinWidth(100);
        button.setMinHeight(100);   
        button.setFont(Font.font ("Verdana", 40)); 
        
        button.setOnMouseClicked((event) -> {
            if(!loppu) {
            String vuoros=vuor;
            String nyk=button.getText();
            int y = ruudut.getRowIndex(button);
            int x = ruudut.getColumnIndex(button);
            

            
            if(nyk.equals("X")||nyk.equals("O")) {
                vuoro2.setText("Nyk: "+x);
            } else {
                
            ruudukko[x-1][y-1]=vuor;

            button.setText(vuor);

            if(vuor=="X") {
               // button. setStyle("-fx-background-color: #ff0000; ");
                vuor="O";
            } else {
               // button. setStyle("-fx-background-color: #7FFF00; ");
                vuor="X";
            }
            vuoro.setText("Vuoro: "+vuor);
            vuoro2.setText("Nyk: "+nyk);
            if(tarkista(ruudukko)){
                vuoro.setText("Loppu!");
                asettelu.setStyle("-fx-background-color: #7FFF00; ");
                loppu=true;
                
            }
            }
            }
        });
        
        }
 
    
        
        
        asettelu.setTop(vuoro);
      //  asettelu.setBottom(vuoro2);
        asettelu.setCenter(ruudut);
        
        Scene nakyma = new Scene(asettelu);

        // 7. Näytetään sovellus
        ikkuna.setScene(nakyma);
        ikkuna.show();
        
    }
    
     public static boolean tarkista(String[][] taulukko)  {     
        boolean voitit=false;
        String nyk="";
        for (int i = 0; i < taulukko.length; i++) {
            int rivissa=0;
            String eka = taulukko[i][0];
            for (int j = 0; j <taulukko.length ; j++) {
                nyk=taulukko[i][j];
                if(nyk!="X" && nyk!="O") {
                    break;
                }               
                if(eka!=nyk) {
                    break;
                } else{
                    rivissa++;
                    if (rivissa==3) {
                        voitit=true;
                        
                    }
                }
                //  System.out.print(ruudukko[i][j]);

            }

           

        }
        String nyk2="";
        for (int i = 0; i <taulukko.length ; i++) {
            int rivissa=0;
            String eka = taulukko[0][i];
            for (int j = 0; j <taulukko.length ; j++) {
                nyk2=taulukko[j][i];
                if(nyk2!="X" && nyk2!="O") {
                    break;
                }
              //  System.out.println(nyk2);
                if(eka!=nyk2 ) {
                    break;
                } else{
                    rivissa++;
                    if (rivissa==3) {
                        voitit=true;
                    }
                }
            }

        }
        
        String ekarivi1=taulukko[0][0];
        String tokarivi1=taulukko[1][1];
        String kolmasrivi1=taulukko[2][2];
        
        String ekarivi2=taulukko[0][2];
        String tokarivi2=taulukko[1][1];
        String kolmasrivi2=taulukko[2][0];
        
        if(ekarivi1==tokarivi1 && tokarivi1==kolmasrivi1) {
            if(ekarivi1!="X" && ekarivi1!="Y") {
                voitit=false;
            } else {
            voitit=true;
            }
        } else if (ekarivi2==tokarivi2 && tokarivi2==kolmasrivi2){
            if(ekarivi2!="X" && ekarivi2!="Y") {
                voitit=false;
            } else {
            voitit=true;
        }
        
        
    }
    return voitit;
       

}
}

