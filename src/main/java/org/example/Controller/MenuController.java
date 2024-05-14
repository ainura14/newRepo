package org.example.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController implements ActionListener {
    private final JTextField textField;
    private final JTextArea textArea;

    public MenuController(JTextField textField, JTextArea textArea){
        this.textField = textField;
        this.textArea = textArea;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String valueStart = "Menu";
        String getStart = textField.getText();
        if (valueStart.equals(getStart)) {
                textArea.append("\nMenu:" + System.lineSeparator());
                textArea.append("1. Add or modify an employee" + System.lineSeparator());
                textArea.append("2. Sort employees" + System.lineSeparator());
                textArea.append("3. Search for an employee by last name" + System.lineSeparator());
                textArea.append("4. Save to file" + System.lineSeparator());
                textArea.append("5. Exit" + System.lineSeparator());
                textArea.append("Enter your choice: " + System.lineSeparator());
        }
        textField.setText("");
    }

}
