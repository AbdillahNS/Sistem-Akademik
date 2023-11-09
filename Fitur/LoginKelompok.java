import java.util.Scanner;

public class LoginKelompok {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        String usernameAbdillah = "2341720018";
        String passwordAbdillah = "2341720018";
        String usernameReika = "2341720173";
        String passwordReika = "2341720173";
        String usernameSaka = "2341720108";
        String passwordSaka = "2341720108";

        System.out.print("Masukkan username: ");
        String username = input26.nextLine();
        

        if (username.equals(usernameAbdillah)) {
            System.out.print("Masukkan password: ");
        String password = input26.nextLine();
            if (password.equals(passwordAbdillah)) {
                System.out.println("Login berhasil");
            } else {
                System.out.println("Password salah");
            }
        } else if (username.equals(usernameReika)) {
            System.out.print("Masukkan password: ");
        String password = input26.nextLine();
            if (password.equals(passwordReika)) {
                System.out.println("Login berhasil");
            } else {
                System.out.println("Password salah");
            }
        } else if (username.equals(usernameSaka)) {
            System.out.print("Masukkan password: ");
        String password = input26.nextLine();
            if (password.equals(passwordSaka)) {
                System.out.println("Login berhasil");
            } else {
                System.out.println("Password salah");
            }
        } else {
            System.out.println("Username salah");
        }
    }
}