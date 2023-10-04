import java.util.Scanner;

    public class login {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nim;
        System.out.print("Masukkan username: ");
        nim = sc.next();

        switch (nim) {
            case "2341720018":
                System.out.println("Selamat datang Abdillah noer said");
                break;
            case "234172017":
                System.out.println("Selamat datang Reika amalia syahputri");
                break;
            case "234172010":
                System.out.println("Selamat datang Saka nabil");
                break;

            default:
            System.out.println("Maaf, Username tidak terdaftar");
        }
    }
}