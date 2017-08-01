import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminAssign {
    private JTextField nameField;
    private JPanel panel1;
    private JButton okButton;

    static JFrame frame;

    public adminAssign() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String name = nameField.getText();
                int clientNum = Login.administrator.searchClient(name);
                adminAssign1.assignSearchEnginner(clientNum);
            }
        });
    }

    public adminAssign(int i) {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String name = nameField.getText();
                int clientNum = Login.administrator.searchClient(name);
                adminAssign1.assignSearchEnginnerAsClerk(clientNum);
            }
        });
    }

    public static void assignSearchClient() {
        frame = new JFrame("adminAssign");
        frame.setContentPane(new adminAssign().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void assignSearchClientAsClerk() {
        frame = new JFrame("adminAssign");
        frame.setContentPane(new adminAssign(1).panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
