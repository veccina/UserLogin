import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password, select, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Username : ");
        userName = input.nextLine();

        System.out.print("Password : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Successfully Logged in");
        } else if ((!(userName.equals("patika")) && !(password.equals("java123")))) {
            System.out.println("Login information is incorrect. Your Username and Password is incorrect.Please enter your login information correctly");
        } else if ((!(userName.equals("patika")) && (password.equals("java123")))) {
            System.out.println("Login information is incorrect. Your Username is incorrect.Please enter your login information correctly");
        } else if (((userName.equals("patika")) && !(password.equals("java123")))) {
            System.out.println("Login information is incorrect. Your Password is incorrect.Please enter your login information correctly");
            System.out.println("If you do not remember your password follow the instructions \n If you want to reset your password : Yes \n If you do not want to reset your password : No");
            System.out.print("Your choice : ");
            select = input.nextLine();
            if ((select.equals("Yes")) || (select.equals("yes"))) {
                System.out.println("Please enter your new password. (Password should be different than the old one)");
                System.out.print("Yeni şifreniz : ");
                newPassword = input.nextLine();
                if (!newPassword.equals("java123")) {
                    System.out.println("New password created successfully");
                } else {
                    System.out.println("Your password can not be same as the old one ");
                }
            } else if (select.equals("No") || select.equals("no")) {
                System.out.println("You are leaving the login page...");
            }
        } else System.out.println("Please enter the options of Yes or No ");
    }
}