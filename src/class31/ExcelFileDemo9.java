package class31;

import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo9 {
    public static void main(String[] args) throws IOException {
        List<Map<String, String>> excelData= ExcelReader.read();  //or var excelData= ExcelReader.read();
       // System.out.println(excelData);  // will get all maps
       // excelData.get(0);  // its a list of maps - 0 - we will get a map
        Map<String, String> firstRow=excelData.get(0);
      System.out.println(firstRow.get("Name"));
        System.out.println(firstRow);  // in case we dont get the right answer, check whats in row 1 to make sure its the right sheet

        System.out.println("********************************************");
        for(Map<String,String> row:excelData){
            for(Map.Entry<String,String>entry:row.entrySet()){   // for(var entry:row.entrySet())
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
        System.out.println("******************");

    }
}
