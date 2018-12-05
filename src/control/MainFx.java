package control;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
/**
 * @author ivan hernandez
 * @version 1
 * @see ControlFx
 * 
 */
public class MainFx extends Application {

    private AnchorPane myPane;

    @Override
    public void start(Stage primaryStage) throws Exception {
        myPane = FXMLLoader.load(getClass().getResource("Profile.fxml"));
        primaryStage.setScene(new Scene(myPane));
        primaryStage.show();
        primaryStage.setTitle("My Github Profile");
        Font.loadFont(getClass().getResourceAsStream("PoiretOne-Regular.ttf"), 20);
	//	m.getStylesheets().add("https://fonts.googleapis.com/css?family=Homemade+Apple");

    }

    public static void main(String[] args) {
        launch(args);
    }

}