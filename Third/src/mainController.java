import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import library.Library;

public class mainController {


    @FXML
    private AnchorPane Addanchorpane;

    @FXML
    private Button Bookview;

    @FXML
    private Button additem;

    @FXML
    private Button addmember;

    @FXML
    private AnchorPane addmemberanchor;

    @FXML
    private AnchorPane book;

    @FXML
    private AnchorPane bookanchor;

    @FXML
    private TableColumn<?, ?> bookauthor;

    @FXML
    private TableColumn<?, ?> bookcat;

    @FXML
    private TextField bookpbname;

    @FXML
    private TextField bookpbyear;

    @FXML
    private TableColumn<?, ?> bookpubname;

    @FXML
    private TableColumn<?, ?> bookpunyear;

    @FXML
    private TableColumn<?, ?> booktitle;

    @FXML
    private AnchorPane checkanchor;

    @FXML
    private TextField checkmmbrID;

    @FXML
    private Button checkout;

    @FXML
    private TextArea checktextarea;

    @FXML
    private Button closebtn;

    @FXML
    private RadioButton isjournalno;

    @FXML
    private RadioButton isjournalyes;

    @FXML
    private Button minusbtn;

    @FXML
    private TextField movieCat;

    @FXML
    private TextField movieRelease;

    @FXML
    private TextField movieTitle;

    @FXML
    private AnchorPane movieanchor;

    @FXML
    private TableColumn<?, ?> moviecat;

    @FXML
    private TableColumn<?, ?> moviedirec;

    @FXML
    private TextField moviedirector;

    @FXML
    private TableColumn<?, ?> movierel;

    @FXML
    private TableColumn<?, ?> movietitle;

    @FXML
    private Button movieview;

    @FXML
    private TableColumn<?, ?> pubAuthor;

    @FXML
    private TableColumn<?, ?> pubName;

    @FXML
    private TextField pubauthor;

    @FXML
    private TableColumn<?, ?> pubcat;

    @FXML
    private TableColumn<?, ?> pubjounal;

    @FXML
    private AnchorPane publication;

    @FXML
    private AnchorPane publicationanchor;

    @FXML
    private Button publicationview;

    @FXML
    private TextField pubname;

    @FXML
    private TableColumn<?, ?> pubtitle;

    @FXML
    private TableColumn<?, ?> pubyear;

    @FXML
    private Button singoutbtn;

    @FXML
    void Bookview(ActionEvent event) {
        App.library.get
    }

    @FXML
    void additem(ActionEvent event) {
        //App.library.additem(title, category, authors, publishYear, publisherName);
    }

    @FXML
    void addmember(ActionEvent event) {

    }

    @FXML
    void bookAdd(ActionEvent event) {

    }

    @FXML
    void checkSearch(ActionEvent event) {

    }

    @FXML
    void checkin(ActionEvent event) {

    }

    @FXML
    void checkout(ActionEvent event) {

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

    @FXML
    void movieAdd(ActionEvent event) {
        
    }

    @FXML
    void movieview(ActionEvent event) {

    }

    @FXML
    void pubAdd(ActionEvent event) {

    }

    @FXML
    void publicationview(ActionEvent event) {

    }

    @FXML
    void singOut(ActionEvent event) {

    }

}
