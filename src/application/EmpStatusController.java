package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EmpStatusController {
	public void back(ActionEvent event) throws IOException
    {
		if(EmpController.emp == 1)
		{
    	Parent tableView = FXMLLoader.load(getClass().getClassLoader().getResource("Emp.fxml"));
    	Scene tableViewscene = new Scene(tableView);
    	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    	window.setScene(tableViewscene);
    	window.show();
    	EmpController.emp = 0;
		}
		if(AdminController.admin == 1)
		{
    	Parent tableView = FXMLLoader.load(getClass().getClassLoader().getResource("Admin.fxml"));
    	Scene tableViewscene = new Scene(tableView);
    	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    	window.setScene(tableViewscene);
    	window.show();
    	AdminController.admin = 0;
		}
    }

}
