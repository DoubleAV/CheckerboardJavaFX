/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aavr56checkerboard;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author drew
 */
public class Aavr56Checkerboard extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLCheckerboard.fxml"));
        Parent root = loader.load();
        
        FXMLCheckerboardController controller = loader.getController();
        
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        
        // Initialize game board
        controller.ready(scene);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}