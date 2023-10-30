module com.example.java_program {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_program to javafx.fxml;
    exports com.example.java_program;
}