import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminRegisterClient {
    private JTextField nameField;
    private JPanel panel1;
    private JTextField phoneField;
    private JTextField emailField;
    private JTextField addressField;
    private JTextField dateField;
    private JTextField numOfRooms;
    private JTextField typeOfApp;
    private JButton registerButton;
    private JLabel clerkSNameLabel;
    private JLabel clerkSPhoneNumberLabel;
    private JLabel clerkSEmailLabel;
    private JLabel clerkSAddressLabel;
    private JLabel dateLabel;
    private JLabel numberOfRoomsLabel;
    private JLabel typeOfAppilianceLabel;
    static JFrame frame;

    public adminRegisterClient() {
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String phone = phoneField.getText();
                String email = emailField.getText();
                String address = addressField.getText();
                String date = dateField.getText();
                String numOfRoom = numOfRooms.getText();
                String type = typeOfApp.getText();

                String id = Login.administrator.registerClient(name, phone, email, address, date, numOfRoom, type);

                frame.dispose();
                JOptionPane.showMessageDialog(null, "Client's name: " + name + ". Client's id number: " + id);
                adminMenu.mainMenu();
            }
        });
    }

    public adminRegisterClient(int i) {
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String phone = phoneField.getText();
                String email = emailField.getText();
                String address = addressField.getText();
                String date = dateField.getText();
                String numOfRoom = numOfRooms.getText();
                String type = typeOfApp.getText();

                String id = Login.administrator.registerClient(name, phone, email, address, date, numOfRoom, type);

                frame.dispose();
                JOptionPane.showMessageDialog(null, "Client's name: " + name + ". Client's id number: " + id);
                clerkMenu.clerkMenu();
            }
        });
    }

    public static void registerClient() {
        frame = new JFrame("adminRegisterClient");
        frame.setContentPane(new adminRegisterClient().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void registerClientAsClerk() {
        frame = new JFrame("adminRegisterClient");
        frame.setContentPane(new adminRegisterClient(1).panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
