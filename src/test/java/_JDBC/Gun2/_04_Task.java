package _JDBC.Gun2;

import _JDBC.JDBCParent;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _04_Task extends JDBCParent {

    @Test
    public void excelDataBase() throws SQLException, IOException {
        ResultSet rs = statement.executeQuery("select * from actor");
        ResultSetMetaData rsmd = rs.getMetaData();

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("DatabaseSheet");

        Row row = sheet.createRow(rsmd.getColumnCount());


        for (int i = 1; i <= rsmd.getColumnCount() ; i++)
            row.setRowNum(i);

        while (rs.next()) {

                for (int i = 1; i <= rsmd.getColumnCount(); i++)

                  row.createCell(i).setCellValue(i);

            }
            String dataBaseExcel = "src/test/java/ApachePOI/resource/DataBase.xlsx";
        FileOutputStream fileOutputStream = new FileOutputStream(dataBaseExcel);
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();




    }
}
