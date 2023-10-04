import java.util.Scanner;

    public class JadwalKuliah6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
                String hari;

                System.out.println("Masukkan hari yang ingin anda lihat : (0.Untuk kembali ke menu sebelumnya) ");
                hari = scanner.nextLine();
                
                if (hari.equalsIgnoreCase("Senin")) {
                    System.out.println("Jadwal Senin:");
                    System.out.println("07.00 - 09.30 : Matematika Dasar");
                    System.out.println("11.20 - 17.10 : Praktikum Daspro");
                } else if (hari.equalsIgnoreCase("Selasa")) {
                    System.out.println("Jadwal Selasa:");
                    System.out.println("08.40 - 12.10 : Bahasa Inggris");
                } else if (hari.equalsIgnoreCase("Rabu")) {
                    System.out.println("Jadwal Rabu:");
                    System.out.println("09.40 - 13.40 : Teeri Daspro");
                    System.out.println("13.40 - 17.10 : KTI");
                } else if (hari.equalsIgnoreCase("Kamis")) {
                    System.out.println("Jadwal Kamis:");
                    System.out.println("07.00 - 10.30 : CTPS");
                    System.out.println("10.30 - 12.10 : Pancasila");
                    System.out.println("13.40 - 17.10 : K3");
                } else if (hari.equalsIgnoreCase("Jumat")) {
                    System.out.println("Jadwal Jumat:");
                    System.out.println("07.00 - 09.30 : Matematika Dasar");
                } else {
                    System.out.println("Hari yang Anda masukkan tidak valid.");
                }
        scanner.close();
    }
}