package ilmoitin;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class IlmoitinSovellus extends Application{
    

    public static void main(String[] args) {
        launch(IlmoitinSovellus.class);        
        
    }

    @Override
    public void start(Stage ikkuna)  {
        VBox tekstit = new VBox();
        
        Button nappi = new Button("Päivitä");
        TextField tekstikomponentti = new TextField();
        Label teksti = new Label();
        
        nappi.setOnAction((event) -> {
        teksti.setText(tekstikomponentti.getText());
        });
        
        tekstit.setSpacing(10);
        tekstit.getChildren().add(tekstikomponentti);
        tekstit.getChildren().add(nappi);
        tekstit.getChildren().add(teksti);

        //tekstit.getChildren().add(new Label("Pisin sana on:"));
        
        Scene nakyma = new Scene(tekstit);

        ikkuna.setScene(nakyma);
        ikkuna.show();
        
    }

}
