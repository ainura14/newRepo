package org.example.Controller;

import org.example.Entity.ArrayStatic;
import org.example.Entity.Employee;
import org.example.Repository.AddOrModdifyEmployeeRepo;
import org.example.Repository.Impl.AddOrModdifyEmployeeImpl;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddOrModdifyEmployeeController{
    Employee newObject = new Employee();
    private JTextField textField;
    private JTextArea textArea;

    public AddOrModdifyEmployeeController(JTextField textField, JTextArea textArea){
        this.textField = textField;
        this.textArea = textArea;
    }
        public void AddOrModdifyEmployeesNow(){
            textField.setText("Enter full name: " + System.lineSeparator());
            newObject.setfullName(textField.getText());
            textField.setText("Enter position: " + System.lineSeparator());
            newObject.setPosition(textField.getText());
            textField.setText("Enter start year: " + System.lineSeparator());
            newObject.setStartYear(Integer.parseInt(textField.getText()));
            textField.setText("Enter salary: " + System.lineSeparator());
            newObject.setSalary(Double.parseDouble(textField.getText()));

        }

}
