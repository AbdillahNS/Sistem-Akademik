import java.util.Scanner;

    public class login {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int angka;
        System.out.println("Masukkan username: ");
        angka = sc.nextInt();

        switch (angka) {
            case 234172001:
                System.out.println("Selamat datang Abdillah noer said");
                break;
            case 234172017:
                System.out.println("Selamat datang Reika amalia syahputri");
                break;
            case 234172010:
                System.out.println("Selamat datang Saka nabil");
                break;

            default:
            System.out.println("Maaf, Username tidak terdaftar");
        }
    }
}