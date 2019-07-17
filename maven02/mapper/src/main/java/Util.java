import java.sql.Connection;
import java.sql.DriverManager;

public class Util {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?serverTimezone=GMT%2B8","root","123456");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
