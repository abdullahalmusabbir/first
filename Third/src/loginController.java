import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginController {

    @FXML
    private TextField name;

    @FXML
    private PasswordField password;

    @FXML
    void close(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void login(ActionEvent event) {

    }

}
