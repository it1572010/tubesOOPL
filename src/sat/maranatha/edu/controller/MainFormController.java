/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sat.maranatha.edu.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sat.maranatha.edu.MainApp;

/**
 * FXML Controller class
 *
 * @author Anthony (1572010)
 */
public class MainFormController implements Initializable {

    @FXML
    private RadioButton radioEasy;
    @FXML
    private RadioButton radioMedium;
    @FXML
    private RadioButton radioHard;
    @FXML
    private RadioButton radioCustom;
    @FXML
    private Button btnStart;
    @FXML
    private Button btnClose;
    @FXML
    private TextField txtPanjang;
    @FXML
    private TextField txtLebar;
    public ToggleGroup group;
    private Stage ularTanggaEasyForm;
    private Stage ularTanggaMediumForm;
    private Stage ularTanggaHardForm;
    private Stage ularTanggaCustomForm;
    @FXML
    private BorderPane borderPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        group = new ToggleGroup();
        radioEasy.setToggleGroup(group);
        radioMedium.setToggleGroup(group);
        radioHard.setToggleGroup(group);
        radioCustom.setToggleGroup(group);
        radioEasy.setSelected(true);
        txtLebar.setDisable(true);
        txtPanjang.setDisable(true);
        radioCustom.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                txtLebar.setDisable(false);
                txtPanjang.setDisable(false);
            }
        });
        radioEasy.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                txtLebar.setDisable(true);
                txtPanjang.setDisable(true);
            }
        });
        radioMedium.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                txtLebar.setDisable(true);
                txtPanjang.setDisable(true);
            }
        });
        radioHard.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                txtLebar.setDisable(true);
                txtPanjang.setDisable(true);
            }
        });
    }

    @FXML
    private void btnStartClicked(ActionEvent event) {
        if (group.getSelectedToggle().equals(radioEasy)) {
            System.out.println("Easy");
            try {
                if (ularTanggaEasyForm == null) {
                    ularTanggaEasyForm = new Stage();
                    ularTanggaEasyForm.setTitle("Ular Tangga Easy");
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(MainApp.class.getResource("view/UlarTanggaEasy.fxml"));
                    BorderPane root = loader.load();
                    Scene scene = new Scene(root);
                    ularTanggaEasyForm.setScene(scene);
                    ularTanggaEasyForm.initOwner(borderPane.getScene().getWindow());
                    ularTanggaEasyForm.initModality(Modality.WINDOW_MODAL);
                }
                if (!ularTanggaEasyForm.isShowing()) {
                    ularTanggaEasyForm.show();
                } else {
                    ularTanggaEasyForm.toFront();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (group.getSelectedToggle().equals(radioMedium)) {
            System.out.println("Medium");
            try {
                if (ularTanggaMediumForm == null) {
                    ularTanggaMediumForm = new Stage();
                    ularTanggaMediumForm.setTitle("Ular Tangga Medium");
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(MainApp.class.getResource("view/UlarTanggaMedium.fxml"));
                    BorderPane root = loader.load();
                    Scene scene = new Scene(root);
                    ularTanggaMediumForm.setScene(scene);
                    ularTanggaMediumForm.initOwner(borderPane.getScene().getWindow());
                    ularTanggaMediumForm.initModality(Modality.WINDOW_MODAL);
                }
                if (!ularTanggaMediumForm.isShowing()) {
                    ularTanggaMediumForm.show();
                } else {
                    ularTanggaMediumForm.toFront();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (group.getSelectedToggle().equals(radioHard)) {
            System.out.println("Hard");
            try {
                if (ularTanggaHardForm == null) {
                    ularTanggaHardForm = new Stage();
                    ularTanggaHardForm.setTitle("Ular Tangga Hard");
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(MainApp.class.getResource("view/UlarTanggaHard.fxml"));
                    BorderPane root = loader.load();
                    Scene scene = new Scene(root);
                    ularTanggaHardForm.setScene(scene);
                    ularTanggaHardForm.initOwner(borderPane.getScene().getWindow());
                    ularTanggaHardForm.initModality(Modality.WINDOW_MODAL);
                }
                if (!ularTanggaHardForm.isShowing()) {
                    ularTanggaHardForm.show();
                } else {
                    ularTanggaHardForm.toFront();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (group.getSelectedToggle().equals(radioCustom)) {
            int panjang = Integer.valueOf(txtPanjang.getText());
            int lebar = Integer.valueOf(txtLebar.getText());
            System.out.println("custom");
            System.out.println(panjang + "x" + lebar);
            try {
                if (ularTanggaCustomForm == null) {
                    ularTanggaCustomForm = new Stage();
                    ularTanggaCustomForm.setTitle("Ular Tangga Custom");
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(MainApp.class.getResource("view/UlarTanggaCustom.fxml"));
                    BorderPane root = loader.load();
                    Scene scene = new Scene(root);
                    ularTanggaCustomForm.setScene(scene);
                    ularTanggaCustomForm.initOwner(borderPane.getScene().getWindow());
                    ularTanggaCustomForm.initModality(Modality.WINDOW_MODAL);
                }
                if (!ularTanggaCustomForm.isShowing()) {
                    ularTanggaCustomForm.show();
                } else {
                    ularTanggaCustomForm.toFront();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    @FXML
    private void btnCloseClicked(ActionEvent event) {
        Platform.exit();
    }

}
