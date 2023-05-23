package controller;

import db.vehicleDataSet;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import model.Vehicle;



public class AddVehicleFormController {
    public TextField txtNumber;
    public TextField txtWeight;
    public TextField txtPassenger;
    public ComboBox cmbType;

public void initialize(){
    cmbType.getItems().add("Van");
    cmbType.getItems().add("Cargo Lorry");
    cmbType.getItems().add("Bus");
    }


    public void AddVehicleOnAction(ActionEvent actionEvent) {
        Vehicle v=new Vehicle(txtNumber.getText(),(String) cmbType.getValue(), Integer.parseInt(txtWeight.getText()),Integer.parseInt(txtPassenger.getText()));
        if(vehicleDataSet.vehicleTable.add(v)){
            new Alert(Alert.AlertType.CONFIRMATION,"Saved!!!").show();
        }else{
            new Alert(Alert.AlertType.ERROR,"Something Wrong!!!").show();
        }

    }

}
