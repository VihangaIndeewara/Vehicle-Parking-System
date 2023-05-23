package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class LoginFormController {
    public TextField txtUserName;
    public TextField txtPassword;
    public AnchorPane LoginContext;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        if(txtUserName.getText().equals("Vihanga")&&txtPassword.getText().equals("1234")){
           setUi("SystemForm");
        }else{
        new Alert(Alert.AlertType.ERROR,"Wrong password !..").show();
        }
    }

    public void CancelOnAction(ActionEvent actionEvent) throws IOException {
        setUi("DisplayForm");
    }

    private void setUi(String location) throws IOException {
        Stage stage=(Stage) LoginContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../views/"+location+".fxml"))));
        stage.centerOnScreen();
    }
}
