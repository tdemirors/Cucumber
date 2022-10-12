package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _10_Tasks {
     /**  Soru 1:
            *  Çarpım tablosunu excele yazdırınız.
            *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
            *  sıfırdan excel oluşturarak.
            *  her bir onluktan sonra 1 satır boşluk bırakarak alt alata

          Soru 2:
            *  Çarpım tablosunu excele yazdırınız.
            *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
            *  sıfırdan excel oluşturarak.
            *  her bir onluktan sonra 1 kolon boşluk bırakarak yan yana   */

     public static void main(String[] args) {

         XSSFWorkbook workbook = new XSSFWorkbook();
         XSSFSheet sheet = workbook.createSheet("Sayfa1");

         Row yeniSatir = sheet.createRow(0);  // satır oluşturuldu 0. yere
         Cell yeniHucre = yeniSatir.createCell(0);  // yeni satırda ilk hücre oluşturuldu

         for (int i = 0; i < 5; i++) {
             yeniSatir.createCell(i).setCellValue(i + "x" + i++ + "=" + i);
         }
     }
}
