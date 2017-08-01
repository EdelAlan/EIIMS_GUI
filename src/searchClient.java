import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class searchClient {
    private JTextField idField;
    private JPanel panel1;
    private JButton searchButton;
    private JButton exitToMainMenuButton;

    static JFrame frame;

    public searchClient() {
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String id = idField.getText();
                int i;
                String s;
                if (Login.administrator.searchClient(id) != -1) {
                    i = Login.administrator.searchClient(id);
                    s= Data.getClients().get(i).toString();
                    JOptionPane.showMessageDialog(null, s);
                    clerkMenu.clerkMenu();
                } else {
                    JOptionPane.showMessageDialog(null, "No client with such ID or name");
                    clerkMenu.clerkMenu();
                }
            }
        });
        exitToMainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                clerkMenu.clerkMenu();
            }
        });
    }

    public searchClient(final Engeneer engeneer) {
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String id = idField.getText();
                int i;
                String s;
                if (Login.administrator.searchClient(id) != -1) {
                    i = Login.administrator.searchClient(id);
                    s= Data.getClients().get(i).toString();
                    JOptionPane.showMessageDialog(null, "Generated report for client: " + s);
                    engineerMenu.engineerMenu(engeneer);
                } else {
                    JOptionPane.showMessageDialog(null, "No client with such ID or name");
                    engineerMenu.engineerMenu(engeneer);
                }
            }
        });
        exitToMainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                clerkMenu.clerkMenu();
            }
        });
    }

    public static void searchClient() {
        frame = new JFrame("searchClient");
        frame.setContentPane(new searchClient().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void searchClientAsEngineer(Engeneer engeneer) {
        frame = new JFrame("searchClient");
        frame.setContentPane(new searchClient(engeneer).panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
