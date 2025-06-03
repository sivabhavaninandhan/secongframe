package ExtentReportDay_15;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class dataproviderdemo {
	
	@DataProvider
	public String[][] verification() throws IOException
	{
		String path="C:\\Users\\ASUS\\OneDrive\\ganga.xlsx";
		
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rws=sheet.getPhysicalNumberOfRows();
		int cels=sheet.getRow(0).getPhysicalNumberOfCells();
		
		String data[][]=new String[rws-1][cels];
		
		for(int r=0;r<rws-1;r++)
		{
			for(int c=0;c<cels;c++)
			{
				DataFormatter df=new DataFormatter();
				data[r][c]=df.formatCellValue(sheet.getRow(r+1).getCell(c));
			}
		}
		fis.close();
		return data;
	}

}
