import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminEditMenu {
    private JButton editAClerkButton;
    private JPanel panel1;
    private JButton editAnEngineerButton;
    private JButton editAManagerButton;
    private JButton editAClientButton;
    private JButton mainMenuButton;

    static JFrame frame;

    public adminEditMenu() {
        editAClerkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminEditClerk.editClerk();
            }
        });
        editAnEngineerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminEditEnginner1.editEngineer1();
            }
        });
        editAManagerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               frame.dispose();
                adminEditManager1.editManager1();
            }
        });
        editAClientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminEditClient.editClient();
            }
        });
        mainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminMenu.mainMenu();
            }
        });
    }

    public static void adminEditMenu() {
        frame = new JFrame("adminEditMenu");
        frame.setContentPane(new adminEditMenu().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
