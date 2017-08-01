import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class clerkMenu {
    private JPanel panel1;
    private JButton registerNewClientButton;
    private JButton editClientButton;
    private JButton deleteClientButton;
    private JButton assignClientToEngineerButton;
    private JButton searchButton;
    private JButton logoutButton;

    static JFrame frame;

    public clerkMenu() {
        registerNewClientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminRegisterClient.registerClientAsClerk();
            }
        });
        editClientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminEditClient.editClientAsClerk();
            }
        });
        deleteClientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminDeleteClient.deleteCLientAsClerk();
            }
        });
        assignClientToEngineerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminAssign.assignSearchClientAsClerk();
            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                searchClient.searchClient();
            }
        });
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                LoginGUI.loginMenu();
            }
        });
    }

    public static void clerkMenu() {
        frame = new JFrame("clerkMenu");
        frame.setContentPane(new clerkMenu().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
