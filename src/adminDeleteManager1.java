import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminDeleteManager1 {
    private JButton deleteTheManagerButton;
    private JPanel panel1;
    private JButton exitToMainMenuButton;
    private static JLabel infoLabel;

    static JFrame frame;
    static String name;

    public adminDeleteManager1() {
        deleteTheManagerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String id = Login.administrator.deleteManager(name);
                JOptionPane.showMessageDialog(null, "Manager: " + id + "; " + name + " was deleted");
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


    public static void deleteManager1(String name) {
        frame = new JFrame("adminDeleteManager1");
        frame.setContentPane(new adminDeleteManager1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        adminDeleteManager1.name = name;
        infoLabel.setText("Engineer: " + name);
    }
}
