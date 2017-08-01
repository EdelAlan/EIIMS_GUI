import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminDeleteMenu {
    private JButton deleteAClerkButton;
    private JPanel panel1;
    private JButton deleteAnEngineerButton;
    private JButton deleteAManagerButton;
    private JButton deleteAClientButton;
    private JButton exitToMainMenuButton;

    static JFrame frame;

    public adminDeleteMenu() {
        deleteAClerkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminDeleteClerk.deleteClerk();
            }
        });
        deleteAnEngineerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminDeleteEngineer.deleteEngineer();
            }
        });
        deleteAManagerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminDeleteManager.deleteManager();
            }
        });
        deleteAClientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminDeleteClient.deleteCLient();
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

    public static void deleteMenu() {
        frame = new JFrame("adminDeleteMenu");
        frame.setContentPane(new adminDeleteMenu().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
