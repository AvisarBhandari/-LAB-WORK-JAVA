
import javax.swing.*;

public class LoginForm {
    LoginForm() {

        // Frame
        JFrame f = new JFrame("Login Form");
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Lable
        JLabel l1 = new JLabel("Username");
        l1.setBounds(20, 20, 100, 20);
        // add lable in the frame
        f.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(120, 20, 100, 20);
        f.add(t1);
        // Lable
        JLabel l2 = new JLabel("Password");
        l2.setBounds(20, 50, 100, 20);
        // add lable in the frame
        f.add(l2);

        JPasswordField p1 = new JPasswordField();
        p1.setBounds(120, 50, 100, 20);
        f.add(p1);

        JButton b1 = new JButton("Login");
        b1.setBounds(80, 80, 100, 20);
        f.add(b1);
        JButton b2 = new JButton("Cancle");
        b2.setBounds(200, 80, 100, 20);
        f.add(b2);

    }

    public static void main(String[] args) {
        new LoginForm();
    }
}