package class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo2 {

    public static void main(String[] args) throws IOException {
        String path= "Files/practice.properties";
        FileOutputStream fileOutputStream= new FileOutputStream(path);
        Properties properties= new Properties();
        properties.setProperty("Month","March");
        properties.store(fileOutputStream,"A month has been added");
    }
}
