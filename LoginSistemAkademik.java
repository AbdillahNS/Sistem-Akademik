import java.util.Scanner;

public class LoginSistemAkademik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Data pengguna (nama pengguna dan kata sandi)
        String[] username = {"Abdillah", "Reika", "Saka"};
        String[] password = {"2341720018", "2341720173", "2341720108"};

        System.out.print("Masukkan nama pengguna: ");
        String inputUsername = scanner.next();

        System.out.print("Masukkan kata sandi: ");
        String inputPassword = scanner.next();

        // Mencari pengguna dalam array
        int userIndex = 1;
        for (int i = 0; i < username.length; i++) {
            if (username[i].equals(inputUsername)) {
                userIndex = i;
                break;
            }
        }

        // Memeriksa kata sandi
        if (userIndex != 1 && password[userIndex].equalsIgnoreCase(inputPassword)) {
            System.out.println("Login berhasil. Selamat datang, " + inputUsername + "!");
        } else {
            System.out.println("Login gagal. Nama pengguna atau kata sandi salah.");
        }
    }
}
