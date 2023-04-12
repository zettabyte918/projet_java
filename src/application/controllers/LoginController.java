package application.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private Button btn_login;

    @FXML
    private TextField password;

    @FXML
    private TextField username;

    @FXML
    void Login(ActionEvent event) {
        try {
            // Close current window
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Load profile.fxml and create new window
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/views/profile.fxml"));
            Parent root = loader.load();

            // Get the controller associated with the profile.fxml file
            ProfileController profileController = loader.getController();

            // Set the values of username and role in the ProfileController
            profileController.setUser("john", "Adminn"); // Example username value

            Stage profileStage = new Stage();
            profileStage.setScene(new Scene(root));

            // Show profile window
            profileStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
