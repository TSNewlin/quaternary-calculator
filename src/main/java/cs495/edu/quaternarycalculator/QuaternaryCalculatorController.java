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
    private Button squared;
    @FXML
    private Button squareRoot;

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
        toggleOperations();
    }

    @FXML
    protected void onEqualButtonClick() {
        newOperation = true;
        numberDisplay.setText(prevQuaternary + " " + operation + " " + displayedQuaternary);
        prevQuaternary = "";
        displayedQuaternary = "";
        toggleOperations();
    }


    private void toggleOperations() {
        addition.setDisable(!addition.isDisable());
        subtraction.setDisable(!subtraction.isDisable());
        multiplication.setDisable(!multiplication.isDisable());
        division.setDisable(!division.isDisable());
        squared.setDisable(!squared.isDisable());
        squareRoot.setDisable(!squareRoot.isDisable());
    }
}