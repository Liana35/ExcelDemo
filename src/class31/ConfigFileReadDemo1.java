package class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadDemo1 {
    public static void main(String[] args) throws IOException {
        String path="Files/config.properties";// location of the path of file from which we want to read the data -config.properties
        // telling java to navigate to that folder(above)
        /// A class that helps us navigate to that folder where file is stored
        // if an issue with second FileInputStream - hover your mouse and click on add exception to method signature
        FileInputStream fileInputStream= new FileInputStream(path);

        // this Properties class will assist us to read and write data to .properties files
        Properties properties= new Properties();
        //loads all the data from file inside ythe above object"properties"
        properties.load(fileInputStream);
        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));
        System.out.println(properties.get("browser"));


    }
}
