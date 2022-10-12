package _JDBC.Gun2;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _02_GetAllRowColumn extends JDBCParent {

    @Test
    public void test1() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from language");
//      ResultSet : data + meta (data dışındaki diğer bilgiler kolon sayısı vs...)

        ResultSetMetaData rsmd = rs.getMetaData();
//      Sonuçların haricindeki diğer bilgiler: kolon sayısı, isimleri, tipleri

        int columnCount = rsmd.getColumnCount();
        System.out.println("columnCount = " + columnCount);

        for (int i = 1; i <= columnCount; i++) {  // db de column lar 1 den başlıyor

            String columnType = rsmd.getColumnTypeName(i);
            String columnName = rsmd.getColumnName(i);

            System.out.println(columnType + " -- " + columnName);

        }
    }

    @Test
    public void test2() throws SQLException {
        // language tablosundaki tüm satırları ve tüm sütünları
        // aynı mysql sonuç ekranında olduğu gibi

        ResultSet rs = statement.executeQuery("select * from language");
        ResultSetMetaData rsmd = rs.getMetaData();

        for (int i = 1; i <= rsmd.getColumnCount(); i++)
            System.out.print(rsmd.getColumnName(i) + " ");

        System.out.println();

        while (rs.next()) {

            for (int i = 1; i <= rsmd.getColumnCount(); i++)
                System.out.print(rs.getString(i) + " ");

            System.out.println();
        }

    }

    @Test
    public void test3() throws SQLException {
        // language tablosundaki tüm satırları ve tüm sütünları
        // aynı mysql sonuç ekranında olduğu gibi

        ResultSet rs = statement.executeQuery("select * from language");
        ResultSetMetaData rsmd = rs.getMetaData();

        for (int i = 1; i <= rsmd.getColumnCount(); i++)
            System.out.printf("%-15s", rsmd.getColumnName(i));
        // % : değişkenin değerini işaret eder
        // - : sola dayalı yazdırır default sağa dayalı yazdırır
        // 15 : kaç karakter boşluk bırakılacak onu temsil eder
        // s : String değerler için, d: sayısal değerler için kullanılır
        // %5.2d : sayı için 5 hane kulllan, ondalıklı kısım için 2 hane kullan

        System.out.println();

        while (rs.next()) {

            for (int i = 1; i <= rsmd.getColumnCount(); i++)
                System.out.printf("%-15s", rs.getString(i));

            System.out.println();
        }

    }

    @Test
    public void test4() throws SQLException {
        // actor tablosundaki tüm satırları ve tüm sütunları yazdırınız, aynı mysql sonuç ekranında olduğu gibi
        // fakat metod kullanınız, metoda sorguyu gönderiniz ve orada yazdırınız.
        getTable("select * from actor");
    }

    public void getTable(String data) throws SQLException {
        ResultSet rs = statement.executeQuery(data);
        ResultSetMetaData rsmd = rs.getMetaData();

        for (int i = 1; i <= rsmd.getColumnCount(); i++)
            System.out.printf("%-15s", rsmd.getColumnName(i));
        System.out.println();

        while (rs.next()) {

            for (int i = 1; i <= rsmd.getColumnCount(); i++)
                System.out.printf("%-15s", rs.getString(i));
            System.out.println();

        }
    }
}
