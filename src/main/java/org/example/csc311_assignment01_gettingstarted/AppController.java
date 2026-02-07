package org.example.csc311_assignment01_gettingstarted;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AppController {
    @FXML
    private Label welcomeText;

    // ToDo 01: add two text fields to the GUI so that the user can find the sum
    private Label num1;
    private Label num2;

    // ToDo 02: when the button is clicked show the output on the screen
    // ToDo 03: you should accept only the numeric values
    @FXML
    protected void onCalculateButtonClick() {
        String x = num1.getText();
        String y = num2.getText();

        try{
            double n1 = Double.parseDouble(x);
            double n2 = Double.parseDouble(y);
            welcomeText.setText("Sum is: "+(n1+n2));
        }
        catch (Exception e){
            welcomeText.setText("Invalid Input");
        }
    }
    // ToDo 04: modify the CSS file to make the background of the application Lightblue and the button color red

    // ToDo 05: commit changes and push back to the same repo


}