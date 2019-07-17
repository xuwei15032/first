import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserMapper {
    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public UserMapper() {
        con = Util.getConnection();
    }

    public User selectUserByPid(int id) throws Exception{
        String sql = "SELECT * FROM t_user WHERE pid = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        User user = null;
        while (rs.next()){
            user = new User();
            user.setPid(rs.getInt("pid"));
            user.setPname(rs.getString("pname"));
            user.setPassword(rs.getString("password"));
            user.setJob(rs.getString("job"));
        }
        return user;
    }
}
