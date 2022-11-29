module com.firefighterstarter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.firefighterstarter to javafx.fxml;
    exports com.firefighterstarter;
    exports com.firefighterstarter.controller;
    opens com.firefighterstarter.controller to javafx.fxml;
}