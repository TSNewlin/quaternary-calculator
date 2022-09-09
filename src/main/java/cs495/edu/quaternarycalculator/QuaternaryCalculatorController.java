package cs495.edu.quaternarycalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class QuaternaryCalculatorController {
    private String displayedQuaternary = "";

    @FXML
    private TextField numberDisplay;

    @FXML
    protected void onNumberButtonCLick(ActionEvent event) {
        Button buttonPressed = (Button) event.getSource();
        displayedQuaternary += buttonPressed.getText();
        numberDisplay.setText(displayedQuaternary);
    }
}