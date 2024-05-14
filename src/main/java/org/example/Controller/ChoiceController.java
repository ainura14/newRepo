package org.example.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceController implements ActionListener {
    private final JTextField textField;
    private final JTextArea textArea;

    public ChoiceController(JTextField textField, JTextArea textArea){
        this.textField = textField;
        this.textArea = textArea;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String number = textField.getText();
        int choice = Integer.parseInt(textField.getText());
        switch (choice) {
            case 1:
                AddOrModdifyEmployeeController.AddOrModdifyEmployeesNow();
                break;
            case 2:
                SortEmployeesController.SortEmployeesInCont(number);
                break;
            case 3:
                SearchEmployeesController.SearchEmployeesInCont(number);
                break;
            case 4:
                SaveToFileController.SaveToFilesInCont(number);
                break;
            case 5:
                textField.setText("Exiting...");
            default:
                textField.setText("Invalid choice. Please enter a number between 1 and 5.");
        }
    }
}
