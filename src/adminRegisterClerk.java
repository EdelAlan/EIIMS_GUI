import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminRegisterClerk extends JFrame {
    private JPanel panel1;
    private JTextField nameField;
    private JTextField phoneNumberField;
    private JTextField emailField;
    private JLabel clerkSNameLabel;
    private JLabel clekrSPhoneNumberLabel;
    private JLabel clerkSEmailLabel;
    private JButton registerButton;

    static JFrame frame;

    public adminRegisterClerk() {
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String name = nameField.getText();
                String phone = phoneNumberField.getText();
                String email = emailField.getText();

                String id = Login.administrator.registerClerk(name, phone, email);

                JOptionPane.showMessageDialog(null, "Clerk's name: " + name + ". Clerk's id number: " + id);
                adminMenu.mainMenu();
            }
        });
    }

   public static void registerClerk() {
        frame = new JFrame("adminRegisterClerk");
        frame.setContentPane(new adminRegisterClerk().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
