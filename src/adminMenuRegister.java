import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminMenuRegister extends JFrame {
    private JButton registerAClerkButton;
    private JPanel panel1;
    private JButton registerAnEngineerButton;
    private JButton registerAManagerButton;
    private JButton registerAClientButton;
    private JButton mainMenuButton;
    private JPanel registerPanel;

    static JFrame frame;

    public adminMenuRegister() {
        registerAClerkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminRegisterClerk.registerClerk();
            }
        });
        registerAnEngineerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminRegisterEngineer.registerEngineer();
            }
        });
        registerAManagerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminRegisterManager.registerManager();
            }
        });
        registerAClientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                adminRegisterClient.registerClient();
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

    public static void registerMenu() {
        frame = new JFrame("adminMenuRegister");
        frame.setContentPane(new adminMenuRegister().registerPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
