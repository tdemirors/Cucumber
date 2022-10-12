package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _09_NewExcelWrite {
    public static void main(String[] args) throws IOException {

//      hafızada yeni bir Workbook oluştur, sonra Sheet oluştur, sonra Row oluştur, sonra Cell oluştur
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sayfa1");

        Row yeniSatir = sheet.createRow(0);  // satır oluşturuldu 0. yere
        Cell yeniHucre = yeniSatir.createCell(0);  // yeni satırda ilk hücre oluşturuldu
        yeniHucre.setCellValue("Merhaba Dünya");

        for (int i = 1; i < 10; i++) {
            yeniSatir.createCell(i).setCellValue(i);
        }


        String yeniExcelPath = "src/test/java/ApachePOI/resource/YeniExcel.xlsx";
        FileOutputStream outputStream = new FileOutputStream(yeniExcelPath);
        workbook.write(outputStream);
        workbook.close();  // hafıza boşaltıldı (bunu yazmak mecbur değil)
        outputStream.close();
        System.out.println("İşlem tamamlandı");





    }
}
