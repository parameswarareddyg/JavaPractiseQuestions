package com.java.day23;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public void readExcelData()
	{
		File file = new File(".\\src\\com\\java\\day23\\Data.xlsx");
		FileInputStream fis = null;
		XSSFWorkbook workbook = null;
		try {
			 fis= new FileInputStream(file);
			 workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int row = sheet.getPhysicalNumberOfRows();
			int col = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Row Count  : "+row);
			System.out.println("Column Count : "+col);
			System.out.println("***************************");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(sheet.getRow(i).getCell(j)+" ");
				}
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ReadDataFromExcel obj = new ReadDataFromExcel();
		obj.readExcelData();
	}

}
