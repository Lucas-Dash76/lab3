/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//https://github.com/Lucas-Dash76/lab3/tree/master
package school;




import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
 import java.util.Random;
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
    Random random = new Random();
    BorderPane root = new BorderPane();
    StackPane middle = new StackPane();
    Label topLabel = new Label("Random Game");
    Label bottomLabel = new Label("Waiting... ");
    Label lblImage = new Label();
    
    root.setBottom(bottomLabel);
    root.setTop(topLabel);
    
    int randomNumber = random.nextInt(20) + 1;
    
    String number = Integer.toString(randomNumber);
    Image rndImage;
    if (randomNumber < 10) {
        rndImage = new Image("file:Images/10" + number + ".jpg");
    }
    else {
       rndImage = new Image("file:Images/1" + number + ".jpg");
    }
    
    lblImage.setGraphic(new ImageView(rndImage));
    middle.getChildren().addAll(lblImage);
    root.setCenter(middle);
    Scene s = new Scene(root, 250, 300);
    stage.setTitle("Java Games");
    stage.setScene(s);
    stage.show();

}
}
