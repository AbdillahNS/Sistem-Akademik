import java.util.Scanner;
public class biodata {
    public static void main(String[] args) {
        // Tentukan jumlah mahasiswa
        int jumlahMahasiswa = 3;

        // Deklarasi array 2 dimensi untuk menyimpan biodata mahasiswa
        String[][] biodataMahasiswa = new String[jumlahMahasiswa][4];

        // Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Input biodata mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan biodata mahasiswa ke-" + (i + 1));

            System.out.print("Nama:  ");
            biodataMahasiswa[i][0] = scanner.nextLine();

            System.out.print("NIM: ");
            biodataMahasiswa[i][1] = scanner.nextLine();

            System.out.print("Jurusan: ");
            biodataMahasiswa[i][2] = scanner.nextLine();

            System.out.print("Alamat: ");
            biodataMahasiswa[i][3] = scanner.nextLine();
        }

        // Menampilkan biodata mahasiswa
        System.out.println("\nBiodata Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + biodataMahasiswa[i][0]);
            System.out.println("NIM: " + biodataMahasiswa[i][1]);
            System.out.println("Jurusan: " + biodataMahasiswa[i][2]);
            System.out.println("Alamat: " + biodataMahasiswa[i][3]);
            System.out.println();
        }

        // Tutup scanner
        scanner.close();
    }
}

