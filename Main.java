import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] dataLogin = {
            {"Admin", "Admin"},
            {"Dosen", "Dosen"},
            {"Abdillah", "2341720018",
            "Abdillah Noer Said", "2341720018", "Laki-laki", "Islam", "Malang, 23-03-2005", "B", "2 dari 2 Bersaudara", "081555488066", "abdillahnoersaid@gmail.com", "Teknologi Informasi", "Teknik Informatika"},
            {"Reika", "2341720173",
            "Reika Amalia Syaputri", "2341720173", "Perempuan", "Islam", "Ponorogo, 29-11-2005", "B", "1 dari 2 Bersaudara", "082140874629", "reikaamalia17@gmail.com",  "Teknologi Informasi", "Teknik Informatika"},
            {"Saka", "2341720108",
            "Saka Nabil", "2341720108", "Laki-laki", "Islam", "Selong, 12-06-2005", "A", "2 dari 2 Bersaudara", "087846242745", "sakanabil1221@gmail.com", "Teknologi Informasi", "Teknik Informatika"},
        };

        int percobaan = 3;
        boolean berhasilLogin = false;
        boolean loginAdmin = false;
        boolean loginDosen = false;
        boolean loginMahasiswa = false;
        int user_id = 9;

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

                        switch (fitur) {
                            case "1":
                                String biodata;
                                do {
                                    System.out.println("=======================");
                                    System.out.println("\tGENERAL");
                                    System.out.println("=======================");
                                    System.out.println("1. Biodata");
                                    System.out.println("0. Kembali");

                                    System.out.print("Pilih menu: ");
                                    biodata = sc.next();

                                    switch (biodata) {
                                        case "1":
                                            System.out.println("\t=======================");
                                            System.out.println("\t\tBIODATA");
                                            System.out.println("\t=======================");
                                            System.out.println("Nama                  : " + dataLogin[user_id][2]);
                                            System.out.println("NIM                   : " + dataLogin[user_id][3]);
                                            System.out.println("Jenis Kelamin         : " + dataLogin[user_id][4]);
                                            System.out.println("Agama                 : " + dataLogin[user_id][5]);
                                            System.out.println("Tempat, Tanggal Lahir : " + dataLogin[user_id][6]);
                                            System.out.println("Gol. Darah            : " + dataLogin[user_id][7]);
                                            System.out.println("Anak Ke               : " + dataLogin[user_id][8]);
                                            System.out.println("No Telepon (HP)       : " + dataLogin[user_id][9]);
                                            System.out.println("Email                 : " + dataLogin[user_id][10]);
                                            System.out.println("Jurusan               : " + dataLogin[user_id][11]);
                                            System.out.println("Program Studi         : " + dataLogin[user_id][12]);
                                            // Isi biodata
                                            break;
                                        case "0":
                                            System.out.println("\nAnda telah berhasil kembali\n");
                                            break;
                                        default:
                                            System.out.println("Maaf, Angka yang anda masukkan salah");
                                    }
                                } while (!biodata.equals("0"));
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
                                        System.out.println("\t\t\t\t\t=============================");
                                        System.out.println("\t\t\t\t\t\tJADWAL KULIAH");
                                        System.out.println("\t\t\t\t\t=============================");
                                        String back = "";
                                        do {
                                            String[][] jadwalMatkul = {
                                                {"1", "Senin", "07:00 - 09:30", "RTI231004", "Matdas", "Erfan Rohadi, S.T., M.Eng., Ph.D."},
                                                {"2", "Senin", "11:20 - 17:10", "RTI231007", "Praktikum Dspro", "Triana Fatmawati,S.T., M.T."},
                                                {"3", "Selasa", "08:40 - 12:10", "RTI231005", "Bahasa Inggris", "Farida Ulfa, S.Pd., M.Pd."},
                                                {"4", "Rabu", "09:40 - 13:40", "RTI231006", "Dasar Pemrograman", "Triana Fatmawati,S.T., M.T."},
                                                {"5", "Rabu", "13:40 - 17:10", "RTI231002", "KTI", "Ariadi Retno Tri Hayati Ririd, S.Kom., M.Kom."},
                                                {"6", "Kamis", "07:00 - 10:15", "RTI231003", "CTPS", "Dwi Puspitasari, S.Kom., M.Kom."},
                                                {"7", "Kamis", "10:30 - 12:10", "RTI231001", "Pancasila", "Widaningsih, S.H., M.H."},
                                                {"8", "Kamis", "13:40 - 17:10", "RTI231008", "K3", "Budi Harijanto, S.T., M.MKom."},
                                                {"9", "Jumat", "07:00 - 09:15", "RTI231004", "Mattdas", "Erfan Rohadi, S.T., M.Eng., Ph.D."}
                                            };
                                    
                                            System.out.println("-------------------------------------------------------------------------------------------------------------------");
                                            System.out.println("| No |  Hari  |      Jam      |   Kode MK   |     Mata Kuliah     |                     Dosen                     |");
                                            System.out.println("-------------------------------------------------------------------------------------------------------------------");
                                            for (String[] data : jadwalMatkul) {
                                                System.out.printf("| %-2s | %-6s | %-11s | %-11s | %-19s | %-45s |\n", data[0], data[1], data[2], data[3], data[4], data[5]);
                                                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                                            }
                                            break;
                                        } while (!back.equals("0"));
                                        break;
                                        
                                        case "2": // Code program fitur KRS
                                        System.out.println("\t\t===================");
                                        System.out.println("\t\t\tKRS");
                                        System.out.println("\t\t===================");
                                            
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

                                        case "3": // Code program fitur Nilai Mahasiswa
                                        System.out.println("==============================");
                                        System.out.println("\tNILAI MAHASISWA");
                                        System.out.println("==============================");
                                            
                                            String[] mataKuliah = {"MATDAS", "DASPRO", "BING ", "KTI  ", "CTPS ", "PANCASILA", "K3   "};
                                            double[] nilaiMataKuliah = new double[mataKuliah.length];
                                            double totalNilai = 0;
                                            
                                            for (int i = 0; i < mataKuliah.length; i++) {
                                                System.out.print("Masukkan nilai mata kuliah " + mataKuliah[i] + "\t: ");
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