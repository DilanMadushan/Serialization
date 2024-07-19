
import java.io.*;

public class Customer implements Serializable {

    private static final long serialVersionUID = -5074928767029845376L;

    String id;
    String name;
    String address;
    String phone;

    public Customer(String id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

}
