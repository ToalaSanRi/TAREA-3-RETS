package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        MenuBar menuBar = new MenuBar();
        menuBar.setStyle("-fx-background-color: #007ACC; -fx-text-fill: white;");

        
        Menu fileMenu = new Menu("Archivo");
        Menu editMenu = new Menu("Editar");
        Menu helpMenu = new Menu("Ayuda");

        
        MenuItem newItem = new MenuItem("Nuevo");
        MenuItem openItem = new MenuItem("Abrir");
        MenuItem saveItem = new MenuItem("Guardar");
        MenuItem exitItem = new MenuItem("Salir");
        exitItem.setStyle("-fx-text-fill: #f00;");

        MenuItem cutItem = new MenuItem("Cortar");
        MenuItem copyItem = new MenuItem("Copiar");
        MenuItem pasteItem = new MenuItem("Pegar");

        MenuItem aboutItem = new MenuItem("Acerca de");

        
        fileMenu.getItems().addAll(newItem, openItem, saveItem, new SeparatorMenuItem(), exitItem);
        editMenu.getItems().addAll(cutItem, copyItem, pasteItem);
        helpMenu.getItems().addAll(aboutItem);

     
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

        
        BorderPane root = new BorderPane();
        root.setStyle("-fx-background-color: #ADD8E6;"); 

        root.setTop(menuBar);

      
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Interfaz Gráfica de Usuario con Menú");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
