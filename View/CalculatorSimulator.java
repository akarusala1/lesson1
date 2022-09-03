package Anil.view;

import Anil.Controller.ButtonClickListener;
import Anil.model.Calculator;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;

public class CalculatorSimulator {
    private Calculator calculator = new Calculator();
    private JFrame window;
    private JTextArea display = new JTextArea();
    private JButton addButton = new JButton("+");
    private JButton subButton = new JButton("-");
    private JButton mulButton = new JButton("*");
    private JButton divButton = new JButton("/");
    private JButton enterButton = new JButton("Enter");
    private JButton exitButton = new JButton("Exit");
    private JButton resultButton = new JButton("Result");
    private JTextField numField = new JTextField(10);

    public  CalculatorSimulator(JFrame window){
        this.window = window;
        window.setTitle("Calculator Simulator");
    }
    public void init(){
        Container cp = window.getContentPane();
        var scrollPane = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(400,400));;
        cp.add(BorderLayout.CENTER,scrollPane);

        JPanel southPanel = new JPanel();
        cp.add(BorderLayout.SOUTH, southPanel);

        southPanel.setLayout(new GridLayout(3,1));
        JPanel row1 = new JPanel();
        row1.add(numField);
        row1.add(enterButton);
        southPanel.add(row1);

        JPanel row2 = new JPanel();
        row2.add(addButton);
        row2.add(subButton);
        row2.add(mulButton);
        row2.add(divButton);
        southPanel.add(row2);

        JPanel row3 = new JPanel();
        row3.add(resultButton);
        row3.add(exitButton);
        southPanel.add(row3);

        ButtonClickListener buttonClickListener = new ButtonClickListener(this);
        addButton.addActionListener(buttonClickListener);
        subButton.addActionListener(buttonClickListener);
        mulButton.addActionListener(buttonClickListener);
        divButton.addActionListener(buttonClickListener);
        resultButton.addActionListener(buttonClickListener);
        exitButton.addActionListener(buttonClickListener);
        enterButton.addActionListener(buttonClickListener);
    }
    public JButton getAddButton(){
        return addButton;
    }
    public JButton getSubButton(){
        return subButton;
    }
    public JButton getMulButton(){
        return mulButton;
    }
    public JButton getDivButton(){
        return divButton;
    }
    public JButton getEnterButton(){
        return enterButton;
    }
    public JButton getExitButton(){
        return exitButton;
    }
    public JButton getResultButton(){
        return resultButton;
    }
    public JFrame getWindow(){
        return window;
    }
    public Calculator getCalculator(){
        return calculator;
    }
    public JTextField getNumberField(){
        return numField;
    }
    public JTextArea getDisplay(){
        return display;
    }
}
