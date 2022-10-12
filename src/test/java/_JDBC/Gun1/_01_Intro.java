package _JDBC.Gun1;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {

    @Test
    public void test1() throws SQLException {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";  // hostname, port/db adını (use db)
        String username = "root";     // username
        String password = "'\"-LhCB'.%k[4S]z";     // password

        Connection connection = DriverManager.getConnection(url,username,password);  // connection

        Statement statement = connection.createStatement();  // sorguları çalıştırmak için page açıldı

        ResultSet rs = statement.executeQuery("select * from actor");  // sorgu sonucu oluştu ama henüz db de bekliyor

        rs.next();  // db deki 1. satır

        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        rs.next();  // db deki 2. satır

        firstName = rs.getString("first_name");
        lastName = rs.getString("last_name");

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        String actorId = rs.getString("actor_id");
        System.out.println("actorId = " + actorId);

        connection.close();







    }

}

//        Hostname: db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com
//        userName : root
//        Password: '"-LhCB'.%k[4S]z

//       1- connection : önce bağlantı ayarlarını yaptık
//           username, password, url(port,db,bağlantı yolu)

//       2- Sorgu çalıştırma yolu : sorgularımı çalıştırmak için bir sayfa(yol) açtım.

//       3- Sonuçların alınması : sorgunun çalışması sonucu veritabanından gelen bilgiler.