package Anil.view;

import javax.swing.*;
import java.awt.*;

public class MenuScreen {
    private JFrame window;
    public MenuScreen(JFrame window){
        this.window = window;
        window.setTitle("Menu Screen");
    }
    public void init(){
        Container cp = window.getContentPane();
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400,200));
        panel.setLayout(new GridLayout(2, 1));

        JButton calcButton = new JButton("Calculator Simulator");
        JButton piggybankButton = new JButton("PiggyBank Simualtor");

        panel.add(calcButton);
        panel.add(piggybankButton);
        cp.add(BorderLayout.CENTER, panel);

        calcButton.addActionListener((e)->{
            window.getContentPane().removeAll();
            var calc = new CalculatorSimulator(window);
            calc.init();
            window.pack();
            window.revalidate();
        });
        piggybankButton.addActionListener((e)->{
            window.getContentPane().removeAll();
            var piggyBank = new PiggyBankSimulator(window);
            piggyBank.init();
            window.pack();
            window.revalidate();
        });
    }
}
