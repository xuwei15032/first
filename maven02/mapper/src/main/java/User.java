public class User {
    private int pid;
    private String pname;
    private String password;
    private String job;

    public User(){

    }
    public User(int pid, String pname, String password, String job) {
        this.pid = pid;
        this.pname = pname;
        this.password = password;
        this.job = job;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
