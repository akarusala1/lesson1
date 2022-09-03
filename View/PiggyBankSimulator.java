package Anil.view;

import javax.swing.*;
import java.awt.*;

public class PiggyBankSimulator {
    private JFrame window;
    private JTextArea display = new JTextArea();
    private JRadioButton[] radioButtons;

    public PiggyBankSimulator(JFrame window){
        this.window = window;
        window.setTitle("Piggy Bank Simulator");
    }
    public void init(){
        Container cp = window.getContentPane();

        var scrollPane = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(400,400));;
        cp.add(BorderLayout.CENTER,scrollPane);

        JPanel southPanel = new JPanel();
        cp.add(BorderLayout.SOUTH, southPanel);

        southPanel.setLayout(new GridLayout(2,1));

        radioButtons = new JRadioButton[3];
        radioButtons[0] = new JRadioButton("Nickel");
        radioButtons[0].setSelected(true);
        radioButtons[1] = new JRadioButton("Dime");
        radioButtons[2] = new JRadioButton("Quarter");
        JPanel radioPanel = new JPanel();
        ButtonGroup radioGroup = new ButtonGroup();
        for(var b : radioButtons){
            radioPanel.add(b);
            radioGroup.add(b);
        }
        southPanel.add(radioPanel);
    }
}
