package jsonFiles;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadingDataFromJsonUsingGson {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("C:\\satish\\JSONFileHandling\\src\\main\\resources\\employees.json");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Gson gson = new Gson();
        Employees emp = gson.fromJson(fr, Employees.class);
        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName());
        for(Address adr : emp.getAddress()) {
            System.out.println("Street: " + adr.getStreet());
            System.out.println("City: " + adr.getCity());
            System.out.println("State: " + adr.getState());
        }
    }
}
