import java.io.*;

public class Deserializable {
    public static void main(String[] args) {
        Customer customer = null;

        try (FileInputStream fileInput = new FileInputStream("E:\\AAD\\Serialization\\Serialization\\customer.ser");
             ObjectInputStream input = new ObjectInputStream(fileInput)) {

            customer = (Customer) input.readObject();

            System.out.println("Customer ID: " + customer.id);
            System.out.println("Customer Name: " + customer.name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
