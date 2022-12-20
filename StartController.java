package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartController {
	
	Stage stage;
	Scene scene;
	Parent root;
	
	public void switchsceneinventory(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("InventoryMenu.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	public void switchscenesales(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("Sales.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	

}
