package utilities;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.By;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWrite {
    public static FileInputStream fis;


    public static String readData(String sheet, int rowno, int cellno) throws IOException {

        {
            try {
                fis = new FileInputStream("./src/test/java/testdata/data.xlsx");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        Workbook wb = WorkbookFactory.create(fis);
        Sheet s = wb.getSheet(sheet);
        Row r = s.getRow(rowno);
        Cell c = r.getCell(cellno);
       return c.toString();
        //System.out.println(c.toString());
}

public static void writeData(String sheetname, int rowno, int cellno, String data) throws IOException {
      fis = new FileInputStream("./src/test/java/testdata/data.xlsx") ;
      Workbook wb = WorkbookFactory.create(fis);
      Sheet s = wb.getSheet(sheetname);
      Row r = s.createRow(rowno);
      Cell c = r.createCell(cellno);
      c.setCellValue(data);
    FileOutputStream fos = new FileOutputStream("./src/test/java/testdata/data.xlsx");
    wb.write(fos);
    fos.close();




}








}
