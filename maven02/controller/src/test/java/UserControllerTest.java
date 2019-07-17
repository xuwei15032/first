import org.junit.Test;

public class UserControllerTest {
    @Test
    public void selectUserByPid() throws Exception{
        UserController uc = new UserController();
        uc.selectUserByPid(19);
    }
}
