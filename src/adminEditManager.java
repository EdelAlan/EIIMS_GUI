import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminEditManager {
    private JTextField phoneField;
    private JPanel panel1;
    private JTextField emailField;
    private JButton saveChangesButton;
    private JButton exitWithoutChangesButton;

    static JFrame frame;
    static String name;

    public adminEditManager() {
        saveChangesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String phone = phoneField.getText();
                String email = emailField.getText();

                frame.dispose();

                String id = Login.administrator.editManager(name, phone, email);
                JOptionPane.showMessageDialog(null, "Manager's id: " + id + ". New phone number: " + phone + ". New email: " + email);
                adminMenu.mainMenu();
            }
        });
        exitWithoutChangesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminMenu.mainMenu();
            }
        });
    }

    public static void editManager(String name) {
        frame = new JFrame("adminEditManager");
        frame.setContentPane(new adminEditManager().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        adminEditManager.name = name;
    }
}
