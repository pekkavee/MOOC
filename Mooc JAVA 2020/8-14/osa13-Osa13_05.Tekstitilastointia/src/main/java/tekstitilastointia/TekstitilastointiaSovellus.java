package tekstitilastointia;

import java.awt.event.ActionEvent;
import java.beans.EventHandler;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TekstitilastointiaSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
        
        TextArea tekstikomponentti = new TextArea("Tekstielementti");
        BorderPane asettelu = new BorderPane();

        asettelu.setCenter(tekstikomponentti);
        String toCount = tekstikomponentti.getText();
        int pituus = toCount.length();
        

        HBox tekstit = new HBox();
        tekstit.setSpacing(10);
        tekstit.getChildren().add(new Label("Kirjaimia: 0"));
        tekstit.getChildren().add(new Label("Sanoja: 0"));
        tekstit.getChildren().add(new Label("Pisin sana on:"));
       
   
        asettelu.setBottom(tekstit);
        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();
        
    }

    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
    }


}