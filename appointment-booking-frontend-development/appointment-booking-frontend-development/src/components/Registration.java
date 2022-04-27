import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.*;

public class Registration extends Application {

    @Override
    public void start(Stage stage) {
        try{
            Parent root = FXMLLoader.load(Registration.class.getResource("./components/register.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch(IOException |NullPointerException e) {
            //LOGGER.log(Level.SEVERE, e.toString(), e);
            //System.exit(0);
            System.out.println("catch reached");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
