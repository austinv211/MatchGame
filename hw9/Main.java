/*
NAME: Main.java
DESCRIPTION: Main Class for game and contains start method
AUTHOR: Austin Vargason
DATE MODIFIED: 4/24/18
 */

//homework 9 package
package hw9;

//imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

//class for the memory game
public class Main extends Application {

    //override the start method
    @Override
    public void start(Stage primaryStage) throws Exception {
        MainMenu mainMenu = new MainMenu(primaryStage);
        Scene startMenuScene = mainMenu.getScene();
        primaryStage.setScene(startMenuScene);
        primaryStage.setTitle("Main");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    //main method for testing in IDE
    public static void main(String[] args) {
        Application.launch(args);
    }
}
