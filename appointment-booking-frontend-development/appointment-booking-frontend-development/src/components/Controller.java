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
        URL url = Controller.class.getResource("/register");
        webEngine = webView.getEngine();
        webEngine.load(url.toExternalForm());
        /* Set the State listener as well as the name of the JavaScript object and its
         * corresponding Java object (the class in which methods will be invoked) that
         * will serve as the bridge for the two objects.
         */
        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<State>() {
            @Override
            public void changed(ObservableValue<? extends State> observableValue, State oldState, State newState) {
                if (newState == State.SUCCEEDED) {
                    JSObject window = (JSObject) webEngine.executeScript("window");
                    /* The two objects are named using the setMember() method. */
                    window.setMember("invoke", new Register());
                }
            }
        });
    }
}