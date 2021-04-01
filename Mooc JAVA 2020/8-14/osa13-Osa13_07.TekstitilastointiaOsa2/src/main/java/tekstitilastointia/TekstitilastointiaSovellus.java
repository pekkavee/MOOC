package tekstitilastointia;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TekstitilastointiaSovellus extends Application{
   
    @Override
    public void start(Stage ikkuna) {
        
        TextArea tekstikomponentti = new TextArea();
        BorderPane asettelu = new BorderPane();
        Label teksti = new Label("Kirjaimia: 0");
        Label teksti2 = new Label("Sanoja: 0");
        Label teksti3 = new Label("Pisin sana on:");

        asettelu.setCenter(tekstikomponentti);
 
        HBox tekstit = new HBox();
        tekstit.setSpacing(10);
        tekstit.getChildren().add(teksti);
        tekstit.getChildren().add(teksti2);
        tekstit.getChildren().add(teksti3);
        tekstikomponentti.textProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
            int merkkeja = uusiArvo.length();
            String[] palat = uusiArvo.split(" ");
            int sanoja2 = palat.length;
            String pisin2 = Arrays.stream(palat)
            .sorted((s1, s2) -> s2.length() - s1.length())
            .findFirst()
            .get();
            
            teksti.setText("Kirjaimia: "+merkkeja);
            teksti2.setText("Sanoja: "+sanoja2);
            teksti3.setText("Pisin sana on: "+pisin2);
            

    // asetetaan arvot tekstielementteihin
});   
   
        asettelu.setBottom(tekstit);
        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();
        
    }

    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
    }


}