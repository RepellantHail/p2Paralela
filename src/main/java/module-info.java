module com.example.p2paralela {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.p2paralela to javafx.fxml;
    exports com.example.p2paralela;
}