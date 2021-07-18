package gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import gson.object.People;
import gson.object.Person;

public class GsonTestDrive {

    public static void main(String[] args) throws FileNotFoundException
    {
        //JSON to generic Object
        String filePath = "C:\\Users\\ferna\\Documents\\Programming\\Java\\testdrive\\src\\main\\resources\\sample.json";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        Gson gson = new Gson();
        JsonObject js = gson.fromJson(bufferedReader, JsonObject.class);
        System.out.println("Json to Object: "+ js);

        //JSON to POJO
        Reader reader = new FileReader("C:\\Users\\ferna\\Documents\\Programming\\Java\\testdrive\\src\\main\\resources\\sample.json");
        People people_pojo = gson.fromJson(reader, People.class);
        System.out.println(people_pojo);

        //POJO to JSON
        Person person1 = new Person("Oswaldo", 'M', 40);
        Person person2 = new Person("Fernando", 'M', 25);
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(person1);
        people.add(person2);
        String personJson = gson.toJson(people);
        System.out.println(personJson);
    }

}
