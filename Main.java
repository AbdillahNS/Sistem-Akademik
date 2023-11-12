import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] dataLogin = {
                { "Admin", "Admin" },
                { "Dosen", "Dosen" },
                { "Abdillah", "2341720018", "Malang", "Islam" },
                { "Reika", "2341720173", "Malang", "Islam" },
                { "Saka", "2341720108", "Lombok", "Islam" },
        };

        int percobaan = 3;
        boolean berhasilLogin = false;
        boolean loginAdmin = false;
        boolean loginDosen = false;
        boolean loginMahasiswa = false;
        int user_id = -1;

        System.out.println("===============================");
        System.out.println("\tSIAKAD POLINEMA");
        System.out.println("===============================");

        while (percobaan > 0) {
            System.out.print("Masukkan Username : ");
            String username = sc.nextLine();
            System.out.print("Masukkan Password : ");
            String password = sc.nextLine();

            for (int i = 0; i < dataLogin.length; i++) {
                if (dataLogin[i][0].equalsIgnoreCase(username) && dataLogin[i][1].equalsIgnoreCase(password)) {
                    berhasilLogin = true;
                    if (dataLogin[i][0].equals("Admin")) {
                        loginAdmin = true;
                        System.out.println("Selamat datang Admin");
                    } else if (dataLogin[i][0].equals("Dosen")) {
                        loginDosen = true;
                        System.out.println("Selamat datang Dosen");
                    } else {
                        loginMahasiswa = true;
                        System.out.println("Selamat datang " + dataLogin[i][0]);
                    }
                    user_id = i;
                    break;
                }
            }

            if (berhasilLogin) {
                break;
            } else {
                percobaan--;
                System.out.println("Login gagal! Sisa percobaan: " + percobaan);
            }
        }

        if (berhasilLogin) {
            while (true) {
                if (loginAdmin) {
                    // isi halaman Admin
                    System.out.println("\n============");
                    System.out.println("Halaman Admin");
                    System.out.println("============\n");
                    break;
                } else if (loginDosen) {
                    // isi halaman Dosen
                    System.out.println("\n==============");
                    System.out.println("Halaman Dosen");
                    System.out.println("==============\n");
                    break;
                } else if (loginMahasiswa) {
                    String fitur;
                    do {
                        System.out.println("=================================");
                        System.out.println("\t HalamanMahasiswa");
                        System.out.println("\tSilakan pilih menu");
                        System.out.println("=================================");
                        System.out.println("1. General");
                        System.out.println("2. Akademik");
                        System.out.println("3. Message");
                        System.out.println("4. UKT");
                        System.out.println("0. Logout");

                        System.out.print("Pilih menu sesuai angka : ");
                        fitur = sc.next();
                        sc.nextLine();

                        switch (fitur) {
                            case "1":
                                String biodata;
                                System.out.println("=======================");
                                System.out.println("\tGENERAL");
                                System.out.println("=======================");
                                System.out.println("1. Biodata");
                                System.out.println("0. Kembali");

                                System.out.print("Pilih menu: ");
                                biodata = sc.next();

                                switch (biodata) {
                                    case "1":
                                        System.out.println("Biodata : ");
                                        System.out.printf("Nama : %s\n", dataLogin[user_id][0]);
                                        System.out.printf("NIM : %s\n", dataLogin[user_id][1]);
                                        System.out.printf("Alamat : %s\n", dataLogin[user_id][2]);
                                        System.out.printf("Agama : %s\n", dataLogin[user_id][3]);
                                        break;
                                    case "0":
                                        System.out.println("\nAnda telah berhasil kembali\n");
                                        break;
                                    default:
                                        System.out.println("Maaf, Angka yang anda masukkan salah");
                                }
                                break;

                            case "2": // Code program fitur Akademik
                                String akademik;
                                do {
                                    System.out.println("=========================");
                                    System.out.println("\tAKADEMIK");
                                    System.out.println("=========================");
                                    System.out.println("1. Jadwal Kuliah");
                                    System.out.println("2. KRS");
                                    System.out.println("3. Nilai Mahasiswa");
                                    System.out.println("4. Presensi");
                                    System.out.println("0. Kembali");

                                    System.out.print("Pilih menu: ");
                                    akademik = sc.next();

                                    switch (akademik) {
                                        case "1": // Code program fitur jadwal kuliah
                                            System.out.println("==============================");
                                            System.out.println("\tJADWAL KULIAH");
                                            System.out.println("==============================");
                                            String hari;
                                            do {
                                                System.out.println(
                                                        "Masukkan hari yang ingin anda lihat : (0.Untuk kembali ke menu sebelumnya) ");
                                                hari = sc.next();

                                                if (hari.equalsIgnoreCase("Senin")) {
                                                    System.out.println("\nJadwal Senin:");
                                                    System.out.println("07.00 - 09.30 : Matematika Dasar");
                                                    System.out.println("11.20 - 17.10 : Praktikum Daspro");
                                                } else if (hari.equalsIgnoreCase("Selasa")) {
                                                    System.out.println("\nJadwal Selasa:");
                                                    System.out.println("08.40 - 12.10 : Bahasa Inggris");
                                                } else if (hari.equalsIgnoreCase("Rabu")) {
                                                    System.out.println("\nJadwal Rabu:");
                                                    System.out.println("09.40 - 13.40 : Teeri Daspro");
                                                    System.out.println("13.40 - 17.10 : KTI");
                                                } else if (hari.equalsIgnoreCase("Kamis")) {
                                                    System.out.println("\nJadwal Kamis:");
                                                    System.out.println("07.00 - 10.30 : CTPS");
                                                    System.out.println("10.30 - 12.10 : Pancasila");
                                                    System.out.println("13.40 - 17.10 : K3");
                                                } else if (hari.equalsIgnoreCase("Jumat")) {
                                                    System.out.println("\nJadwal Jumat:");
                                                    System.out.println("07.00 - 09.30 : Matematika Dasar");
                                                } else if (hari.equalsIgnoreCase("Sabtu")
                                                        || hari.equalsIgnoreCase("Minggu")) {
                                                    System.out.println("\nUntuk hari Sabtu dan Minggu Libur");
                                                } else if (hari.equalsIgnoreCase("0")) {
                                                    System.out.println("\nAnda telah berhasil kembali\n");
                                                    break;
                                                } else {
                                                    System.out.println("Hari yang Anda masukkan tidak valid.");
                                                }
                                            } while (!hari.equals("0"));
                                            break;

                                        case "2": // Code program fitur KRS
                                            System.out.println("\t\t===================");
                                            System.out.println("\t\t\tKRS");
                                            System.out.println("\t\t===================");

                                            String[][] matkulData = {
                                                    { "Pancasila", "1", "2", "2" },
                                                    { "KTI", "1", "2", "4" },
                                                    { "CTPS", "1", "2", "4" },
                                                    { "Matdas", "1", "3", "6" },
                                                    { "B ing", "1", "2", "4" },
                                                    { "Daspro", "1", "2", "4" },
                                                    { "Praktikum Daspro", "1", "3", "6" },
                                                    { "K3", "1", "2", "4" }
                                            };

                                            System.out.println("-----------------------------------------------");
                                            System.out.println("| Matkul          |   Semester  |  SKS  | Jam |");
                                            System.out.println("-----------------------------------------------");
                                            for (String[] data : matkulData) {
                                                System.out.printf("%-18s%-11s%-7s%-4s\n", "| " + data[0],
                                                        "|      " + data[1], "   |   " + data[2],
                                                        "   |  " + data[3] + "  |");
                                                System.out.println("-----------------------------------------------");
                                            }
                                            break;

                                        case "3": // Code program fitur Nilai Mahasiswa
                                            System.out.println("==============================");
                                            System.out.println("\tNILAI MAHASISWA");
                                            System.out.println("==============================");

                                            String[] mataKuliah = { "MATDAS", "DASPRO", "BING ", "KTI  ", "CTPS ",
                                                    "PANCASILA", "K3   " };
                                            double[] nilaiMataKuliah = new double[mataKuliah.length];
                                            double totalNilai = 0;

                                            for (int i = 0; i < mataKuliah.length; i++) {
                                                System.out
                                                        .print("Masukkan nilai mata kuliah " + mataKuliah[i] + "\t: ");
                                                nilaiMataKuliah[i] = sc.nextDouble();
                                                totalNilai += nilaiMataKuliah[i];
                                            }

                                            double rataRata = totalNilai / mataKuliah.length;
                                            double rataRataBulat = Math.round(rataRata);
                                            System.out.println("Nilai Rata-Rata Mahasiswa adalah\t: " + rataRataBulat);

                                            // Indeks Rata-rata nilai
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
                                            System.out.println("Presensi : ");
                                            // Implementasi Presensi
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
                                System.out.println("Message : ");
                                // Implementasi fitur Message
                                break;

                            case "4":
                                System.out.println("UKT :");
                                // Implementasi fitur UKT
                                break;

                            case "0":
                                System.out.println("Anda telah berhasil logout");
                                return;

                            default:
                                System.out.println("Maaf, Angka yang anda masukkan salah");
                        }
                    } while (!fitur.equals("0")); // Ulangi loop selama pengguna tidak memilih keluar (0)
                }
            }
        } else {
            System.out.println("Anda telah mencapai batas percobaan, Sistem ditutup.");
        }
    }
}