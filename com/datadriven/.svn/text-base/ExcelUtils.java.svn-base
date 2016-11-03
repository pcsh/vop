package com.datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ExcelUtils {
	private static Sheet ExcelWSheet;
	private static HSSFWorkbook ExcelWBook;
	private static Cell cell;
	private static Row row;
	public static void setExcelFile(String Path,String SheetName) throws IOException {
			FileInputStream ExcelFile = new FileInputStream(Path);
			ExcelWBook = new HSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);	

	}

	@SuppressWarnings("static-access")
	public static String getCellData(int RowNum,int ColNum){  	 

      	//cell=ExcelWSheet.getRow(RowNum).getCell(ColNum);
		String CellData = null;
//		ExcelWBook = new HSSFWorkbook(ExcelFile);
//		ExcelWSheet = ExcelWBook.getSheet(SheetName);	
//		 Sheet sheet = wb.getSheetAt(0);
        row = ExcelWSheet.getRow(RowNum);
        cell = row.getCell(ColNum);  	
        if(cell.getCellType()==cell.CELL_TYPE_STRING){
        	CellData = cell.getRichStringCellValue().getString();
        }else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC){
            if (DateUtil.isCellDateFormatted(cell)) {
            	CellData = cell.getDateCellValue().toString();
            } else {
            	DecimalFormat dfs = new DecimalFormat("0");
            	CellData =dfs.format(cell.getNumericCellValue());
            }
        }else if(cell.getCellType()==cell.CELL_TYPE_BOOLEAN){
        	CellData = Boolean.toString(cell.getBooleanCellValue());;
        }else if(cell.getCellType()==cell.CELL_TYPE_FORMULA){
        	CellData = cell.getCellFormula().toLowerCase();
        }else{
        	CellData = " ";
        }
      	return CellData;
   }
	@SuppressWarnings({ "static-access", "deprecation" })
	public static void setCellData(String Result,int RowNum,int ColNum) throws IOException{
		row = ExcelWSheet.getRow(RowNum);
		cell = row.getCell(ColNum,row.RETURN_BLANK_AS_NULL);
		if(cell == null){
			cell=row.createCell(ColNum);
			cell.setCellValue(Result);
		}else{
			cell.setCellValue(Result);
		}
		FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestDate+Constant.File_TestDate);
		ExcelWBook.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}
	    
	
}
