module firas.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    opens firas.exmple to javafx.fxml;
    exports firas.example;
}
