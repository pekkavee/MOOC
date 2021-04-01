package sovellukseni;

/*
public class Sovellukseni {
    

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}
*/
import javafx.application.Application;
import javafx.stage.Stage;

public class Sovellukseni extends Application {

    @Override
    public void start(Stage ikkuna) {
        ikkuna.setTitle("Sovellukseni");
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(Sovellukseni.class);
    }
}