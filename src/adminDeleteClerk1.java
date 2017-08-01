import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminDeleteClerk1 {
    private JPanel panel1;
    private JButton exitToMainMenuButton;
    private JButton deleteTheClerkButton;
    private static JLabel clerkInfoLabel;


    static JFrame frame;
    static String name;

    public adminDeleteClerk1() {
        deleteTheClerkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String id = Login.administrator.deleteClerk(name);
                JOptionPane.showMessageDialog(null, "Clerk: " + id + "; " + name + " was deleted");
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

    public static void deleteClerk1(String name) {
        frame = new JFrame("adminDeleteClerk1");
        frame.setContentPane(new adminDeleteClerk1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        adminDeleteClerk1.name = name;
        clerkInfoLabel.setText("Clerk: " + name);
    }
}
