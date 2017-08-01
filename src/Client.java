import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.io.Serializable;

/**
 * Created by alan on 15.03.16.
 */
public class Client implements Serializable, ListModel {

    private String name;
    private String id;
    private String phoneNumber;
    private String email;
    private String address;
    private String date;
    private String numberOfRooms;
    private String typeOfApplience;

    public Client(String id, String name, String phoneNumber, String email, String address, String date, String numberOfRooms, String typeOfApplience) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.date = address;
        this.numberOfRooms = numberOfRooms;
        this.typeOfApplience = typeOfApplience;
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

    @Override
    public String toString() {
        return id + "; " + name + "; " +phoneNumber + "; " + email + "; address: " + address + "; date: " + date + "; number of rooms: " + numberOfRooms + "; type of appliance: " + typeOfApplience;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public Object getElementAt(int index) {
        return null;
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }
}
