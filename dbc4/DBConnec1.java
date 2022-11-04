package dbc4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnec1 {
    private static Connection connec;
//싱글톤 패턴 , 외부에서 객체생성 못하게 private 처리, 메모리 낭비 막기 위해 
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if(connec == null) { //dbConn이 null이면 Connection 객체 생성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "test";
            String pw = "1111";

            Class.forName("oracle.jdbc.driver.OracleDriver");  //드라이버 로딩
            connec = DriverManager.getConnection(url, user, pw);
            // db연결정보 객체 생성 및 연결
        }
        return connec;
    }
    
    // DB 연결 해제(닫기)
    public static void close() throws SQLException {        
        if (connec != null) {
            if (!connec.isClosed()) {
                connec.close();
            }
        }

        connec = null;
    }
}
