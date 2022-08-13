package pizzacalculator;

import java.awt.*;
import javax.swing.*;
import java.lang.Math.*;

public class PizzaCalculator extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Pizza Servings Calculator");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setForeground(Color.RED);
        label.setFont(new Font("Serif", Font.BOLD, 25));
        JLabel label2 = new JLabel("Enter the size of the pizza in inches:");
        JTextField text = new JTextField("", 4);
        JButton button = new JButton("Calculate Servings");
        JLabel label3 = new JLabel("");
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        
        button.addActionListener(e -> buttonAction(text, label3));

        frame.setLayout(new GridLayout(4, 1));
        frame.add(label);
        frame.add(panel, BorderLayout.CENTER);
        panel.add(label2);
        panel.add(text);
        frame.add(button);
        frame.add(label3);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Pizza Servings Calculator");
        frame.pack();
        frame.setSize(350, 300);
        frame.setVisible(true);
    }
    
    static void buttonAction(JTextField text, JLabel label3){
        Double inches = Double.parseDouble(text.getText());
        Double servings = Math.pow(inches / 8, 2);
        label3.setText("A " + String.format("%.0f", inches) + " inch pizza will serve " + String.format("%.2f", servings) + " people.");
    }
}
