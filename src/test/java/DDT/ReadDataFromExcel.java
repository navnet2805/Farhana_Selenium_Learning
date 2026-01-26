package DDT;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromExcel {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        //Workbook -> Sheet -> row -> cell => XSSF

        /*
        1. to get the path of excel
        2.to read data -> Fileinputstream(excel sheet)
         3. Workbook
         4. Sheet
         5. row
         6. Cell
         */

        String excelPath = "C:\\Users\\Naveen\\OneDrive\\Desktop\\TestData.xlsx";

        FileInputStream file = new FileInputStream(excelPath);

        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int noOfRows = sheet.getLastRowNum(); //number of rows
        int noOfCells = sheet.getRow(1).getLastCellNum();

        System.out.println(noOfRows); //row always starts from Zero
        System.out.println(noOfCells); //2

        for (int row=1 ; row<=noOfRows ; row++) //row =1 , to remove the header
        {
            XSSFRow currentRow =  sheet.getRow(row);
            for (int cell=0 ; cell<noOfCells ; cell++) //cell
            {
                XSSFCell currecntCell = currentRow.getCell(cell);
                System.out.print(currecntCell+"\t");
            }
            System.out.println();
        }

        file.close();
        workbook.close();
    }
}
