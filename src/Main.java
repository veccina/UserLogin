import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Username : ");
        userName = input.nextLine();

        System.out.print("Password : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123") ){
            System.out.println("Successfully Logged in");
        } else {
            System.out.println("Login information is incorrect. Please enter your login information correctly");
        }
    }
}