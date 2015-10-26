package org.pom.DDT;
import java.io.File;
import java.io.IOException;

import jxl.*;
import jxl.read.biff.BiffException;

//import java.util.Date;



public class ExcelLib {

	public String importData(String filepath, int colNumber, int rowNumber) throws BiffException, IOException{
		Workbook mydataBook = Workbook.getWorkbook(new File(filepath));
	
		//Accessing the first sheet of the page indexed from 0
		Sheet firstSheet = mydataBook.getSheet(0);
		
		return mydataBook.getSheet(0).getCell(colNumber, rowNumber).getContents();
	}
	
}
