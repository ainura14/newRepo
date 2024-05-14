package org.example.Controller;

import org.example.Entity.Employee;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.example.Entity.ArrayStatic.employees;

public class ReadFromFileController {
    private final JTextField textField;
    private final JTextArea textArea;

    public ReadFromFileController (JTextField textField, JTextArea textArea){
        this.textField = textField;
        this.textArea = textArea;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        public void ReadFromFile(String filename){
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length == 4) {
                        String fullName = parts[0];
                        String position = parts[1];
                        int startYear = Integer.parseInt(parts[2]);
                        double salary = Double.parseDouble(parts[3]);
                        employees.add(new Employee(fullName, position, startYear, salary));
                    }
                }
                textArea.setText("Data loaded from file '" + filename + "' successfully.");
            } catch (IOException e) {
                textArea.setText("Error occurred while reading from file. Starting with an empty list.");
            }
        }
    }
}
