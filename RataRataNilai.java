import java.util.Scanner;

public class RataRataNilai {
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
        System.out.println("Nilai Rata-Rata Mahasiswa adalah\t: " + rataRata);

        if (rataRata > 80 && rataRata <= 100) {
            System.out.println("Nilai A dengan kualisifikasi sangat baik" );
            }else if (rataRata > 73 && rataRata <= 80) {
                System.out.println("Nilai B+ dengan kualisifikasi lebih dari baik" ); 
            }else if (rataRata > 65 && rataRata <= 73) {
                System.out.println("Nilai B dengan kualisifikasi baik" );
            }else if (rataRata > 60 && rataRata <= 65) {
                System.out.println("Nilai C+ dengan kualisifikasi lebih dari cukup" );
            }else if (rataRata > 50 && rataRata <= 60) {
                System.out.println("Nilai C dengan kualisifikasi cukup" );
            }else if (rataRata > 39 && rataRata <= 50) {
                System.out.println("Nilai D dengan kualisifikasi kurang" );
            }else{
                System.out.println("Nilai E dengan kualisifikasi gagal" );
                
            }
        }
        
    }   