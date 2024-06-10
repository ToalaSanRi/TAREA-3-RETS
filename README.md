# TAREA-3-RETS
Implementación de un Sistema de Menús en una Aplicación JavaFX
**IMAGEN DE LA EJECUCIÓN DEL PROYECTO**
![image](https://github.com/ToalaSanRi/TAREA-3-RETS/assets/169106800/6af219db-b39a-492d-8312-b4fe35ea6dae)

   
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

![image](https://github.com/ToalaSanRi/TAREA-3-RETS/assets/169106800/ca30040f-0340-4bce-b2c9-ed1a861fe239)

![image](https://github.com/ToalaSanRi/TAREA-3-RETS/assets/169106800/e9e06679-9723-4d9a-88aa-7cb54a7d210d)



            -- COMPONENTES DEL CÓDIGO --


**Clase Main que extiende de Application:**
La clase Main extiende Application, que es la clase base para todas las aplicaciones JavaFX. Esto significa que Main es la clase principal de la aplicación.

**Método start():**
Este método es donde comienza la ejecución de la aplicación JavaFX. Aquí es donde se construye la interfaz de usuario y se muestra en la pantalla.

**Creación de la barra de menú:**
Se instancia un objeto MenuBar que servirá como la barra de menú principal de la aplicación.

**Creación de menús:**
Se crean tres menús principales: "Archivo", "Editar" y "Ayuda", utilizando la clase Menu.

**Creación de elementos de menú:**
Se crean elementos de menú para cada menú principal, como "Nuevo", "Abrir", etc., utilizando la clase MenuItem.

**Añadir elementos a los menús:**
Se añaden los elementos de menú a los menús correspondientes utilizando el método getItems().addAll().

**Añadir menús a la barra de menú:**
Se añaden los menús a la barra de menú utilizando el método getMenus().addAll().

**Creación del layout principal:**
Se crea un objeto BorderPane que servirá como el layout principal de la aplicación. En este caso, se utilizará para organizar la barra de menú en la parte superior de la ventana.

**Establecimiento de estilos:**
Se establecen estilos de fondo y de texto para la barra de menú y el layout principal utilizando el método setStyle().

**Creación de la escena y configuración de la ventana:**
Se crea un objeto Scene que contiene el layout principal, con un tamaño de 400x300 píxeles.
Se establece la escena en la ventana (Stage) utilizando el método setScene().
Se establece el título de la ventana utilizando el método setTitle().
Finalmente, se muestra la ventana utilizando el método show().

**Método main():**
Este es el punto de entrada de la aplicación Java. Se lanza la aplicación llamando al método launch() y pasando los argumentos recibidos por la línea de comandos.
