import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNumber {
    AddNumber() {
        JFrame f = new JFrame("Sum of Two Number");
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("First Number");
        l1.setBounds(20, 20, 100, 20);
        f.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 20, 100, 20);
        f.add(t1);
        // Lable
        JLabel l2 = new JLabel("Secound Number");
        l2.setBounds(20, 50, 100, 20);
        f.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(150, 50, 100, 20);
        f.add(t2);

        JLabel l3 = new JLabel("Sum");
        l3.setBounds(20, 80, 100, 20);
        f.add(l3);

        JTextField t3 = new JTextField();
        t3.setBounds(150, 80, 100, 20);
        f.add(t3);

        JButton addbtn = new JButton("Add");
        addbtn.setBounds(80, 120, 100, 20);
        f.add(addbtn);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(200, 120, 100, 20);
        f.add(btnCancel);

        addbtn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                t3.setText(" " + c);
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                l1.setText(null);
                l2.setText(null);
                l3.setText(null);
            }
        });
    }

    public static void main(String[] args) {
        new AddNumber();
    }
}
