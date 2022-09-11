package cs495.edu.quaternarycalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import java.util.Objects;

public class QuaternaryCalculatorController {
    private String displayedQuaternary = "";
    private String prevQuaternary = "";
    private String operation = "";
    private boolean newOperation = true;
    private boolean viewingDecimal = false;

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
    private Button equals;
    @FXML
    private Button zero;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;

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
        NumberCalculator calculator = new NumberCalculator();
        switch (operation) {
            case "+" -> {
                displayedQuaternary = calculator.add(prevQuaternary, displayedQuaternary);
                numberDisplay.setText(displayedQuaternary);
            }
            case "-" -> {
                displayedQuaternary = calculator.subtract(prevQuaternary, displayedQuaternary);
                numberDisplay.setText(displayedQuaternary);
            }
            case "*" -> {
                displayedQuaternary = calculator.multiply(prevQuaternary, displayedQuaternary);
                numberDisplay.setText(displayedQuaternary);
            }
            case "/" -> {
                displayedQuaternary = calculator.divide(prevQuaternary, displayedQuaternary);
                numberDisplay.setText(displayedQuaternary);
            }
        }
        newOperation = true;
        toggleOperations();
    }

    @FXML
    protected void onConvertButtonClick() {
        if (Objects.equals(displayedQuaternary, "undefined")) return;
        if (!viewingDecimal && !displayedQuaternary.isEmpty()) {
            disableAllButtons();
            viewingDecimal = true;
            int decimal = Integer.parseInt(displayedQuaternary, 4);
            numberDisplay.setText(Integer.toString(decimal, 10));
        } else if (viewingDecimal && !displayedQuaternary.isEmpty()) {
            enableAllButtons();
            viewingDecimal = false;
            numberDisplay.setText(displayedQuaternary);
        }
    }

    @FXML
    protected void onSquaredButtonCLick() {
        NumberCalculator calculator = new NumberCalculator();
        newOperation = true;
        displayedQuaternary = calculator.squared(displayedQuaternary);
        numberDisplay.setText(displayedQuaternary);
    }

    private void toggleOperations() {
        addition.setDisable(!addition.isDisable());
        subtraction.setDisable(!subtraction.isDisable());
        multiplication.setDisable(!multiplication.isDisable());
        division.setDisable(!division.isDisable());
        squared.setDisable(!squared.isDisable());
        squareRoot.setDisable(!squareRoot.isDisable());
    }

    private void disableAllButtons() {
        addition.setDisable(true);
        subtraction.setDisable(true);
        multiplication.setDisable(true);
        division.setDisable(true);
        squared.setDisable(true);
        squareRoot.setDisable(true);
        equals.setDisable(true);
        zero.setDisable(true);
        one.setDisable(true);
        two.setDisable(true);
        three.setDisable(true);
    }

    private void enableAllButtons() {
        addition.setDisable(false);
        subtraction.setDisable(false);
        multiplication.setDisable(false);
        division.setDisable(false);
        squared.setDisable(false);
        squareRoot.setDisable(false);
        equals.setDisable(false);
        zero.setDisable(false);
        one.setDisable(false);
        two.setDisable(false);
        three.setDisable(false);
    }
}