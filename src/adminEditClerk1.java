import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminEditClerk1 {
    private JTextField phoneField;
    private JPanel panel1;
    private JTextField emailField;
    private JButton saveChangesButton;
    private JButton exitWithoutSavingButton;

    static JFrame frame;
    static String name;

    public adminEditClerk1() {
        saveChangesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String phone = phoneField.getText();
                String email = emailField.getText();

                String id = Login.administrator.editClerk(name, phone, email);
                JOptionPane.showMessageDialog(null, "Clerk's id: " + id + ". New phone number: " + phone + ". New email: " + email);
                adminMenu.mainMenu();
            }
        });
        exitWithoutSavingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminMenu.mainMenu();
            }
        });
    }

    public static void editClerk1(String name) {
        frame = new JFrame("adminEditClerk1");
        frame.setContentPane(new adminEditClerk1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        adminEditClerk1.name = name;
    }
}
