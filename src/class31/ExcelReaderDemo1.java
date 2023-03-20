package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReaderDemo1 {
    //location of File on the computer
    public static void main(String[] args) throws IOException {
        String path = "Files/Book1.xlsx";
        // navigating to the file
        FileInputStream fileInputStream= new FileInputStream(path);  // when we want to read input
        // when write - output

        // its a class that knows how to read and write data to an Excel file
        XSSFWorkbook xssfWorkbook= new XSSFWorkbook(fileInputStream);
        //from the excel file we need to get the sheet first using below method
       // Sheet sheet1= xssfWorkbook.getSheet("sheet1");  both are fine for sheet
        XSSFSheet sheet1= xssfWorkbook.getSheet("Sheet1");

        // we are interested in row 1 we pass 1 inside the getRow method rows and columns are indexed based like arrays
        Row row= sheet1.getRow(1);
        Cell cell= row.getCell(1);

        System.out.println(cell);



    }
}
