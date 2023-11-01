import java.util.*;

public class HasilAkhirSistemAkademik6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Tempat Username dan Password
        String usernameAbdillah = "2341720018";
        String passwordAbdillah = "2341720018";
        String usernameReika = "2341720173";
        String passwordReika = "2341720173";
        String usernameSaka = "2341720108";
        String passwordSaka = "2341720108";
        String usernamecoba = "coba";
        String passwordcoba = "1";

        int percobaan = 3; // Jumlah percobaan maksimal
        boolean berhasilLogin = false;

        do {
            System.out.print("Masukkan username: ");
            String usernameInput = scanner.nextLine();

            System.out.print("Masukkan password: ");
            String passwordInput = scanner.nextLine();

            if (usernameInput.equals(usernameAbdillah) && passwordInput.equals(passwordAbdillah)) {
                System.out.println("Selamat datang Abdillah Noer Said");
                berhasilLogin = true;
                break;
            }else if (usernameInput.equals(usernameReika) && passwordInput.equals(passwordReika)) {
                System.out.println("Selamat datang Reika Amalia Syahputri");
                berhasilLogin = true;
                break;
            }else if (usernameInput.equals(usernameSaka) && passwordInput.equals(passwordSaka)) {
                System.out.println("Selamat datang Saka Nabil");
                berhasilLogin = true;
                break;
            }else if (usernameInput.equals(usernamecoba) && passwordInput.equals(passwordcoba)) {
                System.out.println("Untuk percobaan");
                berhasilLogin = true;
                break;
            } else {
                percobaan--;
                System.out.println("Login gagal! Sisa percobaan: " + percobaan);
            }

            if (percobaan == 0) {
                System.out.println("Anda telah mencapai batas percobaan, Sistem ditutup.");
                break;
            }
        } while (true);

        if (berhasilLogin) {
            // Tempatkan kode program setelah login berhasil di sini
            String fitur;
        do {    
            System.out.println("Silahkan pilih menu yang ingin anda access :");
            System.out.println("1. General");
            System.out.println("2. Akademik");
            System.out.println("3. Message");
            System.out.println("4. UKT");
            System.out.println("0. ====== Logout ======");
            
            System.out.println("Pilih menu sesuai angka :");
            fitur = scanner.next();

            switch (fitur) {
                case "1":
                    String biodata;                    
                do {    
                    System.out.println("-------------------");
                    System.out.println("|     GANERAL     |");
                    System.out.println("-------------------");
                    System.out.println("1. Biodata");
                    System.out.println("0. Kembali");

                    System.out.println("Pilih menu :");
                    biodata = scanner.next();

                    switch (biodata) {
                        case "1":
                        System.out.println("Biodata : ");
                        // Isi e 
                        break;
                        case "0":
                        System.out.println("Anda telah berhasil kembali");
                        break;
                        default:
                        System.out.println("Maaf, Angka yang anda masukkan salah");
                    }
                } while (!biodata.equals("0"));
                break;
                
                case "2": // Code fitur Akademik
                String akademik;                   
                do {
                    System.out.println("-------------------");
                    System.out.println("|     AKADEMIK    |");
                    System.out.println("-------------------");
                    System.out.println("1. Jadwal Kuliah");
                    System.out.println("2. KRS");
                    System.out.println("3. Nilai Mahasiswa");
                    System.out.println("4. Presensi");
                    System.out.println("0. Kembali");

                    System.out.println("Pilih menu :");
                    akademik = scanner.next();

                    switch (akademik) {
                        
                        case "1":
                        System.out.println("===== Jadwal Kuliah =====");
                        String hari;
                        do {
                        System.out.println("Masukkan hari yang ingin anda lihat : (0.Untuk kembali ke menu sebelumnya) ");
                        hari = scanner.next();
                            
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
                            } else if (hari.equalsIgnoreCase("Sabtu") || hari.equalsIgnoreCase("Minggu")) {
                                System.out.println("Untuk hari Sabtu dan Minggu Libur");
                            } else {
                                System.out.println("Hari yang Anda masukkan tidak valid.");
                            }
                        } while (!hari.equals("0"));
                        break;
                        
                        case "2":
                        System.out.println("\t\t-------------------");
                        System.out.println("\t\t|       KRS       |");
                        System.out.println("\t\t-------------------");
                            
                        String[][] matkulData = {
                            {"Pancasila", "1", "2", "2"},
                            {"KTI", "1", "2", "4"},
                            {"CTPS", "1", "2", "4"},
                            {"Matdas", "1", "3", "6"},
                            {"B ing", "1", "2", "4"},
                            {"Daspro", "1", "2", "4"},
                            {"Praktikum Daspro", "1", "3", "6"},
                            {"K3", "1", "2", "4"}
                        };
                
                        System.out.println("-----------------------------------------------");
                        System.out.println("| Matkul          |   Semester  |  SKS  | Jam |");
                        System.out.println("-----------------------------------------------");
                        for (String[] data : matkulData) {
                            System.out.printf("%-18s%-11s%-7s%-4s\n", "| " + data[0], "|      " + data[1], "   |   " + data[2], "   |  " + data[3] + "  |");
                            System.out.println("-----------------------------------------------");
                        }
                        break;
                        
                        case "3":
                        System.out.println("===== Nilai Mahasiswa =====");
                            String[] mataKuliah = {"MATDAS", "DASPRO", "BING ", "KTI  ", "CTPS ", "PANCASILA", "K3   "};
                            double[] nilaiMataKuliah = new double[mataKuliah.length];
                            double totalNilai = 0;
                            
                            for (int i = 0; i < mataKuliah.length; i++) {
                                System.out.print("Masukkan nilai mata kuliah " + mataKuliah[i] + "\t: ");
                                nilaiMataKuliah[i] = scanner.nextDouble();
                                totalNilai += nilaiMataKuliah[i];
                            }
                            
                            double rataRata = totalNilai / mataKuliah.length;
                            double rataRataBulat = Math.round(rataRata);
                            System.out.println("Nilai Rata-Rata Mahasiswa adalah\t: " + rataRataBulat);

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
                        break;
                        
                        case "4":
                        System.out.println("Presesnsi : ");
                        break;
                        
                        case "0":
                        System.out.println("Anda telah berhasil Kembali");
                        break;
                        
                        default:
                        System.out.println("Maaf, Angka yang anda masukkan salah");
                    }
                } while (!akademik.equals("0"));
                break;
                
                case "3":
                System.out.println("Massage : ");
                break;
                
                case "4":
                System.out.println("UKT :");
                break;
                
                case "0":
                System.out.println("Anda telah berhasil logout");
                break;
                
                default:
                System.out.println("Maaf, Angka yang anda masukkan salah");
            }
        } while (!fitur.equals("0")); //Ulangi loop selama pengguna tidak memilih keluar (0), Jika memilih 0 maka akan keluar

        scanner.close(); // Tempatnya diakhir codingan untuk menutup scanner
        }
    }
}