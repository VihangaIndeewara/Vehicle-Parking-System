package controller;

import db.driverDataSet;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import model.Driver;


public class AddDriverFormController {
    public TextField txtName;
    public TextField txtNIC;
    public TextField txtLicenseNo;
    public TextField txtAddress;
    public TextField txtContactNo;

    public void AddDriverOnAction(ActionEvent actionEvent)  {
        Driver d=new Driver(txtName.getText(),txtNIC.getText(),txtLicenseNo.getText(),txtAddress.getText(),Integer.parseInt(txtContactNo.getText()));
        if(driverDataSet.driverTable.add(d)){
            new Alert(Alert.AlertType.CONFIRMATION,"Saved!!!").show();
        }else{
            new Alert(Alert.AlertType.ERROR,"Something Wrong!!!").show();
        }

    }
}
