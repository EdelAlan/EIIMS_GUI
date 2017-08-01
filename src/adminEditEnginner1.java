import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminEditEnginner1 {
    private JTextField nameField;
    private JPanel panel1;
    private JButton searchButton;
    private JButton exitToMainMenuButton;

    static JFrame frame;

    public adminEditEnginner1() {
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                adminEditEngineer.editEngineer(name);
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

    public static void editEngineer1() {
        frame = new JFrame("adminEditEnginner1");
        frame.setContentPane(new adminEditEnginner1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
