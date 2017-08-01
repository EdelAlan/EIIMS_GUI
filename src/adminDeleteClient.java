import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminDeleteClient {
    private JButton searchButton;
    private JPanel panel1;
    private JButton exitToMainMenuButton;
    private JTextField nameField;

    static JFrame frame;

    public adminDeleteClient() {
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String name = nameField.getText();
                adminDeleteClient1.deleteClient1(name);
            }
        });
        exitToMainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminMenu.mainMenu();
            }
        });
    }

    public adminDeleteClient(int i) {
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String name = nameField.getText();
                adminDeleteClient1.deleteClientAsClerk1(name);
            }
        });
        exitToMainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                clerkMenu.clerkMenu();
            }
        });
    }

    public static void deleteCLient() {
        frame = new JFrame("adminDeleteClient");
        frame.setContentPane(new adminDeleteClient().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void deleteCLientAsClerk() {
        frame = new JFrame("adminDeleteClient");
        frame.setContentPane(new adminDeleteClient(1).panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
