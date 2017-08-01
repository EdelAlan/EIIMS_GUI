import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;

/**
 * Created by alan on 12.03.16.
 */

public class Clerk extends Administrator implements Serializable {

    private String name;
    private String id;
    private String phoneNumber;
    private String email;

    public Clerk(String id, String name, String phoneNumber, String email) {
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
        clerkMenu.clerkMenu();
    }

    @Override
    public void search() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1.Search for a client");
        System.out.println("0.Exit to main menu");

        try {
            int i = Integer.parseInt(reader.readLine());
            if (i == 1) {
                System.out.print("Enter clerk's name: ");
                String s = reader.readLine();
                int j = searchClient(s);
                System.out.println(Data.getClerks().get(j).toString());
            } else if (i == 0) {
                menu();
            } else {
                System.out.println("Wrong input!");
                search();
            }
        } catch (Exception e) {
            System.out.println("Wrong input!");
            search();
        }
    }

    @Override
    public String toString() {
        return id + "; " + name + "; " +phoneNumber + "; " + email;
    }
}
