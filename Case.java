package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author hocin
 */
public class Case extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("Start.fxml"));
            Scene scene = new Scene(parent);
            scene.setFill(Color.TRANSPARENT);
            primaryStage.setScene(scene);
            primaryStage.initStyle(StageStyle.TRANSPARENT);
            primaryStage.show();
       //     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
        
//           
//           pre. setNString(1, "1");
//           pre. setNString(2, "2341");
//           pre. setNString(3, "43224");
//           pre.executeUpdate();
//            String Text1 = "2";
//            String Text2 = "3";
//            String Text3 = "2";
//            String Text4 = "3";
//            String Text5 = "3";
//            String Query_String = "INSERT INTO itemlist(productname,cost,saleprice,quantity,Category) VALUES ('"+Text1+"','"+Text2+"','"+Text2+"','"+Text2+"','"+Text2+"')";
//            //pre.executeUpdate(Query_String);
//            PreparedStatement pre = con.prepareStatement(Query_String);
//            pre.executeUpdate();

        } catch (IOException ex) {
            Logger.getLogger(Case.class.getName()).log(Level.SEVERE, null, ex);
        }
//        } catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
