package sovellus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


// END SOLUTION
public class SanaharjoitteluSovellus extends Application{
    
        private Sanakirja sanakirja;

    @Override
    public void init() throws Exception {
        // 1. Luodaan sovelluksen käyttämä sanakirja
        this.sanakirja = new Sanakirja();
    }


    public static void main(String[] args) {
        launch(SanaharjoitteluSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) throws Exception {
        
        Harjoittelunakyma harjoittelunakyma = new Harjoittelunakyma(sanakirja);
        
        HBox valikko = new HBox();
        BorderPane asetelma = new BorderPane();

        valikko.setPadding(new Insets(20, 20, 20, 20));
        valikko.setSpacing(10);
        GridPane asettelu = new GridPane();

        Label sanaohje = new Label("Sana");
        TextField sanakentta = new TextField();
        Label kaannosohje = new Label("Käännös");
        TextField kaannoskentta = new TextField();

        asettelu.setAlignment(Pos.CENTER);
        asettelu.setVgap(10);
        asettelu.setHgap(10);
        asettelu.setPadding(new Insets(10, 10, 10, 10));
        // 1.2. Luodaan valikon napit
        Button eka = new Button("Lisää sanoja");
        Button toka = new Button("Harjoittele");
        Label teksti = new Label("Sana:");
        Label teksti2 = new Label("Käännös:");
        Button lisaa = new Button("Lisää sanapari");
        
        valikko.getChildren().addAll(eka, toka);
        
        
        asettelu.add(sanaohje, 0, 0);
        asettelu.add(sanakentta, 0, 1);
        asettelu.add(kaannosohje, 0, 2);
        asettelu.add(kaannoskentta, 0, 3);
        asettelu.add(lisaa, 0, 4);

        asetelma.setTop(valikko);
        asetelma.setCenter(asettelu);
        
        Scene nakyma = new Scene(asetelma);

        ikkuna.setScene(nakyma);
        ikkuna.show();
        
        toka.setOnAction((event) -> asetelma.setCenter(harjoittelunakyma.getNakyma()));

        eka.setOnAction((event) -> asetelma.setCenter(asettelu));
        
        lisaa.setOnMouseClicked((event) -> {
            String sana = sanakentta.getText();
            String kaannos = kaannoskentta.getText();

            sanakirja.lisaa(sana, kaannos);

            sanakentta.clear();
            kaannoskentta.clear();
        });


    }
}
