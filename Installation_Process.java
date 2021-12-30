package Installation;

public class Installation_Process {

	//First step - download apache POI package - https:/www.apache.org/dyn/closer.lua/pol/release/bin/pol-bin-3.16-20170419.zip
                                                     https://poi.apache.org/download.html
	//Second step - Add all POL jar files in Reference Library folder in eclipse.
	//Third step - Now we will interact with Excel sheet. 

	//Excel sheet file contains workbooks.
	//Each workbook contains sheets. 
	//Every sheet contains rows
	//Every row contains cells
	// In the cells, actual data will be available. 
	// So we are reading or inserting data from cells 
	// Excel --> Work books --> Sheets --> Rows --> Cells 

	//Apache POI will help us to interact with Excel sheet to read and insert data.

	// APache POI provides few classes 

	// FileInputStream -To read the data from excel sheet.
	// FileOutputStream - To Write the data into Excel Sheet.
	// XSSFWorkbook  -  Class to work on workbooks such as creating an object etc 
	// XSSFSheet     -  Class to work on sheets
	// XSSRow      -    Class to work on rows
	// XSSFCell     -   Class to work on cells  
}
