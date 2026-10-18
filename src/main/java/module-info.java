module com.danielamar.estadisticas {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.danielamar.estadisticas to javafx.fxml;
    exports com.danielamar.estadisticas;
}
