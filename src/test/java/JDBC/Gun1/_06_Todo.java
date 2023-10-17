package JDBC.Gun1;

import JDBC.JDBCparent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _06_Todo extends JDBCparent {
    // TODO : city tablosundaki tüm satırlardaki şehir isimlerini absolute ile yazdırınız
    // TODO : city tablosundaki tüm satırlardaki şehir isimlerini relative ile yazdırınız
    @Test
    public void test1() throws SQLException {
        ResultSet rs = sorguEkrani.executeQuery("select city from city");

        for (int i = 1; i < 601; i++) {
            rs.absolute(i);
            System.out.println(i+". city = " + rs.getString("city"));
        }
    }
    @Test
    public void test2() throws SQLException {
        ResultSet rs = sorguEkrani.executeQuery("select city from city");

      while ( rs.relative(1))
       // for (int i = 1; i <= rs.getFetchSize(); i++) {
            System.out.println(". city = " + rs.getString("city"));

      //  }
    }
}
