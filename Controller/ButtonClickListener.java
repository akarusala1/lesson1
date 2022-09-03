package Anil.Controller;

import Anil.view.CalculatorSimulator;
import Anil.view.MenuScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickListener implements ActionListener {

    private CalculatorSimulator panel;
    public ButtonClickListener(CalculatorSimulator panel){
        this.panel = panel;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        var button = e.getSource();
        String m = panel.getDisplay().getText() + "\n";
        if(button == panel.getExitButton()){
            JFrame window = panel.getWindow();
            window.getContentPane().removeAll();
            var menu = new MenuScreen(window);
            menu.init();
            window.pack();
            window.revalidate();
        }else if(button == panel.getEnterButton()){
            try{
                double value = Double.parseDouble(panel.getNumberField().getText());
                panel.getCalculator().setNumbers(value);
                panel.getDisplay().setText(m + value + "Entered");
                panel.getNumberField().setText("");
            }catch (NumberFormatException exeption){
                panel.getDisplay().setText(m + panel.getNumberField().getText() + ": Invalid Number");
                panel.getNumberField().setText("");
            }
        }else if(button == panel.getResultButton()){
            panel.getDisplay().setText(m + "Result = " + panel.getCalculator().getResult());
        }else if(button == panel.getAddButton()){
            panel.getCalculator().add();
            panel.getDisplay().setText(m + "Add Operation Performed ");
        } else if(button == panel.getSubButton()){
            panel.getCalculator().subtract();
            panel.getDisplay().setText(m + "Subtract Operation Performed ");
        }else if(button == panel.getMulButton()){
            panel.getCalculator().multiply();
            panel.getDisplay().setText(m + "Multiplication Operation Performed ");
        }else if(button == panel.getDivButton()){
            panel.getCalculator().divide();
            panel.getDisplay().setText(m + "Divide Operation Performed ");
        }
    }
}
