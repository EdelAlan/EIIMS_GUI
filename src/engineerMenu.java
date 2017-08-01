import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by alan on 31.03.16.
 */
public class engineerMenu {
    private JButton viewAssignedClientsButton;
    private JPanel panel1;
    private JButton generateReportButton;
    private JButton logoutButton;

    static JFrame frame;

    public engineerMenu(final Engeneer engeneer) {
        viewAssignedClientsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = engeneer.viewInspections();
                JOptionPane.showMessageDialog(null, s);
            }
        });
        generateReportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                searchClient.searchClientAsEngineer(engeneer);
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

    public static void engineerMenu(Engeneer engeneers) {
        frame = new JFrame("engineerMenu");
        frame.setContentPane(new engineerMenu(engeneers).panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
