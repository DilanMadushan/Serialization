import java.io.*;

public class Serialization {

    public static void main(String[] args) {
        Customer customer = new Customer("1", "John", "123 Main St", "123-456-7890");
        try {
            FileOutputStream fileOut = new FileOutputStream("customer.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(customer);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
