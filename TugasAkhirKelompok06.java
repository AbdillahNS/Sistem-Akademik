import java.util.Scanner;

public class TugasAkhirKelompok06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilaiMatdas, nilaiDaspro, nilaiBing, nilaiKti, nilaiCtps, nilaiPancasila, nilaiK3, rataRata, totalNilai;
        System.out.print("Masukkan nilai mata kuliah MATDAS\t: ");
        nilaiMatdas = input.nextDouble();
        System.out.print("Masukkan nilai mata kuliah DASPRO\t: ");
        nilaiDaspro = input.nextDouble();
        System.out.print("Masukkan nilai mata kuliah BING\t\t: ");
        nilaiBing = input.nextDouble();
        System.out.print("Masukkan nilai mata kuliah KTI_TI\t: ");
        nilaiKti = input.nextDouble();
        System.out.print("Masukkan nilai mata kuliah CTPS_TI\t: ");
        nilaiCtps = input.nextDouble();
        System.out.print("Masukkan nilai mata kuliah PANCASILA\t: ");
        nilaiPancasila = input.nextDouble();
        System.out.print("Masukkan nilai mata kuliah K3_TI\t: ");
        nilaiK3 = input.nextDouble();
        totalNilai = nilaiMatdas+nilaiDaspro+nilaiBing+nilaiKti+nilaiCtps+nilaiPancasila+nilaiK3;
        rataRata = totalNilai / 7;
        System.out.print("Nilai Rata-Rata Mahasiswa adalah\t: " + rataRata);
    }
}