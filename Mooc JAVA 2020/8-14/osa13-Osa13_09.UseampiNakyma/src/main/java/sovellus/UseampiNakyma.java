package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UseampiNakyma extends Application{

    public static void main(String[] args) {
        launch(UseampiNakyma.class);  
        
    }

    @Override
    public void start(Stage ikkuna) throws Exception {
       BorderPane asettelu = new BorderPane();
       Label teksti = new Label("Eka näkymä");
       Label tekstiq = new Label("Toka näkymä");
       Label tekstiz = new Label("Kolmas näkymä!");
       Button nappi = new Button("Tokaan näkymään!");
       Button seuraavaan = new Button("Kolmanteen näkymään");
       Button takaisin = new Button("Ekaan näkymään!");
       
       VBox tokaNakyma = new VBox();
       
       
       tokaNakyma.setSpacing(10);
       tokaNakyma.getChildren().add(seuraavaan);
       tokaNakyma.getChildren().add(tekstiq);
      // tokaNakyma.getChildren().add(teksti);
      
       GridPane gp = new GridPane();
       
       gp.add(tekstiz, 0, 0);
       gp.add(takaisin, 1, 1);
  
      
       asettelu.setCenter(nappi);
       asettelu.setTop(teksti);
       Scene nakyma = new Scene(asettelu);
       Scene toka = new Scene(tokaNakyma);
       Scene kolmas = new Scene(gp);

       nappi.setOnAction((event) -> {
          ikkuna.setScene(toka);
       });
       
        seuraavaan.setOnAction((event) -> {
          ikkuna.setScene(kolmas);
       });
        
       takaisin.setOnAction((event) -> {
          ikkuna.setScene(nakyma);
       });
       
       
       ikkuna.setScene(nakyma);
       ikkuna.show();
        
    }
    

}
