package controller;

import db.deliveryDataSet;
import db.driverDataSet;
import db.parkDataSet;
import db.vehicleDataSet;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.Delivery;
import model.Driver;
import model.Park;
import model.Vehicle;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;



public class DisplayFormController {
    public Label lblDate;
    public Label lblTime;
    public ComboBox<String> cmbSelectVehicle;
    public ComboBox <String >cmbDriver;
    public Button btnPark;
    public Button btnOnDeliveryShift;
    public Label lblSlot;
    public Label lblType;

    int[] vanSlot={1,2,3,4,13,12};
    int[] cargoLorrySlot={5,6,7,8,9,10,11};

    int vCount=0;
    int clCount=0;


    public void initialize() {
        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, event -> {
            LocalTime time = LocalTime.now();
            LocalDate date = LocalDate.now();
            lblTime.setText(time.getHour() + " : " + time.getMinute() + " : " + time.getSecond());
            lblDate.setText(date.getYear() + "-" + date.getMonthValue() + "-" + date.getDayOfMonth());


        }),
                new KeyFrame(Duration.seconds(1))
        );
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();

        loadData();


    }

    private void loadData() {
        ObservableList<String > observableList= FXCollections.observableArrayList();
        for (Vehicle v:vehicleDataSet.vehicleTable){
            observableList.add(v.getNumber());
        }
        cmbSelectVehicle.setItems(observableList);


        ObservableList<String > obList=FXCollections.observableArrayList();
        for (Driver d: driverDataSet.driverTable){
            obList.add(d.getName());
        }
        cmbDriver.setItems(obList);

    }


    public void btnManagementLoginOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../views/LoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }




    public void checkSlotAvalability(){
        if(lblType.getText().equals("Van")){
            for (int i = vCount; i < vanSlot.length; i++) {
               vCount++;
               lblSlot.setText(String.valueOf(vanSlot[i]));
               return;
                }
            }
        else if (lblType.getText().equals("Cargo Lorry")){
            for (int i = clCount; i < cargoLorrySlot.length; i++) {
                vCount++;
                lblSlot.setText(String.valueOf(cargoLorrySlot[i]));
                return;
                }
            }
        else if(lblType.getText().equals("Bus")){
            lblSlot.setText("14");
        }

        }


    public void btnParkVehicleOnAction(ActionEvent actionEvent) {
        Park p=new Park( cmbSelectVehicle.getValue(),lblType.getText(),Integer.parseInt(lblSlot.getText()) ,lblDate.getText(),lblTime.getText());
        if (parkDataSet.parkTable.add(p)) {
            new Alert(Alert.AlertType.CONFIRMATION, "Added!!!").show();
        } else {
            new Alert(Alert.AlertType.ERROR, "Not Added!!!").show();
        }


    }

    public void btnOnDeliveryShiftOnAction(ActionEvent actionEvent) {
        Delivery d = new Delivery( cmbSelectVehicle.getValue(),lblType.getText(), (String) cmbDriver.getValue(), lblDate.getText(), lblTime.getText());
        if (deliveryDataSet.deliveryTable.add(d)) {
            new Alert(Alert.AlertType.CONFIRMATION, "Added!!!").show();

        } else {
            new Alert(Alert.AlertType.ERROR, "Not Added!!!").show();
        }
    }



    public void SelectVehicleOnAction(ActionEvent actionEvent) {

        for (Vehicle v: vehicleDataSet.vehicleTable) {
            if(v.getNumber().equals(cmbSelectVehicle.getValue())){
                lblType.setText(v.getType());
            }
        }




        for(Delivery d : deliveryDataSet.deliveryTable){
           if( d.getvNo().equals(cmbSelectVehicle.getValue())){
               checkSlotAvalability();
               btnOnDeliveryShift.setDisable(true);

           }
           else {
               btnOnDeliveryShift.setDisable(false);
           }
        }

        for(Park p : parkDataSet.parkTable){
            if( p.getvNo().equals(cmbSelectVehicle.getValue())){
                btnOnDeliveryShift.setDisable(true);
            }
            else {
                btnOnDeliveryShift.setDisable(false);
            }
        }

    }


}
