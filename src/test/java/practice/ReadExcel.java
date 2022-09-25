package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) {
		readexcel("Class");
	}


private static void readexcel(String sheetname) {
	File f=null;
	FileInputStream fin=null;
	FileOutputStream fout=null;
	Workbook wbook=null;
	Object[][] data=null;
	try
	{
		f=new File("C:\\Users\\Shrikant Jambhulkar\\eclipse-workspace\\JavaTutorial\\School.xlsx");
		//	f=new File(System.getProperty("used.dir")+"\\"+"School.xlsx");
		System.out.println("Present Project Directory : "+ System.getProperty("user.dir"));
		fin=new FileInputStream(f);
		wbook=new XSSFWorkbook(fin);
		Sheet sh=wbook.getSheet(sheetname);
		int rownum=sh.getLastRowNum();
		System.out.println(rownum);
		int colnum=sh.getRow(0).getLastCellNum();
		data=new Object[rownum+1][colnum];
		
		for(int i=0;i<=rownum;i++)
		{
			Row r=sh.getRow(i);
			for(int j=0;j<r.getLastCellNum();j++)
			{
				Cell c=r.getCell(j);
				
				
				if(i!=0&& j==3)
				{
					if(Double.parseDouble((String) data[i][2])>=94 )
					{
						Cell c1=r.createCell(3, CellType.STRING);
						c1.setCellValue("P");
					
					}
					else
					{
						Cell c1=r.createCell(3, CellType.STRING);
						c1.setCellValue("F");
					}
				}
				String value=celltoString(c);
				data[i][j]=value;
				
				System.out.print(value+" ");
				
			}
			System.out.println();
			
		}
		fout=new FileOutputStream(f);
		wbook.write(fout);
		fout.close();
		
	}
	catch(Exception e)
	{
		System.out.println("Exception occured");
	}
	
}

private static String celltoString(Cell c) {
	CellType type;
	Object result=null;
	type=c.getCellType();
	switch(type)
	{
	case BLANK:
		break;
	case NUMERIC:
		result=(int)c.getNumericCellValue();
		break;
	case BOOLEAN:
		result=c.getBooleanCellValue();
		break;
	case STRING:
		result=c.getRichStringCellValue();
		break;
		default:
			System.out.println("Vlaue is not in proper formate");
		
	}
	return result.toString();
}

}

