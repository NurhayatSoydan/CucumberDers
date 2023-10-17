package JDBC.Gun1;

import JDBC.JDBCparent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _05_FirstLastGetRowGetType extends JDBCparent {
    @Test
    public void _05_FirstLastGetRowGetType() throws SQLException {
        ResultSet rs = sorguEkrani.executeQuery("select city from city");

        rs.last(); // son satıra gider
        System.out.println("son satırın şehir adı = " + rs.getString(1));

        rs.first(); // ilk satıra gider
        System.out.println("ilk satırın şehir adı = " + rs.getString(1));

        rs.last(); // sona gider
        int kacinciSatirdayim=rs.getRow(); // kaçıncı satırdayım satır numarasını al
        System.out.println("kacinciSatirdayim = " + kacinciSatirdayim);

    }
}
