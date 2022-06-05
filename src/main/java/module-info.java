module com.example.mod_2_homework__4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mod_2_homework__4 to javafx.fxml;
    exports com.example.mod_2_homework__4;
}