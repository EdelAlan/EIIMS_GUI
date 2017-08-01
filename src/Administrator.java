import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by alan on 12.03.16.
 */
public class Administrator extends JFrame {
    private static final String LOGIN = "admin";
    private static final String PASSWORD = "admin";

    public Administrator() {}

    public static String getLogin() {
        return LOGIN;
    }

    public static String getPassword() {
        return PASSWORD;
    }

    public String assignClient(int clientNum, int engineerNum) {
            int chooseClient = clientNum;
            int chooseEngineer = engineerNum;
        Data.getEngineers().get(chooseEngineer).getClients().add(Data.getClients().get(chooseClient));
        return "Engineer: " + Data.getEngineers().get(chooseEngineer).getId() + "; Client assigned: " +Data.getClients().get(chooseClient).getId();
    }

    public String deleteClerk(String i) {
        int j = searchClerk(i);
        if (j == -1) {
            return null;
        }
        String id = Data.getClerks().get(j).getId();
        Data.getClerks().remove(j);
        return id;
    }

    public String deleteEngineer(String i) {
        int j = searchEngineer(i);
        if (j == -1) {
            return null;
        }
        String id = Data.getEngineers().get(j).getId();
        Data.getEngineers().remove(j);
        return id;
    }

    public String deleteManager(String i) {
        int j = searchManager(i);
        if (j == -1) {
            return null;
        }
        String id = Data.getManagers().get(j).getId();
        Data.getManagers().remove(j);
        return id;
    }

    public String deleteClient(String i) {
        int j = searchClient(i);
        if (j == -1) {
            return null;
        }
        String id = Data.getClients().get(j).getId();
        Data.getClients().remove(j);
        return id;
    }

    public String registerClient(String name, String phone, String email, String address, String date, String numOfRooms, String typeOfApp) {
        String id;

        if (Data.getClientCount() < 10) id = "CL00000" + Data.getClientCount();
        else if (Data.getClientCount() < 100) id = "CL0000" + Data.getClientCount();
        else if (Data.getClientCount() < 1000) id = "CL000" + Data.getClientCount();
        else if (Data.getClientCount() < 10000) id = "CL00" + Data.getClientCount();
        else if (Data.getClientCount() < 100000) id = "CL0)" + Data.getClientCount();
        else id = "CL" + Data.getClientCount();

        Data.setClientCount(Data.getClientCount()+1);

        Data.getClients().add(new Client(id, name, phone, email, address, date, numOfRooms, typeOfApp));

        return id;
    }

    public String registerClerk(String name, String phone, String email) {
        String id;
        if (Data.getClerkCount() < 10) id = "C00000" + Data.getClerkCount();
        else if (Data.getClerkCount() < 100) id = "C0000" + Data.getClerkCount();
        else if (Data.getClerkCount() < 1000) id = "C000" + Data.getClerkCount();
        else if (Data.getClerkCount() < 10000) id = "C00" + Data.getClerkCount();
        else if (Data.getClerkCount() < 100000) id = "C0)" + Data.getClerkCount();
        else id = "C" + Data.getClerkCount();

        Data.setClerkCount(Data.getClerkCount()+1);

        Data.getClerks().add(new Clerk(id, name, phone, email));

        return id;
    }

    public String registerEngineer(String name, String phone, String email) {
        String id;

        if (Data.getEngineerCount() < 10) id = "E00000" + Data.getEngineerCount();
        else if (Data.getEngineerCount() < 100) id = "E0000" + Data.getEngineerCount();
        else if (Data.getEngineerCount() < 1000) id = "E000" + Data.getEngineerCount();
        else if (Data.getEngineerCount() < 10000) id = "E00" + Data.getEngineerCount();
        else if (Data.getEngineerCount() < 100000) id = "E0)" + Data.getEngineerCount();
        else id = "E" + Data.getEngineerCount();

        Data.setEngineerCount(Data.getEngineerCount() + 1);

        Data.getEngineers().add(new Engeneer(id, name, phone, email, new ArrayList<Client>()));

        return id;
    }

