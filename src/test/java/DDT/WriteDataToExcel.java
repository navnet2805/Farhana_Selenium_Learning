package DDT;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataToExcel {

    public static void main(String[] args) throws IOException {
        String excelPath = "C:\\Users\\Naveen\\OneDrive\\Desktop\\TestData.xlsx";

        FileOutputStream file = new FileOutputStream(excelPath);

        XSSFWorkbook workbook = new XSSFWorkbook(); // 1st step workbook

        XSSFSheet sheet = workbook.createSheet("SheetNo1"); //creating a sheet

        XSSFRow row1 = sheet.createRow(0); //header
        row1.createCell(0).setCellValue("Name");
        row1.createCell(1).setCellValue("Age");
        row1.createCell(2).setCellValue("place");

        XSSFRow row2 = sheet.createRow(1);
        row2.createCell(0).setCellValue("Nav");
        row2.createCell(1).setCellValue("29");
        row2.createCell(2).setCellValue("blr");

        XSSFRow row3 = sheet.createRow(2);
        row3.createCell(0).setCellValue("Name1");
        row3.createCell(1).setCellValue("Age1");
        row3.createCell(2).setCellValue("place1");

        workbook.write(file);
        file.close();
        workbook.close();


    }
}