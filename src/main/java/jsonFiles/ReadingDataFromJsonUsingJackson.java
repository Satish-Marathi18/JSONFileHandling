package jsonFiles;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.crypto.spec.PSource;
import java.io.File;
import java.io.IOException;

public class ReadingDataFromJsonUsingJackson {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        File f = new File("C:\\satish\\JSONFileHandling\\src\\main\\resources\\employees.json");

        Employees emp;
            try {
                emp = objectMapper.readValue(f,Employees.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        System.out.println("First Name: "+emp.getFirstName());
        System.out.println("Last Name: "+emp.getLastName());
        for(Address adds : emp.getAddress()){
            System.out.println("Street: "+adds.getStreet());
            System.out.println("City: "+adds.getCity());
            System.out.println("State: "+adds.getState());
        }
    }
}
