import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class membercontroller {

    @FXML
    private AnchorPane book;

    @FXML
    private TableColumn<?, ?> bookauthor;

    @FXML
    private TableColumn<?, ?> bookcat;

    @FXML
    private TableColumn<?, ?> bookpubname;

    @FXML
    private TableColumn<?, ?> bookpubyear;

    @FXML
    private TableColumn<?, ?> booktitle;

    @FXML
    private Label id;

    @FXML
    private AnchorPane movie;

    @FXML
    private TableColumn<?, ?> moviecat;

    @FXML
    private TableColumn<?, ?> moviedirector;

    @FXML
    private TableColumn<?, ?> movierel;

    @FXML
    private TableColumn<?, ?> movietitle;

    @FXML
    private Label name;

    @FXML
    private TextArea output;

    @FXML
    private TableColumn<?, ?> pubauthor;

    @FXML
    private TableColumn<?, ?> pubcat;

    @FXML
    private TableColumn<?, ?> pubjournal;

    @FXML
    private AnchorPane publication;

    @FXML
    private TableColumn<?, ?> pubpubname;

    @FXML
    private TableColumn<?, ?> pubpubyear;

    @FXML
    private TableColumn<?, ?> pubtitle;

    @FXML
    private AnchorPane search;

    @FXML
    private TextField searchauthor;

    @FXML
    private TextField searchid;

    @FXML
    private TextField searchtitle;

    @FXML
    private AnchorPane welcome;

    @FXML
    private Button closebtn;

    @FXML
    private Button minusbtn;

    @FXML
    void Sign_out(ActionEvent event) {

    }

    @FXML
    void book(ActionEvent event) {

    }

    @FXML
    void movie(ActionEvent event) {

    }

    @FXML
    void publication(ActionEvent event) {

    }

    @FXML
    void search(ActionEvent event) {

    }

    @FXML
    void searchI(ActionEvent event) {

    }

    @FXML
    void searchTA(ActionEvent event) {

    }

    @FXML
    void close(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void minimize(ActionEvent event) {
        Stage stage=(Stage)minusbtn.getScene().getWindow();
        stage.setIconified(true);
    }

}
