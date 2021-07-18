package gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

import gson.object.People;

public class jsonToPojo
{
    public static void main(String[] args)
    {
        Gson gson = new Gson();
        try
        {
            Reader reader = new FileReader("C:\\Users\\ferna\\Documents\\Programming\\Java\\testdrive\\src\\main\\resources\\sample.json");
            People people = gson.fromJson(reader, People.class);
            System.out.println(people);

        } catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
