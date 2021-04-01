package sovellus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class VitsiSovellus extends Application{


    public static void main(String[] args) {
        launch(VitsiSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) throws Exception {
        BorderPane asettelu = new BorderPane();
        StackPane ekaAsettelu = luoNakyma("What do you call a bear with no teeth?");
        StackPane tokaAsettelu = luoNakyma("A gummy bear.");
        StackPane kolmasAsettelu = luoNakyma("Tässä seöitystästä");
        
        asettelu.setCenter(ekaAsettelu);
        // 1.1. Luodaan päätason asettelun valikko
        HBox valikko = new HBox();
        valikko.setPadding(new Insets(20, 20, 20, 20));
        valikko.setSpacing(10);

        // 1.2. Luodaan valikon napit
        Button eka = new Button("Vitsi");
        Button toka = new Button("Vastaus");
        Button kolmas = new Button("Selitys");
        
        eka.setOnAction((event) -> asettelu.setCenter(ekaAsettelu));
        toka.setOnAction((event) -> asettelu.setCenter(tokaAsettelu));
        kolmas.setOnAction((event) -> asettelu.setCenter(kolmasAsettelu));

        // 1.3. Lisätään napit valikkoon
        valikko.getChildren().addAll(eka, toka, kolmas);

        asettelu.setTop(valikko);
        
        Scene nakyma = new Scene(asettelu);


        // 4. Näytetään sovellus
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
    
    private StackPane luoNakyma(String teksti) {

        StackPane asettelu = new StackPane();
        asettelu.setPrefSize(300, 180);
        asettelu.getChildren().add(new Label(teksti));
        asettelu.setAlignment(Pos.CENTER);

        return asettelu;
    }
}
