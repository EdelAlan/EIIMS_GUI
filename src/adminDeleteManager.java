import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminDeleteManager {
    private JTextField nameField;
    private JPanel panel1;
    private JButton searchButton;
    private JButton exitToMainMenuButton;

    static JFrame frame;

    public adminDeleteManager() {
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String name = nameField.getText();
                adminDeleteManager1.deleteManager1(name);
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

    public static void deleteManager() {
        frame = new JFrame("adminDeleteManager");
        frame.setContentPane(new adminDeleteManager().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
