import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class searchGUI {
    private JPanel panel1;
    private JButton searchButton;
    private JTextField idField;

    static JFrame frame;

    public searchGUI() {
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String id = idField.getText();
                int i;
                String s;
                if (Login.administrator.searchClerk(id) != -1) {
                    i = Login.administrator.searchClerk(id);
                    s= Data.getClerks().get(i).toString();
                    JOptionPane.showMessageDialog(null, s);
                    adminMenu.mainMenu();
                } else if (Login.administrator.searchManager(id) != -1) {
                    i = Login.administrator.searchManager(id);
                    s=Data.getManagers().get(i).toString();
                    JOptionPane.showMessageDialog(null, s);
                    adminMenu.mainMenu();
                } else if (Login.administrator.searchClient(id) != -1) {
                    i = Login.administrator.searchClient(id);
                    s=Data.getClients().get(i).toString();
                    JOptionPane.showMessageDialog(null, s);
                    adminMenu.mainMenu();
                } else if (Login.administrator.searchEngineer(id) != -1) {
                    i = Login.administrator.searchEngineer(id);
                    s=Data.getEngineers().get(i).toString();
                    JOptionPane.showMessageDialog(null, s);
                    adminMenu.mainMenu();
                } else {
                    JOptionPane.showMessageDialog(null, "No user with such ID");
                    adminMenu.mainMenu();
                }
            }
        });
    }

    public searchGUI(int i) {
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String id = idField.getText();
                int i;
                String s;
                if (Login.administrator.searchClerk(id) != -1) {
                    i = Login.administrator.searchClerk(id);
                    s= Data.getClerks().get(i).toString();
                    JOptionPane.showMessageDialog(null, s);
                    managerMenu.managerMenu();
                } else if (Login.administrator.searchManager(id) != -1) {
                    i = Login.administrator.searchManager(id);
                    s=Data.getManagers().get(i).toString();
                    JOptionPane.showMessageDialog(null, s);
                    managerMenu.managerMenu();
                } else if (Login.administrator.searchClient(id) != -1) {
                    i = Login.administrator.searchClient(id);
                    s=Data.getClients().get(i).toString();
                    JOptionPane.showMessageDialog(null, s);
                    adminMenu.mainMenu();
                } else if (Login.administrator.searchEngineer(id) != -1) {
                    i = Login.administrator.searchEngineer(id);
                    s=Data.getEngineers().get(i).toString();
                    JOptionPane.showMessageDialog(null, s);
                    managerMenu.managerMenu();
                } else {
                    JOptionPane.showMessageDialog(null, "No user with such ID");
                    managerMenu.managerMenu();
                }
            }
        });
    }

    public static void search() {
        frame = new JFrame("searchGUI");
        frame.setContentPane(new searchGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void searchAsManager() {
        frame = new JFrame("searchGUI");
        frame.setContentPane(new searchGUI(1).panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
