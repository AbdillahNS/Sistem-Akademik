import java.util.Scanner;

    public class login {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String usernameAbdillah = "2341720018";
        String passwordAbdillah = "2341720018";
        boolean berhasilLogin = false;

        do {
            System.out.print("Masukkan username: ");
            String usernameInput = sc.nextLine();

            System.out.print("Masukkan password: ");
            String passwordInput = sc.nextLine();

            if (usernameInput.equals(usernameAbdillah) && passwordInput.equals(passwordAbdillah)) {
                System.out.println("Selamat datang Abdillah Noer Said");
                break;
            } else {
                System.out.println("Username dan password anda salah");
            }
        } while (true);
    }
}