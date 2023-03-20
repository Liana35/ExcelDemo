package class32;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelFilesDemo5 {
    public static void main(String[] args) throws IOException {
        String path = "Files/Book2.xlsx";
        FileInputStream fileInputStream= new FileInputStream(path);
        XSSFWorkbook xssfWorkbook= new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet2= xssfWorkbook.getSheet("Sheet2");
        int noOfRows = sheet2.getPhysicalNumberOfRows();
        System.out.println(noOfRows);
        /*for(int i=0; i<noOfRows; i++){
            Row row=sheet2.getRow(i);
            //System.out.println(row.toString());
            System.out.println(row.getCell(0)+" "+row.getCell(1));
        }
*/

       /* for(int i=0; i<noOfRows; i++){
            Row row=sheet2.getRow(i);

            int noOfCells=row.getPhysicalNumberOfCells();
            for(int j=0; j<noOfCells; j++){
                Cell cell = row.getCell(j);
                System.out.print(cell+" ");//  System.out.println(row.getCell(j)+" ");
            }
            System.out.println();
        }
*/


        // another way



        List<Map<String, String>> excelData= new ArrayList<>();
          for(int i=1; i<noOfRows; i++){
            Row row=sheet2.getRow(i);
              LinkedHashMap<String,String>rowMap= new LinkedHashMap<>();
              rowMap.put("UserName",row.getCell(0).toString());
              rowMap.put("Password",row.getCell(1).toString());
              excelData.add(rowMap);
            }
            System.out.println(excelData);
        }




    }

