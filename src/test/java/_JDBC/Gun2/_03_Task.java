package _JDBC.Gun2;

import _JDBC.JDBCParent;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _03_Task extends JDBCParent {

    @Test
    @Parameters("data")
     void parameterDataBase(String sendingData) throws SQLException {

        ResultSet rs = statement.executeQuery(sendingData);
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
