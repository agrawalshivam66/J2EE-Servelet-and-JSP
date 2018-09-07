import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Row;

import com.healthmarketscience.jackcess.*;
import com.healthmarketscience.jackcess.Table;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ExcelReader {
  
    
    static TableBuilder tb;
    static Table table;
    static Database db;
    static Workbook workbook;
    
    public static void main(String[] args) throws IOException, InvalidFormatException {

    File fileChoosed=fileChooser.ChooseFile();
    
    if (fileChoosed==null)
    {
    	//showing error message
        final JPanel panel = new JPanel();
        JOptionPane.showMessageDialog(panel, "No files selected or file is in use", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    else {
        //showing success message
        final JPanel panel = new JPanel();
        JOptionPane.showMessageDialog(panel, "Transferring Data Now...Please Wait", "Loading", JOptionPane.OK_CANCEL_OPTION);
    }
    
    	//checking login in backgroud
    	Login.main(new String[]{});
    
    	try {
        // Creating a Workbook from an Excel file (.xls or .xlsx)
         workbook = WorkbookFactory.create(fileChoosed);
       
        //geting excel version name
        String version = workbook.getSpreadsheetVersion().toString();
         
        //keeping excel version number only
        version = version.substring(5,version.length());
        
        //comparing to access version and getting Database.FileFormat object
         version = AccessVersion(version);
         Database.FileFormat accessVersion =  Database.FileFormat.valueOf(version);
         
         
        	String accessFileName = fileChooser.selectedFilePath + "/" + fileChooser.selectedFileName + ".mdb";
        File file = new File(accessFileName);
        db = new DatabaseBuilder(file)
          .setFileFormat(accessVersion)
          .create();
        }
    	
        catch(Exception e)
        {
        	//showing error message
            final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, e, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
      
   //  Iterating over all the sheets in the workbook (Multiple ways)
  
        // 1. You can obtain a sheetIterator and iterate over it
        Iterator<Sheet> sheetIterator = workbook.sheetIterator();
        System.out.println("Retrieving Sheets using Iterator");
        while (sheetIterator.hasNext()) {
            
        	//getting sheets
        	Sheet sheet = sheetIterator.next();
            
            //creating table with sheet name
            tb = new TableBuilder(sheet.getSheetName());
   
            
        // Create a DataFormatter to format and get each cell's value as String
        DataFormatter dataFormatter = new DataFormatter();

        //obtain a rowIterator and columnIterator and iterate over them
        System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
        Iterator<Row> rowIterator = sheet.rowIterator();
        
        //getting column names iterating only first row
            Row row = rowIterator.next();

            // Now let's iterate over the columns of the current row
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
               if(dataFormatter.formatCellValue(cell)!="") {
            	   String cellValue = dataFormatter.formatCellValue(cell);
                 
                 tb.addColumn(new ColumnBuilder(cellValue, DataType.TEXT));	
                 
            }
            }
            table = tb.toTable(db);
           
        
            // obtain a rowIterator and columnIterator and iterate over them
            System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
            Iterator<Row> rowIterator2 = sheet.rowIterator();
            rowIterator2.next();//skipping Column name
            
           //Creating a formula evaluator
            FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
            int count=0;
            
            while (rowIterator2.hasNext()) {
                Row row2 = rowIterator2.next();
               
               count=0;
               Object RowArray[] = new Object[1000];
               
               // Now let's iterate over the columns of the current row
                Iterator<Cell> cellIterator2 = row2.cellIterator();

                while (cellIterator2.hasNext()) {
                    Cell cell = cellIterator2.next();
                    
                    if(dataFormatter.formatCellValue(cell)!="") {
                    String cellValue = dataFormatter.formatCellValue(cell, evaluator);
                   
                    RowArray[count]=(Object)cellValue;
                    count++;
                }
                  
                }
                	 table.addRow(RowArray);
             
            }
        }    
        // Closing the workbook
        workbook.close();
        
        //showing success message
        final JPanel panel = new JPanel();
        JOptionPane.showMessageDialog(panel, "Access File Successfully Created and saved with the Excel file", "Success", JOptionPane.INFORMATION_MESSAGE);    
    }
     
    public static String AccessVersion(String version)
    {
        switch(version)
        {
        case "97":
       return "V2000"; 
       	
        case "2000":
        return "V2000";
        
        case "2003":
        	return "V2003";
       	 
        case "2007":
        	return "V2007";
        	
        case "2010":
        	return "V2010";
       	 
        case "2016":
        	return "V2016";
        
        default:
        	return "2003";
        }
        
    }
}
