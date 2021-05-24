package StudentScore;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelDriver {
	public static void main(String[] args) {
		try{
			File file = new File("d:/xxx.xls");
			Workbook workbook = Workbook.getWorkbook(file);
			Sheet sheet = workbook.getSheet(2);
			
			int columns = sheet.getColumns();
			int row = sheet.getRows();
			System.out.println(row+"琛�"+ columns+"鍒�");
			for(int i=0 ;i<row;i++){
				for(int j=0;j<columns;j++){
					Cell cell = sheet.getCell(j,i);
					String s=cell.getContents();
					System.out.print(s+"\t");
				}
				System.out.println();
			}
						
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
