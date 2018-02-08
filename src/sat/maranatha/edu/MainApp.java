/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sat.maranatha.edu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 *
 * @author Anthony (1572010)
 */
public class MainApp extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("view/MainForm.fxml"));
        BorderPane root = loader.load();
        Scene scene=new Scene(root);
        primaryStage.setTitle("Ular tangga");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}
