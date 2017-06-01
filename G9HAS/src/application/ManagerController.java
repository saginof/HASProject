package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ManagerController implements Initializable{

	@FXML
	private Hyperlink linkLogout;

	@FXML
	private Label lblUser;

	@FXML
	void logoutHandler(ActionEvent event) {
		Parent user_parent;
		try {
			user_parent = FXMLLoader.load(getClass().getResource("../gui/loginWindow.fxml"));
			Scene user_scene = new Scene(user_parent);
			Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
			stage.setScene(user_scene);
			stage.show();  

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblUser.setText(LoginController.userName);
	}
}
