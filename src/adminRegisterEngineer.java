import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminRegisterEngineer extends JFrame {
    private JTextField nameField;
    private JPanel panel1;
    private JTextField phoneField;
    private JTextField emailField;
    private JButton registerButton;
    private JLabel engineerSNameLabel;
    private JLabel engineerSPhoneNumberLabel;
    private JLabel engineerSEmailLabel;

    static JFrame frame;

    public adminRegisterEngineer() {
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String phone = phoneField.getText();
                String email = emailField.getText();

                String id = Login.administrator.registerEngineer(name, phone, email);
                frame.dispose();
                JOptionPane.showMessageDialog(null, "Engineer's name: " + name + ". Engineer's id number: " + id);
                adminMenu.mainMenu();
            }
        });
    }

    public static void registerEngineer() {
        frame = new JFrame("adminRegisterEngineer");
        frame.setContentPane(new adminRegisterEngineer().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
