public class UserController {
    private UserService us = new UserService();
    public void selectUserByPid(int id) throws Exception{
       User user = us.selectUserByPid(id);
        System.out.println(user.getPid());
        System.out.println(user.getPname());
        System.out.println(user.getPassword());
        System.out.println(user.getJob());
    }
}
