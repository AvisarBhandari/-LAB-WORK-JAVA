import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FactorialAndCubeCalculator extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;

    public FactorialAndCubeCalculator() {
        setTitle("Factorial and Cube Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        inputField = new JTextField(10);
        resultLabel = new JLabel("Result:");

        JButton resultButton = new JButton("Calculate");

        resultButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int num = Integer.parseInt(inputField.getText());
                resultLabel.setText("Factorial: " + factorial(num));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                int num = Integer.parseInt(inputField.getText());
                resultLabel.setText("Cube: " + cube(num));
            }
        });

        add(new JLabel("Enter a number:"));
        add(inputField);
        add(resultButton);
        add(resultLabel);

        setVisible(true);
    }

    private int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    private int cube(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FactorialAndCubeCalculator());
    }
}
