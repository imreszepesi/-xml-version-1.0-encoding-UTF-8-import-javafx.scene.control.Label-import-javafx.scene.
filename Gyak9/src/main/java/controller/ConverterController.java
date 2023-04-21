package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.NumberConverter;


public class ConverterController {
    @FXML
    private TextField decimal;

     @FXML
    private TextField binary;
     @FXML
    private TextField hexadecimal;

    @FXML
    private TextField octal;
    @FXML
    private void initialize(){
        decimal.textProperty().bindBidirectional(binary.textProperty(), new NumberConverter(10,2));
        decimal.textProperty().bindBidirectional(hexadecimal.textProperty(),new NumberConverter(10,16));
        decimal.textProperty().bindBidirectional(octal.textProperty(), new NumberConverter(10,8));
    }

}
