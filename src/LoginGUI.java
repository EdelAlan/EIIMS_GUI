import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class LoginGUI extends JFrame {
    private JButton loginButton;
    private JPanel panel1;
    private JPasswordField passwordField;
    private JTextField usernameField;
    private JLabel usernameLabel;
    private JLabel passwordLabel;

    static JFrame frame;

    public LoginGUI() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = passwordField.getText();

                frame.dispose();
                Login.checkLogin(username, password);
            }
        });
    }

    public static void loginMenu() {
        frame = new JFrame("LoginGUI");
        frame.setContentPane(new LoginGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
