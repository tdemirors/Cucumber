package _JDBC.Gun1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_Soru extends JDBCParent {
    // city tablosundaki tüm kayıtları next ile yazdırınız
    // city tablosundaki tüm kayıtları absolute ile yazdırınız
    // city tablosundaki tüm kayıtları relative ile yazdırınız

    @Test
    public void nextTable() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from city");

        do {
            rs.next();
            String cityId = rs.getString("city_id");
            System.out.println("cityId = " + cityId);
            
            String city = rs.getString("city");
            System.out.println("city = " + city);
            
            String countryId = rs.getString("country_id");
            System.out.println("countryId = " + countryId);
            
            String lastUpdate = rs.getString("last_update");
            System.out.println("lastUpdate = " + lastUpdate);
        }
        while (!rs.isLast());
    }

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from city");

        int count = 0;
        while (rs.next()) {

            System.out.println(rs.getString(2));
            count++;
        }
        System.out.println("count = " + count);
        }

    @Test
    public void test2() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from city");

        int count = 1;
        while (rs.absolute(count)) {

            System.out.println(rs.getString(2));
            count++;
        }
        System.out.println("count = " + (count-1));
    }

    @Test
    public void test3() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from city");

        int count = 0;
        while (rs.relative(1)) {

            System.out.println(rs.getString(2));
            count++;
        }
        System.out.println("count = " + count);
    }

}
