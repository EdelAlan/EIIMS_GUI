import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by alan on 12.03.16.
 */
public class Engeneer extends Administrator implements Serializable {

    private String name;
    private String id;
    private String phoneNumber;
    private String email;
    private ArrayList<Client> clients;

    public Engeneer(String id, String name, String phoneNumber, String email, ArrayList<Client> clients) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.clients = clients;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void menu() {
        engineerMenu.engineerMenu(this);
    }

    public String viewInspections() {
        String s = "Assigned clients: ";
        for (Client c : this.getClients()) {
            s += c.toString()+"\n";
        }
        return s;
    }

    @Override
    public String toString() {
        System.out.println("Assigned clients:");
        for (int i=0;i<clients.size();i++) {
            System.out.println(i+1 +". "+ clients.get(i).toString());
        }
        return "Engineer: " + id + "; " + name + "; " +phoneNumber + "; " + email + ";\n";
    }
}
