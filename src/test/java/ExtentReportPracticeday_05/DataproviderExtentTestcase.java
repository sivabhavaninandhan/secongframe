package ExtentReportPracticeday_05;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataproviderExtentTestcase {

	@DataProvider
	
	public String[][] validation() throws IOException
	{
		String pathfile="C:\\Users\\ASUS\\OneDrive\\gangas.xlsx";
		FileInputStream fis=new FileInputStream(pathfile);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rws=sheet.getPhysicalNumberOfRows();
		int cels=sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] dataexcel=new String[rws-1][cels];
		for(int r=0;r<rws-1;r++)
		{
			for(int c=0;c<cels;c++)
			{
				DataFormatter df=new DataFormatter();
				dataexcel[r][c]=df.formatCellValue(sheet.getRow(r+1).getCell(c));
			}
		}
		fis.close();
		return dataexcel;
	}
}
