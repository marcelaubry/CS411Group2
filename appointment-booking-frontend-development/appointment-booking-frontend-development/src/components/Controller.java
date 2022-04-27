import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker.State;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import netscape.javascript.JSObject;

public class Controller implements Initializable {
    private WebEngine webEngine;
    @FXML private WebView webView;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /* Load the web page URL (location of the resource) */
        webEngine = webView.getEngine();
    }
}