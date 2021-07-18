package gson;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.yaml.snakeyaml.Yaml;

public class yamlTestDrive {

    public static void main(String[] args) throws IOException
    {

        File f = new File("C:\\Users\\ferna\\eclipse-workspace\\testdrive\\src\\main\\java\\gson\\sample.yaml");
        final Yaml yaml = new Yaml();

        try {
            final Object loadedYaml = yaml.load(new FileReader(f));
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(loadedYaml, LinkedHashMap.class);

            System.out.println(json);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
