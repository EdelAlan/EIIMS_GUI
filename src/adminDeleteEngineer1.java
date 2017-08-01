import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminDeleteEngineer1 {
    private JButton deleteTheEngineerButton;
    private JPanel panel1;
    private JButton exitToMainMenuButton;
    private static JLabel enginnerInfoLabel;

    static JFrame frame;
    static String name;

    public adminDeleteEngineer1() {
        deleteTheEngineerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String id = Login.administrator.deleteEngineer(name);
                JOptionPane.showMessageDialog(null, "Engineer: " + id + "; " + name + " was deleted");
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

    public static void deleteEngineer1(String name) {
        frame = new JFrame("adminDeleteEngineer1");
        frame.setContentPane(new adminDeleteEngineer1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        adminDeleteEngineer1.name = name;
        enginnerInfoLabel.setText("Engineer: " + name);
    }


}
