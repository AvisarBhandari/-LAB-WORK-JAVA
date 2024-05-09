import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenOrOdd {
    EvenOrOdd() {
        JFrame f = new JFrame("Even Or Odd");
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("Number");
        l1.setBounds(20, 20, 100, 20);
        f.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(100, 20, 100, 20);
        f.add(t1);

        JButton btnCheck = new JButton("Check");
        btnCheck.setBounds(100, 60, 80, 20);
        f.add(btnCheck);

        JLabel btnResult = new JLabel("");
        btnResult.setBounds(100, 85, 150, 20);
        f.add(btnResult);

        btnCheck.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                int a = Integer.parseInt(t1.getText());
                if (a % 2 == 0) {
                    btnResult.setText("Even");
                } else {
                    btnResult.setText("Odd");
                }
            }
        });

    }

    public static void main(String[] args) {

        new EvenOrOdd();
    }
}
