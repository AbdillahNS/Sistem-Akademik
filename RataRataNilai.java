import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] mataKuliah = {"MATDAS", "DASPRO", "BING", "KTI", "CTPS", "PANCASILA", "K3"};
        double[] nilaiMataKuliah = new double[mataKuliah.length];
        double totalNilai = 0;
        
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai mata kuliah " + mataKuliah[i] + "\t: ");
            nilaiMataKuliah[i] = input.nextDouble();
            totalNilai += nilaiMataKuliah[i];
        }
        
        double rataRata = totalNilai / mataKuliah.length;
        System.out.println("Nilai Rata-Rata Mahasiswa adalah\t: " + rataRata);

        if (rataRata > 80 && rataRata <= 100) {
            System.out.println("Nilai A dengan kualifikasi sangat baik");
        } else if (rataRata > 73 && rataRata <= 80) {
            System.out.println("Nilai B+ dengan kualifikasi lebih dari baik");
        } else if (rataRata > 65 && rataRata <= 73) {
            System.out.println("Nilai B dengan kualifikasi baik");
        } else if (rataRata > 60 && rataRata <= 65) {
            System.out.println("Nilai C+ dengan kualifikasi lebih dari cukup");
        } else if (rataRata > 50 && rataRata <= 60) {
            System.out.println("Nilai C dengan kualifikasi cukup");
        } else if (rataRata > 39 && rataRata <= 50) {
            System.out.println("Nilai D dengan kualifikasi kurang");
        } else {
            System.out.println("Nilai E dengan kualifikasi gagal");
        }
    }
}