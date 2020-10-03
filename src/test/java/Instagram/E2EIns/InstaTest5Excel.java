package Instagram.E2EIns;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class InstaTest5Excel {
	
	@Test
	void readexcel() throws IOException{
	String excelFilePath = System.getProperty("user.dir")+"/excelfiles/filetoread.xlsx";
    FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
    XSSFWorkbook myWorkBook = new XSSFWorkbook(inputStream);
    
    XSSFSheet mySheet = myWorkBook.getSheetAt(0);
    
    Iterator<Row> rowIterator = mySheet.iterator();
    while (rowIterator.hasNext()) {
        Row row = rowIterator.next();
        //For each row, iterate through each columns
        Iterator<Cell> cellIterator = row.cellIterator();
        while (cellIterator.hasNext()) {
        	Cell cell = cellIterator.next();
        	System.out.println(cell);
        }
    }
    
    }
}
