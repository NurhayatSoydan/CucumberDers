package JDBC.Gun1;

import JDBC.JDBCparent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_Giris extends JDBCparent {
    @Test
    public void test1() throws SQLException {
        ResultSet sonuc=sorguEkrani.executeQuery("select * from customer");

    }

}
