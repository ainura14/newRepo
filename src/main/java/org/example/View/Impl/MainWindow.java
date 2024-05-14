package org.example.View.Impl;

import org.example.Controller.ChoiceController;
import org.example.Controller.MenuController;
import org.example.View.View;

import javax.swing.*;

public class MainWindow implements View {
    public JFrame getMainWindow(){
        return mainWindow;
    }
    public void setMainWindow(JFrame mainWindow){
        this.mainWindow = mainWindow;
    }
    private JFrame mainWindow;

    public MainWindow(){
        mainWindow = new JFrame("New window");
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setBounds(100, 100, 600, 400);
        mainWindow.setLayout(null);

        JTextField textField1 = new JTextField();
        textField1.setBounds(50, 50, 150, 30);
        mainWindow.add(textField1);

        JTextArea textArea1 = new JTextArea();
        textArea1.setBounds(50, 100, 180, 190);
        mainWindow.add(textArea1);

        JButton start = new JButton("Start");
        start.setBounds(280, 100, 120, 60);
        mainWindow.add(start);
        start.addActionListener(new MenuController(textField1, textArea1));

        JButton go = new JButton("Go");
        go.setBounds(280, 100, 120, 60);
        mainWindow.add(go);
        go.addActionListener(new ChoiceController(textField1, textArea1));
    }
    @Override
    public void show(){
        mainWindow.setVisible(true);
    }
}
