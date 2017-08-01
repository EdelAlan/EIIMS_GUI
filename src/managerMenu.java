import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 31.03.16.
 */
public class managerMenu {
    private JButton searchButton;
    private JPanel panel1;
    private JButton logoutButton;

    static JFrame frame;

    public managerMenu() {
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                searchGUI.searchAsManager();
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

    public static void managerMenu() {
        frame = new JFrame("managerMenu");
        frame.setContentPane(new managerMenu().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
