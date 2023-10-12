package JDBC.Gun1;

import JDBC.JDBCparent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_NextPrevAbsRel extends JDBCparent {
    @Test
    public void test1() throws SQLException {
        ResultSet rs = sorguEkrani.executeQuery("select * from language");

        rs.next();
        System.out.println("1.Satır = " + rs.getString(2));// 2 column index değil

        rs.next();
        System.out.println("2.Satır = " + rs.getString(2));// name istemiş gibi

        rs.previous();// 1 adım geri demek
        System.out.println("1.Satır = " + rs.getString(2));


    }
}
