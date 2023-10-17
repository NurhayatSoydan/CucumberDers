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
        System.out.println("1.Satır = " + rs.getString(2));// 2 column index değil    -ing

        rs.next();
        System.out.println("2.Satır = " + rs.getString(2));// name istemiş gibi       -ital

        rs.previous();// 1 adım geri demek
        System.out.println("1.Satır = " + rs.getString(2)); //                        -ing

    }
    @Test
    public void test2() throws SQLException {
        ResultSet rs = sorguEkrani.executeQuery("select * from film");

        rs.absolute(10);// 10 satıra direk git
        System.out.println("10.satır title = " + rs.getString("title")); //10.satır title = ALADDIN CALENDAR

        rs.absolute(5);// 5 satıra direk git
        System.out.println("5.satır title = " + rs.getString("title"));//5.satır title = AFRICAN EGG

        rs.relative(5);// en son neredeysen , ordan ititbaren 5 git
        System.out.println("10.satır = " + rs.getString("title"));//10.satır = ALADDIN CALENDAR

        rs.next(); // 11 e gider

    }
}
// rs.next() : sonraki satır
// rs.previous : önceki satır
// rs.absolute(10) : baştan itibaren 10.satıra gider.
// rs.relative(10) : bulunduğu yerden 10.satıra gider.
// rs.absolute(-10) : - (eksi) sondan demektir, sondan 10.satır
// rs.relative(-5) :  - (eksi) bulundu yerden 5 satır geri