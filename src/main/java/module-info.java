module firas.example {
    requires javafx.controls;
    requires javafx.fxml;

    opens firas.example to javafx.fxml;
    exports firas.example;
}
