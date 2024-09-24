package firas.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import firas.example.model.User;
import java.math.BigDecimal;

import com.google.gson.GsonBuilder;
/**
 * JavaFX App
 */
public class App extends Application {

    GsonBuilder builder = new GsonBuilder();

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {

        // Create a new user with a starting balance of $10,000
        User user = new User(BigDecimal.valueOf(10000));

        // Retrieve and print the user's balance
        System.out.println("Current Balance: $" + user.getBalance());

        // Update the user's balance after a transaction
        user.setBalance(user.getBalance().subtract(BigDecimal.valueOf(500)));
        System.out.println("Updated Balance: $" + user.getBalance());

        // Update the total account value after purchasing stocks
        user.setTotalAccountValue(user.getBalance().add(BigDecimal.valueOf(700)));
        System.out.println("Total Account Value: $" + user.getTotalAccountValue());

        launch();
    }
}