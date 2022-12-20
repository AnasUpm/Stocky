package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class InventoryMenuController {
	Stage stage;
	Scene scene;
	Parent root;
	
	public void switchsceneitemlist(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("Itemlist.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	public void switchback(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("Start.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		
	}
	
}
