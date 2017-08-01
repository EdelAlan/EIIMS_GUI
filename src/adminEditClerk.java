import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminEditClerk {
    private JTextField clerksNameField;
    private JPanel panel1;
    private JButton searchButton;
    private JLabel enterClerkSNameLabel;
    private JButton exitToMainMenuButton;

    static JFrame frame;

    public adminEditClerk() {
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String name = clerksNameField.getText();
                adminEditClerk1.editClerk1(name);
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

    public static void editClerk() {
        frame = new JFrame("adminEditClerk");
        frame.setContentPane(new adminEditClerk().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
