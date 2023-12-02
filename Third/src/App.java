import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import library.DataHandler;
import library.Library;
 
public class App extends Application {

    static Library library = null;

    public static void main(String[] args) {
        try{
            library=DataHandler.loadData();
        }catch(ClassNotFoundException | IOException e)
        {
            e.printStackTrace();
        }    
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        try {
   
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("Khan Books");
            //primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.setScene(scene);
            primaryStage.show();
            
           } catch(Exception e) {
            e.printStackTrace();
           }
    }
}



// @FXML
//     void close(ActionEvent event) {
//         System.exit(0);
//     }

//     @FXML
//     void minimize(ActionEvent event) {
//         Stage stage=(Stage)minusbtn.getScene().getWindow();
//         stage.setIconified(true);
//     }