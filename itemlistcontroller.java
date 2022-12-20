package application;


import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Observable;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;


public class itemlistcontroller {
	Connection con1;
	PreparedStatement insert;
//	    @FXML private TableView<Product> tableView;
//	    @FXML private TableColumn<Product, String> nameColumn;
//	    @FXML private TableColumn<Product, Double> studentIDColumn;
//	    @FXML private TableColumn<Product, Double> deviceColumn;
//	    @FXML private TableColumn<Product, String> borrowedColumn;
//	    @FXML private TableColumn<Product, String> dueColumn;
	    @FXML
	    private TableView<Product> itemtable;
	    @FXML
	    private TableColumn<Product, String> idcol;
	    @FXML
	    private TableColumn<Product, String> namecol;
	    @FXML
	    private TableColumn<Product, Double> costcol;
	    @FXML
	    private TableColumn<Product, Double> pricecol;
	    @FXML
	    private TableColumn<Product, Integer> quantitycol;
	    @FXML
	    private TableColumn<Product, String> categorycol;
	    String query = null;
	    Connection connection = null ;
	    PreparedStatement preparedStatement = null ;
	   // ResultSet rs = null ;
	    Product student = null ;
	    Stage stage;
		Scene scene;
		Parent root;
		@FXML
		private TextField itemname;
		@FXML
		private TextField saleprice;
		@FXML
		private TextField cost;
		@FXML
		private TextField quantity;
		@FXML
		private TextField category;
		
	    ObservableList<Product>  ItemList = FXCollections.observableArrayList();

	    /**
	     * Initializes the controller class.
	     * @throws SQLException 
	     */
	    public void initialize(URL url, ResourceBundle rb) throws SQLException {
	        
	    	
	    	loadDate();
	    }      
	    
	    public void switchsceneinventory(ActionEvent event) throws IOException {
			
			Parent root = FXMLLoader.load(getClass().getResource("InventoryMenu.fxml"));
			  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			  scene = new Scene(root);
			  stage.setScene(scene);
			  stage.show();
			
		}
	    
	    public void Confirm(ActionEvent event) throws SQLException {
	    		String a = itemname.getText();
	    		String b = cost.getText();
	    		String c = saleprice.getText();
	    		String d = cost.getText();
	    		String e = category.getText();
	    	
	    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stocky","root","");
	    		String Query_String = "INSERT INTO itemtable(productname,cost,saleprice,quantity,Category) VALUES ('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"')";
	    		PreparedStatement pre = con.prepareStatement(Query_String);
	            pre.executeUpdate();
	    	
	    }
	    
	    public void delete(ActionEvent event) {
	    	
	    }
	    
	    public void onclick(ActionEvent e) {
	    	
	    }
	    
	    public void edit(ActionEvent event) {
	    	loadDate();
	    }
	    

	    @FXML
	    private void close(MouseEvent event) {
	        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
	        stage.close();
	    }

	    @FXML
	    private void getAddView(ActionEvent event) {
	        try {
	            Parent parent = FXMLLoader.load(getClass().getResource("AddProduct.fxml"));
	            Scene scene = new Scene(parent);
	            Stage stage = new Stage();
	            stage.setScene(scene);
	            stage.initStyle(StageStyle.UTILITY);
	            stage.show();
	        } catch (IOException ex) {
	            Logger.getLogger(itemlistcontroller.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
	    }

	    @FXML
	    private void refreshTable() {
	    	ResultSet rs;
	        try {
	        	
	            ItemList.clear();
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stocky","root","");
	            query = "SELECT * FROM `itemtable`";
	            preparedStatement = con.prepareStatement(query);
	            rs = preparedStatement.executeQuery();
	            System.out.println("executed2");
	            while (rs.next()){
	            	 if(rs.isAfterLast()) {
		                	System.out.println("last");
		                }
	                ItemList.add(new  Product(
	                		rs.getString("id"),
	                        rs.getString("productname"),
	                        rs.getDouble("cost"),
	                        rs.getDouble("saleprice"),
	                        rs.getInt("quantity"),
	                        rs.getString("category")));
	                itemtable.setItems(ItemList);
	                System.out.println(rs);
	                System.out.println("executed3");
	               
	            }
	            
	            
	        } catch (SQLException ex) {
	            Logger.getLogger(itemlistcontroller.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
	        
	        
	    }
	    


	    @FXML
	    private void print(MouseEvent event) {
	    }

	    private void loadDate() {
	        
	    	 try {
	    		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stocky","root","");
	    		 

			       idcol.setCellValueFactory(cellData -> cellData.getValue().ID);
			       namecol.setCellValueFactory(cellData -> cellData.getValue().productName);
			       costcol.setCellValueFactory(cellData -> (cellData.getValue().cost).asObject());
			       pricecol.setCellValueFactory(cellData -> cellData.getValue().price.asObject());
			       quantitycol.setCellValueFactory(cellData -> cellData.getValue().quantity.asObject());
			       categorycol.setCellValueFactory(cellData -> cellData.getValue().category);
			        System.out.println("Executed1");
			        con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        refreshTable();
	        
	 
	    

	        };
	     
	    
	}