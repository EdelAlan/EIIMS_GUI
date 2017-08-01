import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminEditClient1 {
    private JTextField phoneField;
    private JPanel panel1;
    private JTextField emailField;
    private JButton saveChangesButton;
    private JButton exitWithoutChangesButton;

    static JFrame frame;
    static String name;

    public adminEditClient1() {
        saveChangesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String phone = phoneField.getText();
                String email = emailField.getText();

                String id = Login.administrator.editClient(name, phone, email);
                JOptionPane.showMessageDialog(null, "Client's id: " + id + ". New phone number: " + phone + ". New email: " + email);
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

    public adminEditClient1(int i) {
        saveChangesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String phone = phoneField.getText();
                String email = emailField.getText();

                String id = Login.administrator.editClient(name, phone, email);
                JOptionPane.showMessageDialog(null, "Client's id: " + id + ". New phone number: " + phone + ". New email: " + email);
                clerkMenu.clerkMenu();
            }
        });
        exitWithoutChangesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                clerkMenu.clerkMenu();
            }
        });
    }

    public static void editClient1(String name) {
        JFrame frame = new JFrame("adminEditClient1");
        frame.setContentPane(new adminEditClient1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        adminEditClient1.name = name;
    }

    public static void editClientAsClerk1(String name) {
        JFrame frame = new JFrame("adminEditClient1");
        frame.setContentPane(new adminEditClient1(1).panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        adminEditClient1.name = name;
    }
}
