import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminEditEngineer {
    private JTextField phoneField;
    private JPanel panel1;
    private JTextField emailField;
    private JButton saveChangesButton;
    private JButton exitWithotChandesButton;
    private JLabel engineerSNewEmailLabel;
    private JLabel engineerSNewPhoneLabel;

    static JFrame frame;
    static String name;


    public adminEditEngineer() {
        saveChangesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String phone = phoneField.getText();
                String email = emailField.getText();

                String id = Login.administrator.editEngineer(name, phone, email);
                JOptionPane.showMessageDialog(null, "Engineer's id: " + id + ". New phone number: " + phone + ". New email: " + email);
                adminMenu.mainMenu();
            }
        });
        exitWithotChandesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminMenu.mainMenu();
            }
        });
    }

    public static void editEngineer(String name) {
        frame = new JFrame("adminEditEngineer");
        frame.setContentPane(new adminEditEngineer().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        adminEditEngineer.name = name;
    }
}
