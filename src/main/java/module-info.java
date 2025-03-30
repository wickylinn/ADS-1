module com.example.ads {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ads to javafx.fxml;
    exports com.example.ads;
}