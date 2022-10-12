package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_WriteInTheExcel {
    public static void main(String[] args) throws IOException {

        // Var olan bir EXCEL yazma işlemi
        String path = "src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";

        FileInputStream inputStream = new FileInputStream(path);  // okuma modunda açıldı
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet("Sheet1");

        // Hafızada oluşturma ve yazma işlemleri yapılıyor
        Row yeniSatir = sheet.createRow(0);  // satır oluşturuldu 0. yere
        Cell yeniHucre = yeniSatir.createCell(0);  // yeni satırda ilk hücre oluşturuldu
        yeniHucre.setCellValue("Merhaba Dünya");  // bilgi yazıldı

        for (int i = 1; i < 10; i++) {
            yeniSatir.createCell(i).setCellValue(i);
        }
        // sıra kaydetmeye geldi, bütün bilgiler hafızada buraya kadar, herşey Workbook ta
        inputStream.close();  // okuma modunu kapattım, çünkü yazma moduna geçmem gerekiyor

        // Yazma işlemini yazma modunda açıp öyle yapacağız
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();  // hafıza boşaltıldı (bunu yazmak mecbur değil)
        outputStream.close();
        System.out.println("İşlem tamamlandı");





    }

}
