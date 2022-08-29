package Day20_stringManipulation_part2;

import java.util.Scanner;

public class task_82 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username ");
        String username = sc.nextLine();

        System.out.println("Enter your password");
        String password = sc.nextLine();

        if (username.isEmpty() && password.isEmpty()){
            System.out.println("Username and Password Fields cannot be empty");
        }else if (username.isEmpty() && !password.isEmpty()){
            System.out.println("Username cannot be empty");
        }else if (!username.isEmpty() && password.isEmpty()){
            System.out.println("Password cannot be empty");
        }else if (username.contains("!") || password.contains("=")){
            System.out.println("Username or password is not valid. Please verify");
        }else{
            System.out.println("User Logged in successfully");
        }
    }
}
