package com.example.mod_2_homework__4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextArea historyArea;
    @FXML
    private TextField userAnswer;

    public void clickCheckButton(ActionEvent actionEvent) {
        String answer = userAnswer.getText();
        String text = String.format(answer);
        historyArea.appendText(text+"\n");
        userAnswer.clear();
        userAnswer.requestFocus();

    }
}