package com.mindtree.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelConfig(String path) {
		
		try {
			File src = new File(path);
			
			FileInputStream fis = new FileInputStream(src);
			
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println(e);
		} 
		
	}
	public double getData(int sheetnum, int row , int col) {
		
		sheet1 = wb.getSheetAt(0);
		
		return sheet1.getRow(row).getCell(col).getNumericCellValue();
		
	}

}
