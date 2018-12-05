package control;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlFX {
	@FXML
	JFXButton Boton;
	
	public void sendStage() {
		try {

            // Load the fxml file and create a new stage for the popup.
            Parent root=FXMLLoader.load(getClass().getResource("GetME.fxml"));
            Stage sendStage = new Stage();
            sendStage.setTitle("Send Profile");
            Scene scene = new Scene(root);
            sendStage.setScene(scene);
            
            sendStage.show();

			// clips

			// );
			//
			// ColorAdjust colorAdjust = new ColorAdjust();
			// colorAdjust.setContrast(1);
			// colorAdjust.setHue(0);
			// colorAdjust.setBrightness(0);
			// colorAdjust.setSaturation(0);
			// // ceiling_image.setEffect(colorAdjust);
			// ceiling_image.setEffect(new GaussianBlur(5));
			// refugees.setClip(ceiling);

			
			

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	@FXML
	public void closeStage() {
			Stage thisStage = (Stage) Boton.getScene().getWindow();
			thisStage.close();
			sendStage();
		}
	//public void handleClose() {
	//System.exit(0);
//}
}