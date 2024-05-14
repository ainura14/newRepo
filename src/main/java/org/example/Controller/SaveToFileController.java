package org.example.Controller;

import jdk.vm.ci.meta.Constant;
import org.example.Constants.Constants;
import org.example.Entity.ArrayStatic;
import org.example.Entity.Employee;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.PrintWriter;

import static org.example.Entity.ArrayStatic.employees;

public class SaveToFileController{
    private static JTextField textField;
    private final JTextArea textArea;

    public SaveToFileController(JTextField textField, JTextArea textArea){
        this.textField = textField;
        this.textArea = textArea;
    }

    public static void SaveToFilesInCont(String number){
            String newFileName = textField.getText();
            if (newFileName.isEmpty()) {
                newFileName = Constants.fileName;
            }
            try (PrintWriter writer = new PrintWriter(newFileName)) {
                for (Employee employee : employees) {
                    writer.println(employee.getfullName()+ "," + employee.getPosition() + "," + employee.getStartYear() + "," + employee.getSalary());
                }
                textField.setText("Data saved to file '" + newFileName + "' successfully.");
            } catch (IOException e) {
                textField.setText("Error occurred while saving to file.");
                e.printStackTrace();
            }
    }
}