    public String registerManager(String name, String phoneNumber, String email) {
            String id;

            if (Data.getManagerCount() < 10) id = "M00000" + Data.getManagerCount();
            else if (Data.getManagerCount() < 100) id = "M0000" + Data.getManagerCount();
            else if (Data.getManagerCount() < 1000) id = "M000" + Data.getManagerCount();
            else if (Data.getManagerCount() < 10000) id = "M00" + Data.getManagerCount();
            else if (Data.getManagerCount() < 100000) id = "M0)" + Data.getManagerCount();
            else id = "M" + Data.getManagerCount();

            Data.setManagerCount(Data.getManagerCount() +1);

            Data.getManagers().add(new Manager(id, name, phoneNumber, email));
         return id;
    }

    public void search() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1.Search for a clerk");
        System.out.println("2.Search for a engineer");
        System.out.println("3.Search for a manager");
        System.out.println("4.Search for a client");
        System.out.println("0.Exit to main menu");

        try {
            int i = Integer.parseInt(reader.readLine());
            if (i == 1) {
                System.out.print("Enter clerk's name: ");
                String s = reader.readLine();
                int j = searchClerk(s);
                System.out.println(Data.getClerks().get(j).toString());
            } else if (i == 2) {
                System.out.print("Enter engineer's name: ");
                String s = reader.readLine();
                int j = searchEngineer(s);
                System.out.println(Data.getEngineers().get(j).toString());
            } else if (i == 3) {
                System.out.print("Enter manager's name: ");
                String s = reader.readLine();
                int j = searchManager(s);
                System.out.println(Data.getManagers().get(j).toString());
            } else if (i == 4) {
                System.out.print("Enter client's name: ");
                String s = reader.readLine();
                int j = searchClient(s);
                System.out.println(Data.getClients().get(j).toString());
            } else if (i == 0) {
                //menu();
            } else {
                System.out.println("Wrong input!");
                search();
            }
        } catch (Exception e) {
            System.out.println("Wrong input!");
            search();
        }
    }

    public int searchClient(String in) {
        for (int i=0;i<Data.getClients().size();i++) {
            if (in.equals(Data.getClients().get(i).getName())) {
                return i;
            } else if (in.equals(Data.getClients().get(i).getId())) {
                return i;
            }
        }
        return -1;
    }

    public int searchClerk(String in) {
        for (int i=0;i<Data.getClerks().size();i++) {
            if (in.equals(Data.getClerks().get(i).getName())) {
                return i;
            } else if (in.equals(Data.getClerks().get(i).getId())) {
                return i;
            }
        }
        return -1;
    }

    public int searchEngineer(String in) {
        for (int i=0;i<Data.getEngineers().size();i++) {
            if (in.equals(Data.getEngineers().get(i).getName())) {
                return i;
            } else if (in.equals(Data.getEngineers().get(i).getId())) {
                return i;
            }
        }
        return -1;
    }

    public int searchManager(String in) {
        for (int i=0;i<Data.getManagers().size();i++) {
            if (in.equals(Data.getManagers().get(i).getName())) {
                return i;
            } else if (in.equals(Data.getManagers().get(i).getId())) {
                return i;
            }
        }
        return -1;
    }

    public String editClerk(String i, String phone, String email) {

        int j = searchClerk(i);
        if (j == -1) {
            return null;
        }

        Data.getClerks().get(j).setPhoneNumber(phone);
        Data.getClerks().get(j).setEmail(email);

        return Data.getClerks().get(j).getId();
    }

    public String editEngineer(String i, String phone, String email) {
            int j = searchEngineer(i);
            if (j == -1) {
                return null;
            }
                Data.getEngineers().get(j).setPhoneNumber(phone);
                Data.getEngineers().get(j).setEmail(email);
        return Data.getEngineers().get(j).getId();
    }

    public String editManager(String i, String phone, String email) {
            int j = searchManager(i);
            if (j == -1) {
                return null;
            }
                Data.getManagers().get(j).setPhoneNumber(phone);
                Data.getManagers().get(j).setEmail(email);
        return Data.getManagers().get(j).getId();
    }

    public String editClient(String i, String phone, String email) {
            int j = searchManager(i);
            if (j == -1) {
                return null;
            }
                Data.getClients().get(j).setPhoneNumber(phone);
                Data.getClients().get(j).setEmail(email);
        return Data.getClients().get(j).getId();
    }

    public void logout() {
        try {
            Data.writeClerks();
            Data.writeEngineers();
            Data.writeManagers();
            Data.writeClients();

            Data.writeClerksCount();
            Data.writeEngineersCount();
            Data.writeManagersCount();
            Data.writeClientsCount();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        LoginGUI.loginMenu();
    }
}

