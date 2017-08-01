import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alan on 15.03.16.
 */
public class Login extends JFrame {
    private String login;
    private String password;
    public static Administrator administrator = new Administrator();

    public Login(String user, String pass) {
        this.login = user;
        this.password = pass;

    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public static void checkLogin(String username, String password) {


        if (username.equals(Administrator.getLogin()) && password.equals(Administrator.getPassword())) {
                adminMenu.mainMenu();
        } else {
            for (int i=0;i<Data.getClerks().size();i++) {
                if (username.equals(Data.getClerks().get(i).getName()) && password.equals(Data.getClerks().get(i).getId())) {
                    Data.getClerks().get(i).menu();
                }
            }

            for (int i=0;i<Data.getEngineers().size();i++) {
                if (username.equals(Data.getEngineers().get(i).getName()) && password.equals(Data.getEngineers().get(i).getId())) {
                    Data.getEngineers().get(i).menu();
                }
            }

            for (int i=0;i<Data.getManagers().size();i++) {
                if (username.equals(Data.getManagers().get(i).getName()) && password.equals(Data.getManagers().get(i).getId())) {
                    Data.getManagers().get(i).menu();
                }
            }
        }

    }
}
