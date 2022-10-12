package _JDBC.Gun2;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_SqlExample extends JDBCParent {
    // last, first, getRow, getInt, getDouble

    @Test
    public void test() throws SQLException {
        ResultSet rs = statement.executeQuery("select city_id, city, country_id from city");

        rs.last();  // sonuncu row a gider

        String id = rs.getString(1);  // city_id
        System.out.println("id = " + id);

        int idInt = rs.getInt(1);
        System.out.println("idInt = " + idInt);

        String name = rs.getString(2);
        System.out.println("name = " + name);

//        int nameInt = rs.getInt(2);
//        System.out.println("nameInt = " + nameInt);
//        tipi uygun olan dönüşümle, mesela hepsini String alabiliriz
//        ancak tipi uygun olmayan mesela isimleri, int olarak alamaz

        int kacinciSatir = rs.getRow();
//      bir sorgunun sonuncunda kaç satır geldiğini ve
//      rs.last(); dedikten sonra rs.getRow(); ile alabilirim toplam satır sayısını verir

        rs.first();  // ilk satıra gider
    }
}
