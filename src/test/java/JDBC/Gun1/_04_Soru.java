package JDBC.Gun1;

import JDBC.JDBCparent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_Soru extends JDBCparent {
    // city tablosundaki tüm satırlardaki şehir isimlerini next ile yazdırınız
    @Test
    public void test1() throws SQLException {
        ResultSet rs = sorguEkrani.executeQuery("select * from city");

        while (rs.next()) // sadece nexte oluyo bu duurm
        System.out.println( rs.getString("city"));

    }
}
