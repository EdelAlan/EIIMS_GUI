import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alan on 30.03.16.
 */
public class adminAssign1 {
    private JTextField engineerField;
    private JPanel panel1;
    private JButton okButton;

    static JFrame frame;
    static int clientNum;

    public adminAssign1() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String name = engineerField.getText();
                int engineerNum = Login.administrator.searchEngineer(name);
                String s = Login.administrator.assignClient(clientNum, engineerNum);
                adminMenu.mainMenu();
                JOptionPane.showMessageDialog(null, s);
            }
        });
    }

    public adminAssign1(int i) {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String name = engineerField.getText();
                int engineerNum = Login.administrator.searchEngineer(name);
                String s = Login.administrator.assignClient(clientNum, engineerNum);
                clerkMenu.clerkMenu();
                JOptionPane.showMessageDialog(null, s);
            }
        });
    }

    public static void assignSearchEnginner(int clientNum) {
        frame = new JFrame("adminAssign1");
        frame.setContentPane(new adminAssign1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        adminAssign1.clientNum = clientNum;
    }

    public static void assignSearchEnginnerAsClerk(int clientNum) {
        frame = new JFrame("adminAssign1");
        frame.setContentPane(new adminAssign1(1).panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        adminAssign1.clientNum = clientNum;
    }
}
