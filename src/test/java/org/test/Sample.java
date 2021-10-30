package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		File f=new File("C:\\Users\\GOWTHAM\\eclipse-workspace\\MavenExcel\\testdata\\aravinth1.xlsx");
		FileInputStream stream=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet("sheet1");
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		
		for (int i = 0; i <sheet.getPhysicalNumberOfRows() ; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				System.out.print(stringCellValue +"\t");
				
			}
			System.out.println();
			System.out.println("===============================");
			
			
		}	
	}

}
