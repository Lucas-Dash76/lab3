/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package school;

import javafx.application.Application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
/**
 *
 * @author 2389873
 */
public class School extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      launch(args);
    }
     @Override
    public void start(Stage stage) {
    Label messageLabel = new Label("Name: ");
    Button bttn = new Button ("Click me");
    HBox vb = new HBox(messageLabel, bttn);
    Scene s = new Scene(vb, 1000, 500);
    stage.setTitle("first Application");
    stage.setScene(s);
    stage.show();

}
}
