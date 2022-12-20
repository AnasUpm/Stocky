package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Product {
	
	 public  SimpleStringProperty ID = new SimpleStringProperty();
	    public  SimpleStringProperty productName = new SimpleStringProperty();
	    public  SimpleDoubleProperty cost = new SimpleDoubleProperty();
	    public  SimpleDoubleProperty price = new SimpleDoubleProperty();
	    public  SimpleIntegerProperty quantity = new SimpleIntegerProperty();
	    public  SimpleStringProperty category = new SimpleStringProperty();
	    //public SimpleStringProperty
	    
	    
	    
	    
		public Product(String id, String pname, double cost, double sprice, int qty, String ctg) {
			// TODO Auto-generated constructor stub
			 this.ID = new SimpleStringProperty(id);
			 this.productName = new SimpleStringProperty(pname);
			 this.cost = new SimpleDoubleProperty(cost);
			 this.price = new SimpleDoubleProperty(sprice);
			 this.quantity = new SimpleIntegerProperty(qty);
			 this.category = new SimpleStringProperty(ctg);
		}
		public SimpleStringProperty getID() {
			return ID;
		}
//		public Product(SimpleStringProperty iD, SimpleStringProperty productName, SimpleStringProperty cost,
//				SimpleStringProperty price, SimpleIntegerProperty quantity, SimpleStringProperty category) {
//			super();
//			ID = iD;
//			this.productName = productName;
//			this.cost = cost;
//			this.price = price;
//			this.quantity = quantity;
//			this.category = category;
//		}
//		public Product(String string, String string2, String string3, String string4, String string5, String string6) {
//			// TODO Auto-generated constructor stub
//		}
		public void setID(SimpleStringProperty iD) {
			ID = iD;
		}
		public String getProductName() {
			return productName.get();
		}
		public void setProductName(SimpleStringProperty productName) {
			this.productName = productName;
		}
		public double getCost() {
			return cost.get();
		}
		public void setCost(SimpleDoubleProperty cost) {
			this.cost = cost;
		}
		public double getPrice() {
			return price.get();
		}
		public void setPrice(SimpleDoubleProperty price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity.get();
		}
		public void setQuantity(SimpleIntegerProperty quantity) {
			this.quantity = quantity;
		}
		public String getCategory() {
			return category.get();
		}
		public void setCategory(SimpleStringProperty category) {
			this.category = category;
		}
	
	
	

	

}
