package Utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtility {
    private static Connection connection;
    protected static Statement statement;
    private static void DBConnectionOpen() {

        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";

        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private static void DBConnectionClose() {

        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {

        List < List < String > > tablo = getListData("select * from actor");

    }
    public static List < List < String > > getListData(String query) {
        List <List< String >> tablo = new ArrayList<>();
//      db den bütün satırları ve sütunları okuyup bu liste atacağım

//      db bağlantısını aç
        DBConnectionOpen();

        try {
//          1- sorguyu çalıştır
            ResultSet rs = statement.executeQuery(query);

//          2- bütün satırları ve o satırdaki sütunları oku tabloye ekle
            int columnSayisi = rs.getMetaData().getColumnCount();

            while (rs.next()) {

                List<String> satir = new ArrayList<>();
                for (int i = 1; i <= columnSayisi; i++){
                    satir.add(rs.getString(i));
                }
                tablo.add(satir);
            }
        } catch (Exception ex) {
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }
        DBConnectionClose();
        return tablo;
    }
}


