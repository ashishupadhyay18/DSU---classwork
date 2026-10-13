import java.util.Scanner;

class Login {

    // Login using username and password
    void authenticate(String username, String password) {
        System.out.println("Login using username and password");
        System.out.println("Username: " + username);
        System.out.println("Login successful!");
    }

    // Overloaded method using username, password, and OTP
    void authenticate(String username, String password, int otp) {
        System.out.println("Login using username, password and OTP");
        System.out.println("Username: " + username);

        if (otp == 1234) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid OTP!");
        }
    }
}

public class LoginOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login login = new Login();

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        login.authenticate(username, password);

        System.out.print("Enter OTP: ");
        int otp = sc.nextInt();

        login.authenticate(username, password, otp);

        sc.close();
    }
}