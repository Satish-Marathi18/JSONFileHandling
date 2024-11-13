package jsonFiles;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WritingDataToJsonUsingGson {
    public static void main(String[] args) {
        List<Address> addressList = new ArrayList<Address>();
        Address a1 = new Address();
        a1.setStreet("Hoskere");
        a1.setCity("Sirsi");
        a1.setState("Karnataka");

        Address a2 = new Address();
        a2.setStreet("PES");
        a2.setCity("Bangalore");
        a2.setState("Karnataka");
        addressList.add(a1);
        addressList.add(a2);

        Employees e1 = new Employees();
        e1.setFirstName("Satis");
        e1.setLastName("Marathi");
        e1.setAddress(addressList);

        Gson gson = new Gson();

        try(FileWriter fw = new FileWriter("C:\\satish\\JSONFileHandling\\src\\main\\resources\\employees.json")) {
             gson.toJson(e1, fw);
            System.out.println("Employee added successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
