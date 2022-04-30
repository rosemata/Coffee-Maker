

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class MyController implements Initializable {
	
	public Button b1;
	public Button b2;
	public Button b3;
	public Button b4;
	public Button b5;
	public Button b6;
	
	public Label l1;
	public Label l2;
	public Label flag_label;
	public TextField t2;
	
	int orderNum = 0;
	ArrayList<String> arr1;
	double total = 0;
	int flag = 0;
	@FXML
	private ListView<String> listView;
	
	@FXML
	private ListView<String> listView2;
	
	ObservableList<String> listItems = FXCollections.observableArrayList(" ");        
	ObservableList<String> listItems2 = FXCollections.observableArrayList("Previous Orders ");   
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		listView.setItems(listItems);
	}
	
	// new order
	public void newOrder() {
		arr1 = new ArrayList<>();
		flag = 2;
		l2.setText(" ");
		listItems.add("Add Items Here");
		arr1.add("Order #" + orderNum);
		l2.setText(" ");
	}
	
	// delete order
	public void delOrder() {
		flag = 0;
		arr1 = new ArrayList<>();
		l2.setText(" ");
		listItems.clear();
		
		total = 0;
		l1.setText("Total: " + total);
	}
	
	// submit order
	public void handleButton0() {
		arr1.add("Total: " + total);
		arr1.add(" ");
		listItems2.addAll(arr1);
		listView2.setItems(listItems2);
		listItems2.add(" ");
		orderNum++;
		flag = 0;
		total = 0;
		listItems.clear();
		l1.setText("Total: " + total);
	}
	
	// order 1 coffee
	public void handleButton1() {
		if (flag == 0) {
			l2.setText("Click New Order");
		}
		else {
			flag = 1;
			listItems.add(" ");
			Coffee order = new BasicCoffee();
			double coffee_cost = order.makeCoffee();
			String reg_coffee1 = "$" + coffee_cost + "  Regular Coffee ";
			arr1.add(reg_coffee1);
			listItems.add(reg_coffee1);
			total+= coffee_cost;
			l1.setText("Total: " + total);
			
			System.out.println("+ 3.99	Regular Coffee ");
		}
	}
	
	// sugar
	public void handleButton2() {
		
		if (flag == 0 || flag == 2) {
			l2.setText("Must order coffee first");
		}
		else {	
			Coffee order = new BasicCoffee();
			Coffee order1 = new Sugar(new BasicCoffee());
			double coffee_cost = order1.makeCoffee() - order.makeCoffee();
			String reg_coffee1 = "	+ $" + coffee_cost + "  Add Sugar ";
			arr1.add(reg_coffee1);
			listItems.add(reg_coffee1);
			total+= coffee_cost;
			l1.setText("Total: " + total);
		}
	}
	
	//cream
	public void handleButton3() {
		if (flag == 0 || flag == 2) {
			l2.setText("Must order coffee first");
		}
		else {
			Coffee order = new BasicCoffee();
			Coffee order1 = new Cream(new BasicCoffee());
			double coffee_cost = order1.makeCoffee() - order.makeCoffee();
			String reg_coffee1 = "	+ $" + coffee_cost + "  Add Cream ";
			arr1.add(reg_coffee1);
			listItems.add(reg_coffee1);
			total+= coffee_cost;
			l1.setText("Total: " + total);
		}
	}
	
	// shot
	public void handleButton4() {
		if (flag == 0 || flag == 2) {
			l2.setText("Must order coffee first");
		}
		else {
			
			
			Coffee order = new BasicCoffee();
			Coffee order1 = new ExtraShot(new BasicCoffee());
			double coffee_cost = order1.makeCoffee() - order.makeCoffee();
			coffee_cost = Math.round(coffee_cost*100)/100 + .20;
			String reg_coffee1 = "	+ $" + coffee_cost + "  Add Shot ";
			arr1.add(reg_coffee1);
			listItems.add(reg_coffee1);
			total+= coffee_cost;
			l1.setText("Total: " + total);
		}
	}
	
	// vanilla
	public void handleButton5() {
		if (flag == 0 || flag == 2) {
			l2.setText("Must order coffee first");
		}
		else {
			Coffee order = new BasicCoffee();
			Coffee order1 = new Vanilla(new BasicCoffee());
			double coffee_cost = order1.makeCoffee() - order.makeCoffee();
			String reg_coffee1 = "	+ $" + coffee_cost + "  Add Vanilla ";
			arr1.add(reg_coffee1);
			listItems.add(reg_coffee1);
			total+= coffee_cost;
			l1.setText("Total: " + total);
		}
	}
	
	//caramel
	public void handleButton6() {
		if (flag == 0 || flag == 2) {
			l2.setText("Must order coffee first");
		}
		else {
			
			Coffee order = new BasicCoffee();
			Coffee order1 = new Caramel(new BasicCoffee());
			double coffee_cost = order1.makeCoffee() - order.makeCoffee();
			String reg_coffee1 = "	+ $" + coffee_cost + "  Add Caramel ";
			arr1.add(reg_coffee1);
			listItems.add(reg_coffee1);
			total+= coffee_cost;
			l1.setText("Total: " + total);
		}
	}
	
}
