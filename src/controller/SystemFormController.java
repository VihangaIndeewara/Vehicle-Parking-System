package controller;


import db.deliveryDataSet;
import db.parkDataSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Delivery;
import model.Park;
import views.TM.DeliveryTM;
import views.TM.ParkTM;

import java.io.IOException;
import java.net.URL;

public class SystemFormController {
    public AnchorPane SystemFormContext;
    public ComboBox cmbSystem;
    public TableColumn colOne;
    public TableColumn colTwo;
    public TableColumn colThree;
    public TableColumn colFour;
    public TableView tblSystem;
    public TableColumn colFive;


    public void initialize() {
        cmbSystem.getItems().add("In Parking");
        cmbSystem.getItems().add("On Delivery");

    }

    public void AddVehicleOnAction(ActionEvent actionEvent) {
        try {
            setUi("AddVehicleForm");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void AddDriverOnAction(ActionEvent actionEvent) {
        try {
            setUi("AddDriverForm");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setUi(String location) throws IOException {
        URL resource = getClass().getResource("../views/"+location+".fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene=new Scene(load);
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void LogOutOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=(Stage) SystemFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../views/DisplayForm.fxml"))));
        stage.centerOnScreen();
    }

    public void SystemTypeOnAction(ActionEvent actionEvent) throws IOException {
        if(cmbSystem.getValue().equals("On Delivery")) {
            colOne.setText("Vehicle Number");
            colTwo.setText("Vehicle Type");
            colThree.setText("Driver Name");
            colFour.setText("Left Date");
            colFive.setText("Left Time");

            colOne.setCellValueFactory(new PropertyValueFactory("vNo"));
            colTwo.setCellValueFactory(new PropertyValueFactory("type"));
            colThree.setCellValueFactory(new PropertyValueFactory("dName"));
            colFour.setCellValueFactory(new PropertyValueFactory("date"));
            colFive.setCellValueFactory(new PropertyValueFactory("time"));

           ObservableList <DeliveryTM> obList= FXCollections.observableArrayList();
                for (Delivery d : deliveryDataSet.deliveryTable) {
                    DeliveryTM dtm =new DeliveryTM(d.getvNo(),d.getType(),d.getdName(),d.getDate(),d.getTime());
                    obList.add(dtm);

                }
            tblSystem.setItems(obList);





        }else if (cmbSystem.getValue().equals("In Parking")) {
            colOne.setText("Vehicle Number");
            colTwo.setText("Vehicle Type");
            colThree.setText("Parking Slot");
            colFour.setText("Parked Date");
            colFive.setText("Parked Time");

            colOne.setCellValueFactory(new PropertyValueFactory("vNo"));
            colTwo.setCellValueFactory(new PropertyValueFactory("type"));
            colThree.setCellValueFactory(new PropertyValueFactory("slot"));
            colFour.setCellValueFactory(new PropertyValueFactory("date"));
            colFive.setCellValueFactory(new PropertyValueFactory("time"));

            ObservableList<ParkTM> list =FXCollections.observableArrayList();
                for(Park p : parkDataSet.parkTable){
                    ParkTM ptm=new ParkTM(p.getvNo(),p.getType(),p.getSlot(),p.getDate(),p.getTime());
                    list.add(ptm);
                }
                tblSystem.setItems(list);
        }
    }
}
