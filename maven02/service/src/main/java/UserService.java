public class UserService {
    UserMapper um = new UserMapper();
    public User selectUserByPid(int id) throws Exception{

        return um.selectUserByPid(id);
    }

}
