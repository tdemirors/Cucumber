package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _07_Soru {
    /**
      Bir önceki soruda kullanıcıdan bu sefer sütun numarasını isteyiniz ve o sütundaki bütün bilgileri yazdırınız
     */
    public static void main(String[] args) {

        System.out.print("Sütun numarasını giriniz = ");
        Scanner scan = new Scanner(System.in);
        int sutun = scan.nextInt();

        String donenSonuc = bul(sutun);
        System.out.println("Dönen Sonuç = " + donenSonuc);

    }
    public static String bul(int sutun) {

        String path = "src/test/java/ApachePOI/resource/LoginData.xlsx";

        String donecek = "";
        Workbook workbook = null;

        try {
            FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet sheet = workbook.getSheet("Login");

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++)

            if (sheet.getRow(i).getPhysicalNumberOfCells() > sutun)
                donecek += sheet.getRow(i).getCell(sutun)+"\n";

        return donecek;
    }

}

/**
 * Boş mu null mu ?
 * public static boolean isNullOrBlank(String param) {
 *     return param == null || param.trim().length() == 0;
 * }
 */