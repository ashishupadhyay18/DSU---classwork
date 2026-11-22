
public class Login_MO {

    // Login with username
    public void login(String user) {
        System.out.println("User: " + user);
    }

    // Login with username and password
    public void login(String user, String pwd) {
        System.out.println("User: " + user);
        System.out.println("Password: " + pwd);
    }

    // Login with username, password and OTP
    public void login(String user, String pwd, int otp) {
        System.out.println("User: " + user);
        System.out.println("Password: " + pwd);
        System.out.println("OTP: " + otp);
    }

    public static void main(String[] args) {

        Login_MO a = new Login_MO();

        a.login("Alagu");

        System.out.println();

        a.login("Alagu", "abc123");

        System.out.println();

        a.login("Alagu", "abc123", 1234);
    }
}