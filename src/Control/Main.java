package Control;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws IOException {
	 	FXMLLoader loader = new FXMLLoader(getClass().getResource("CalculatorPanel.fxml"));
	 	 
	 	CalculateController cController = new CalculateController(new ValueModel());
	 	loader.setController(cController);
	 	Parent root = loader.load();
	
        Scene scene = new Scene(root, 300, 275);
        
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
