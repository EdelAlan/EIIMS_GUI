import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminMenu extends JFrame {
    Administrator administrator = new Administrator();

    private JButton registerNewUsersButton;
    private JPanel mainPanel;
    private JButton registerAClerkButton;
    private JButton registerAnEngineerButton;
    private JButton registerAManagerButton;
    private JButton registerAClientButton;
    private JButton mainMenuButton;

    private JPanel registerPanel;
    private JButton editUsersButton;
    private JButton deleteUsersButton;
    private JButton assignAClientButton;
    private JButton searchButton;
    private JButton logoutButton;

    static JFrame frame;

    public adminMenu() {
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                administrator.logout();
            }
        });
        registerNewUsersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminMenuRegister.registerMenu();
            }
        });
        editUsersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminEditMenu.adminEditMenu();
            }
        });
        deleteUsersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminDeleteMenu.deleteMenu();
            }
        });
        assignAClientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminAssign.assignSearchClient();
            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                searchGUI.search();
            }
        });
    }

    public static void mainMenu() {
        frame = new JFrame("adminMenu");
        frame.setContentPane(new adminMenu().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
