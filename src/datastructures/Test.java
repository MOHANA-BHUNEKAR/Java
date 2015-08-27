package datastructures;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class Test {
	
	 public static void main(String[] args) throws IOException {
	        Workbook wb = new HSSFWorkbook();
	        CreationHelper helper = wb.getCreationHelper();
	        Sheet sheet = wb.createSheet("new sheet");

	        CSVReader reader = new CSVReader(new FileReader("data.csv"));
	        String[] line;
	        int r = 0;
	        while ((line = reader.readNext()) != null) {
	            Row row = sheet.createRow((short) r++);

	            for (int i = 0; i < line.length; i++)
	                row.createCell(i)
	                   .setCellValue(helper.createRichTextString(line[i]));
	        }

	        // Write the output to a file
	        FileOutputStream fileOut = new FileOutputStream("workbook.xls");
	        wb.write(fileOut);
	        fileOut.close();
	    }

}
