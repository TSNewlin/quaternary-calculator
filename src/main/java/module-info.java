module cs495.edu.quaternarycalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens cs495.edu.quaternarycalculator to javafx.fxml;
    exports cs495.edu.quaternarycalculator;
}