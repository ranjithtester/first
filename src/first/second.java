package first;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class second {

	public  String  getCelldata(String excelpath,String sheet,int row,int cell) throws Throwable
	{
		FileInputStream file = new FileInputStream(excelpath);
		Workbook work = WorkbookFactory.create(file);
		String cellvalue=work.getSheet(sheet).getRow(row).getCell(cell).toString();
		return cellvalue;
	}
                                     
                                  
	}                         
                                
	
		
	
	
