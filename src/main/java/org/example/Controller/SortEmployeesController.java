package org.example.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.example.Entity.ArrayStatic.employees;

public class SortEmployeesController {
    private static final JTextField textField = null;
    private static final JTextArea textArea = null;

    public SortEmployeesController(JTextField textField, JTextArea textArea)z {
        this.textField = textField;
        this.textArea = textArea;
    }

    public static void SortEmployeesInCont(String number) {
        int choice1 = Integer.parseInt(textField.getText());
        textArea.setText("\nSort by:" + System.lineSeparator() + "1. Last Name" + System.lineSeparator() + "2. Salary" + System.lineSeparator() + "3. Start Year" + System.lineSeparator() + "Enter your choice: ");
        switch (choice1) {
            case 1:
                List<?> employees;
                Collections.sort(employees, Comparator.comparing(emp -> emp.fullName.split(" ")[0]));
                break;
            case 2:
                Collections.sort(employees, Comparator.comparingDouble(emp -> emp.salary));
                break;
            case 3:
                Collections.sort(employees, Comparator.comparingInt(emp -> emp.startYear));
                break;
            default:
                textArea.setText("Invalid choice.");
                return;
        }
//            displayEmployees();
    }
}
