import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminRegisterManager extends JFrame {

    private JTextField nameField;
    private JPanel panel1;
    private JTextField phoneField;
    private JTextField emailField;
    private JButton registerButton;
    private JLabel managerSNameLabel;
    private JLabel managerSPhoneNumberLabel;
    private JLabel managerSEmailLabel;

    static JFrame frame;

    public adminRegisterManager() {
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String phone = phoneField.getText();
                String email = emailField.getText();

                String id = Login.administrator.registerManager(name,phone, email);

                frame.dispose();
                JOptionPane.showMessageDialog(null, "Manager's name: " + name + ". Manager's id number: " + id);
                adminMenu.mainMenu();
            }
        });
    }

    public static void registerManager() {
        frame = new JFrame("adminRegisterManager");
        frame.setContentPane(new adminRegisterManager().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
