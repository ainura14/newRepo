package org.example.Controller;

import org.example.Entity.Employee;

import javax.swing.*;
import java.awt.event.ActionEvent;

import static org.example.Entity.ArrayStatic.employees;

public class SearchEmployeesController {
    private final JTextField textField;
    private final JTextArea textArea;

    public SearchEmployeesController (JTextField textField, JTextArea textArea){
        this.textField = textField;
        this.textArea = textArea;
    }

    public static void SearchEmployeesInCont(String number){
            textArea.setText("Enter last name to search: ");
            String lastName = textField.getText();
            boolean found = false;
            for (Employee employee : employees) {
                if (employee.fullName.split(" ")[0].equalsIgnoreCase(lastName)) {
                    textArea.setText("\nEmployee found:");
                    textArea.setText(employee);
                    found = true;
                    break;
                }
                if (!found) {
                    textArea.setText("Employee not found.");
                }
            }
    }
}
