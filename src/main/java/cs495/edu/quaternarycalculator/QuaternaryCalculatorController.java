package cs495.edu.quaternarycalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class QuaternaryCalculatorController {
    private String displayedQuaternary = "";
    private String prevQuaternary = "";
    private String operation = "";
    private boolean newOperation = true;

    @FXML
    private TextField numberDisplay;
    @FXML
    private Button addition;
    @FXML
    private Button subtraction;
    @FXML
    private Button multiplication;
    @FXML
    private Button division;

    @FXML
    protected void onNumberButtonCLick(ActionEvent event) {
        Button buttonPressed = (Button) event.getSource();
        if (newOperation) {
            numberDisplay.setText("");
            displayedQuaternary = "";
            newOperation = false;
        }
        displayedQuaternary += buttonPressed.getText();
        numberDisplay.setText(displayedQuaternary);
    }

    @FXML
    protected void onOperationButtonClick(ActionEvent event) {
        Button operationButton = (Button) event.getSource();
        operation = operationButton.getText();
        prevQuaternary = displayedQuaternary;
        displayedQuaternary = "";
        numberDisplay.setText("");
        addition.setDisable(true);
        subtraction.setDisable(true);
        multiplication.setDisable(true);
        division.setDisable(true);
    }

    @FXML
    protected void onEqualButtonClick() {
        newOperation = true;
        numberDisplay.setText(prevQuaternary + " " + operation + " " + displayedQuaternary);
        prevQuaternary = "";
        displayedQuaternary = "";
        addition.setDisable(false);
        subtraction.setDisable(false);
        multiplication.setDisable(false);
        division.setDisable(false);
    }
}