import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;

/**
 * Created by alan on 12.03.16.
 */
public class Manager extends Administrator implements Serializable {

    private String name;
    private String id;
    private String phoneNumber;
    private String email;

    public Manager(String id, String name, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void menu() {
        managerMenu.managerMenu();
    }

    @Override
    public String toString() {
        return id + "; " + name + "; " +phoneNumber + "; " + email;
    }
}
