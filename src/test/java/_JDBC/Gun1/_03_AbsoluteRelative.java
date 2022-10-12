package _JDBC.Gun1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_AbsoluteRelative extends JDBCParent {

    @Test
    private void test1() throws SQLException {
    //    next();       bir sonraki ROW
    //    previous();   bir önceki ROW
    //    absolute(4);  baştan sırallama yaparak 4. ROW a gider
    //    relative(4);  bulunduğu row dan sayarak 4 ROW gider

        ResultSet rs = statement.executeQuery("select * from film");

        rs.absolute(10);  // 10. satıra git
        String title = rs.getString("title");
        System.out.println("title = " + title);

        rs.absolute(15);  // 15. satıra git
        title = rs.getString("title");
        System.out.println("title = " + title);

        rs.absolute(-15);  // (-)sondan sayarak 15 satır geri git
        title = rs.getString("title");
        System.out.println("title = " + title);

        rs.relative(5);  // en son bulunduğun yerden 5 satır ileri git
        title = rs.getString("title");
        System.out.println("title = " + title);

        rs.relative(-5);  // (-)en son bulunduğun yerden 5 satır geri git
        title = rs.getString("title");
        System.out.println("title = " + title);

    }
}
