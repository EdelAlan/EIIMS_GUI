import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminDeleteClient1 {
    private JButton deleteButton;
    private JPanel panel1;
    private JButton exitToMainMenuButton;
    private static JLabel infoLabel;

    static JFrame frame;
    static String name;


    public adminDeleteClient1() {
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String id = Login.administrator.deleteClient(name);
                JOptionPane.showMessageDialog(null, "Client: " + id + "; " + name + " was deleted");
                adminMenu.mainMenu();
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

    public adminDeleteClient1(int i) {
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String id = Login.administrator.deleteClient(name);
                JOptionPane.showMessageDialog(null, "Client: " + id + "; " + name + " was deleted");
                clerkMenu.clerkMenu();
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

    public static void deleteClient1(String name) {
        frame = new JFrame("adminDeleteClient1");
        frame.setContentPane(new adminDeleteClient1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        adminDeleteClient1.name = name;
        infoLabel.setText("Client: " + name);
    }

    public static void deleteClientAsClerk1(String name) {
        frame = new JFrame("adminDeleteClient1");
        frame.setContentPane(new adminDeleteClient1(1).panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        adminDeleteClient1.name = name;
        infoLabel.setText("Client: " + name);
    }
}
