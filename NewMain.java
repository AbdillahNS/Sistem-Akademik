import java.util.*;

public class NewMain {

    static int percobaan = 3;
    static boolean berhasilLogin = false;
    static boolean isAdmin = false;
    static boolean isDosen = false;
    static boolean isMahasiswa = false;
    static boolean isloop = false;
    static boolean exit = false;

    static int mainChoice;
    static int user_id = 9;

    static String isRole = "";
    static String sebagaiUser = "";
    static String pesan, penerima, pengirim;
    static String presensi;
    static int[][] nilaiSiswa;
    static double rataIPSiswa;

    static String[][] dataLogin = {
            { "Admin", "123", "Admin" },
            { "Dosen", "123", "Dosen" },
            { "Abdillah", "2341720018", "Mahasiswa", },
            { "Reika", "2341720173", "Mahasiswa", },
            { "Saka", "2341720108", "Mahasiswa" }
    };

    static String[][] bioMahasiswa = {
            { "Abdillah Noer Said", "2341720018", "Laki-laki", "Islam", "Malang-23-03-2005", "081555488066" },
            { "Reika Amalia Syaputri", "2341720018", "Perempuan", "Islam", "Ponorogo-29-11-2005", "082140874629" },
            { "Saka Nabil", "2341720108", "Laki-laki", "Islam", "Selong-12-06-2005", "087846242745" }
    };

    static void hitungIPSiswa(int[][] nilaiSiswa, double[] bobotMatkul) {
        double totalIPSiswa = 0.0;
        for (int i = 0; i < nilaiSiswa.length; i++) {
            double totalNilai = 0.0;
            double totalSKS = 0.0;

            for (int j = 0; j < nilaiSiswa[i].length; j++) {
                totalNilai += nilaiSiswa[i][j] * bobotMatkul[j];
                totalSKS += bobotMatkul[j];
            }

            double IP = totalNilai / totalSKS;
            System.out.println("IP Mahasiswa " + (i + 1) + ": " + IP);
            if (IP > 80 && IP <= 100) {
                System.out.println("Nilai A dengan kualifikasi sangat baik");
            } else if (IP > 73 && IP <= 80) {
                System.out.println("Nilai B+ dengan kualifikasi lebih dari baik");
            } else if (IP > 65 && IP <= 73) {
                System.out.println("Nilai B dengan kualifikasi baik");
            } else if (IP > 60 && IP <= 65) {
                System.out.println("Nilai C+ dengan kualifikasi lebih dari cukup");
            } else if (IP > 50 && IP <= 60) {
                System.out.println("Nilai C dengan kualifikasi cukup");
            } else if (IP > 39 && IP <= 50) {
                System.out.println("Nilai D dengan kualifikasi kurang");
            } else {
                System.out.println("Nilai E dengan kualifikasi gagal");
            }
            totalIPSiswa += IP;
        }

        rataIPSiswa = totalIPSiswa / nilaiSiswa.length;
        System.out.println("Rata-rata IP Semua Mahasiswa: " + rataIPSiswa);

    }

    static void tampilNilaiSiswa() {
        if (nilaiSiswa == null || nilaiSiswa.length == 0 || nilaiSiswa[0].length == 0) {
            System.out.println("Belum ada nilai siswa yang dimasukkan.");
            return;
        }

        System.out.println("\nNilai siswa:");
        for (int i = 0; i < nilaiSiswa.length; i++) {
            System.out.print("Siswa " + (i + 1) + ": ");
            for (int j = 0; j < nilaiSiswa[0].length; j++) {
                System.out.print(nilaiSiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void inputNilaiSiswa(int x, int y) {
        nilaiSiswa = new int[x][y];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nilaiSiswa.length; i++) {
            System.out.println("Masukkan nilai untuk Siswa " + (i + 1) + ":");
            for (int j = 0; j < nilaiSiswa[0].length; j++) {
                System.out.print("Masukkan nilai mata pelajaran ke-" + (j + 1) + ": ");
                nilaiSiswa[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nNilai siswa:");
        for (int i = 0; i < nilaiSiswa.length; i++) {
            System.out.print("Siswa " + (i + 1) + ": ");
            for (int j = 0; j < nilaiSiswa[0].length; j++) {
                System.out.print(nilaiSiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "╔═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗\n"
                        +
                        "║    ███████╗██╗ █████╗ ██╗  ██╗ █████╗ ██████╗     ██████╗  ██████╗ ██╗     ██╗███╗   ██╗███████╗███╗   ███╗ █████╗    ║\n"
                        +
                        "║    ██╔════╝██║██╔══██╗██║ ██╔╝██╔══██╗██╔══██╗    ██╔══██╗██╔═══██╗██║     ██║████╗  ██║██╔════╝████╗ ████║██╔══██╗   ║\n"
                        +
                        "║    ███████╗██║███████║█████╔╝ ███████║██║  ██║    ██████╔╝██║   ██║██║     ██║██╔██╗ ██║█████╗  ██╔████╔██║███████║   ║\n"
                        +
                        "║    ╚════██║██║██╔══██║██╔═██╗ ██╔══██║██║  ██║    ██╔═══╝ ██║   ██║██║     ██║██║╚██╗██║██╔══╝  ██║╚██╔╝██║██╔══██║   ║\n"
                        +
                        "║    ███████║██║██║  ██║██║  ██╗██║  ██║██████╔╝    ██║     ╚██████╔╝███████╗██║██║ ╚████║███████╗██║ ╚═╝ ██║██║  ██║   ║\n"
                        +
                        "║    ╚══════╝╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝     ╚═╝      ╚═════╝ ╚══════╝╚═╝╚═╝  ╚═══╝╚══════╝╚═╝     ╚═╝╚═╝  ╚═╝   ║\n"
                        +
                        "╚═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝\n");

        while (percobaan > 0) {
            System.out.print("Silahkan Login \n");
            System.out.print("Masukkan Username : ");
            String username = sc.nextLine();
            System.out.print("Masukkan Password : ");
            String password = sc.nextLine();

            for (int i = 0; i < dataLogin.length; i++) {
                if (dataLogin[i][0].equalsIgnoreCase(username) && dataLogin[i][1].equalsIgnoreCase(password)) {
                    berhasilLogin = true;
                    sebagaiUser = username;
                    isRole = dataLogin[i][2];
                    if ("admin".equalsIgnoreCase(username)) {
                        isAdmin = true;
                    } else if ("dosen".equalsIgnoreCase(username)) {
                        isDosen = true;
                    } else if (!"admin && dosen".equalsIgnoreCase(username)) {
                        isMahasiswa = true;
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

        do {
            System.out.println("╔══════════════════════════════════════╗\n" +
                    "║           SELAMAT DATANG DI          ║\n" +
                    "║            SIAKAD POLINEMA           ║\n" +
                    "╚══════════════════════════════════════╝");

            if (isAdmin) {
                // Admin menu
                System.out.println("Beranda " + isRole);
                System.out.println("1. Masukkan nilai");
                System.out.println("2. Masukkan Presensi");
                System.out.println("3. Kirim Pesan");
                System.out.println("4. Edit Biodata");
                System.out.println("9. Ganti akun");
                System.out.println("0. Keluar");

            } else if (isDosen) {
                // Dosen menu
                System.out.println("Beranda " + isRole);
                System.out.println("1. Menghitung nilai");
                System.out.println("9. Ganti akun");
                System.out.println("0. Keluar");

            } else if (isMahasiswa) {
                // Mahasiswa menu
                System.out.println("Beranda " + isRole);
                System.out.println("1. Biodata");
                System.out.println("2. Jadwal Kuliah");
                System.out.println("3. KRS");
                System.out.println("4. Melihat Nilai");
                System.out.println("5. Presensi");
                System.out.println("6. Message");
                System.out.println("7. UKT");
                System.out.println("9. Ganti akun");
                System.out.println("0. Keluar");
            }

            System.out.print("Pilih Menu: ");
            mainChoice = sc.nextInt();
            sc.nextLine();
            isloop = true;

            do {
                switch (mainChoice) {
                    case 1:
                        if (isRole.equals("Admin")) {
                            System.out.print("Masukkan jumlah mahasiswa : ");
                            int nilaiSiswa = sc.nextInt();
                            System.out.print("Masukkan jumlah matkul : ");
                            int jumlahMatkul = sc.nextInt();
                            inputNilaiSiswa(nilaiSiswa, jumlahMatkul);
                            break;
                        } else if (isRole.equals("Dosen")) {
                            tampilNilaiSiswa();
                            double[] bobotMatkul = new double[nilaiSiswa[0].length];
                            for (int i = 0; i < bobotMatkul.length; i++) {
                                System.out.print("Masukkan bobot matkul : ");
                                bobotMatkul[i] = sc.nextDouble();
                            }
                            hitungIPSiswa(nilaiSiswa, bobotMatkul);
                            break;
                        } else if (isRole.equals("Mahasiswa")) {
                            // Fitur Biodata
                            bioMahasiswa();
                            break;
                        }
                    case 2:
                        if (isRole.equals("Admin")) {
                            System.out.println("haloo");
                            break;
                        } else if (isRole.equals("Mahasiswa")) {
                            // Fitur Jadwal Kuliah
                            jadwalMahasiswa();
                            break;
                        }
                        break;

                    case 3:
                        if (isRole.equals("Admin")) {
                            kirimPesan(penerima);
                            break;
                        } else if (isRole.equals("Mahasiswa")) {
                            // Fitur KRS
                            krsMahasiswa();
                            break;
                        }
                        break;

                    case 4:
                        if (isRole.equals("Admin")) {
                            bioMahasiswa();
                            break;

                        } else if (isRole.equals("Mahasiswa")) {
                            System.out.println("╔══════════════════════════════════════╗\n" +
                                    "║             NILAI MAHASISWA          ║\n" +
                                    "╚══════════════════════════════════════╝");
                            System.out.println("Rata-rata IP Semua Mahasiswa: " + rataIPSiswa);
                            break;
                        }

                    case 5:
                        // Presensi
                        break;

                    case 6:
                        penerimaPesan(pengirim, pesan, penerima);
                        break;

                    case 7:
                        // UKT
                        break;

                    case 9:
                        System.out.println("Silahkan login kembali!");
                        boolean gantiAkun = false;
                        while (true) {
                            System.out.print("Masukkan Username: ");
                            String gantiUsername = sc.nextLine();
                            System.out.print("Masukkan Password: ");
                            String gantiPassword = sc.nextLine();
                            for (int i = 0; i < dataLogin.length; i++) {
                                if (dataLogin[i][0].equalsIgnoreCase(gantiUsername)
                                        && dataLogin[i][1].equalsIgnoreCase(gantiPassword)) {
                                    sebagaiUser = gantiUsername;
                                    isRole = dataLogin[i][2];
                                    gantiAkun = true;
                                    break;
                                }
                            }
                            if (gantiAkun) {
                                System.out.println("Berhasil ganti akun");
                                isAdmin = "Admin".equalsIgnoreCase(isRole);
                                isDosen = "Dosen".equalsIgnoreCase(isRole);
                                isMahasiswa = "Mahasiswa".equalsIgnoreCase(isRole);
                                break;
                            } else {
                                System.out.println("Akun tidak ditemukan!");
                            }
                        }
                        break;

                    case 0:
                        System.out.println("Anda berhasil Logout");
                        exit = true;
                        break;

                    default:
                        System.out.println("Pilihan tidak tersedia");
                        break;
                }
                break;
            } while (isloop);

        } while (!exit);
    }

    static void bioMahasiswa() {

        System.out.println(
                "╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println(
                "║                                                  BIODATA                                                        ║");
        System.out.println(
                "╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
        System.out.println("");

        System.out.println(
                "╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.printf("║ %-2s ║ %-21s ║ %-10s ║ %-11s ║ %-19s ║ %-31s ║\n", "No", "Nama", "NIM",
                "Jenis Kelamin", "Agama", "TTL", "No HP");
        System.out.println(
                "╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");

        for (int i = 0; i < bioMahasiswa.length; i++) {
            System.out.printf("║ %-2d ║ %-21s ║ %-6s ║ %-13s ║ %-19s ║ %-31s ║\n",
                    i + 1,
                    bioMahasiswa[i][0],
                    bioMahasiswa[i][1],
                    bioMahasiswa[i][2],
                    bioMahasiswa[i][3],
                    bioMahasiswa[i][4],
                    bioMahasiswa[i][5]);
        }

        System.out.println(
                "═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Masukkan nomor nahasiswa yang ingin diedit : ");
        int index = sc1.nextInt() - 1;
        editBioMahasiswa(index);
    }

    static void editBioMahasiswa(int index) {
        Scanner scanner = new Scanner(System.in);
        if (index < 0 || index >= bioMahasiswa.length) {
            System.out.println("Indeks tidak valid.");
            return;
        }

        System.out.println("Masukkan informasi baru untuk mahasiswa:");

        // Menerima input baru untuk setiap data mahasiswa
        System.out.print("Nama: ");
        bioMahasiswa[index][0] = scanner.nextLine();

        System.out.print("NIM: ");
        bioMahasiswa[index][1] = scanner.nextLine();

        System.out.print("Jenis Kelamin: ");
        bioMahasiswa[index][2] = scanner.nextLine();

        System.out.print("Agama: ");
        bioMahasiswa[index][3] = scanner.nextLine();

        System.out.print("TTL: ");
        bioMahasiswa[index][4] = scanner.nextLine();

        System.out.print("Nomor HP: ");
        bioMahasiswa[index][5] = scanner.nextLine();

        System.out.println(
                "╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println(
                "║                                                  BIODATA                                                        ║");
        System.out.println(
                "╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
        System.out.println("");

        System.out.println(
                "╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.printf("║ %-2s ║ %-21s ║ %-10s ║ %-11s ║ %-19s ║ %-31s ║ %-10s ║\n", "No", "Nama", "NIM",
                "Jenis Kelamin", "Agama", "TTL", "No HP");
        System.out.println(
                "╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");

        for (int i = 0; i < bioMahasiswa.length; i++) {
            System.out.printf("║ %-2d ║ %-21s ║ %-6s ║ %-13s ║ %-19s ║ %-31s ║\n",
                    i + 1,
                    bioMahasiswa[i][0],
                    bioMahasiswa[i][1],
                    bioMahasiswa[i][2],
                    bioMahasiswa[i][3],
                    bioMahasiswa[i][4],
                    bioMahasiswa[i][5]);
        }

        System.out.println(
                "═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════");

        System.out.println("Informasi mahasiswa telah diperbarui.");
    }

    static int cariMahasiswa(String[][] dataMahasiswa, String namaMahasiswa) {
        for (int i = 0; i < dataMahasiswa.length; i++) {
            if (dataMahasiswa[i][0].equalsIgnoreCase(namaMahasiswa)) {
                return i;
            }
        }
        return -1;
    }

    static void kirimPesan(String penerima) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan penerima Pesan:");
        penerima = sc.nextLine();

        int indeksMahasiswa = cariMahasiswa(dataLogin, penerima);

        if (indeksMahasiswa != -1 && penerima.equalsIgnoreCase("saka")) {
            System.out.println("Masukkan Pesan untuk " + penerima + ": ");
            pesan = sc.nextLine();

            System.out.println("Pesan Terkirim");

            penerimaPesan(sebagaiUser, pesan, penerima);
        }
    }

    static void penerimaPesan(String pengirim, String pesan, String penerima) {
        System.out.println("Pesan diterima oleh: " + penerima);
        System.out.println("Dari: Admin");
        System.out.println("Isi Pesan: " + pesan);
    }

    static void inputPresensi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        presensi = sc.nextLine();
    }

    static void outputPresensi() {
        System.out.println();
    }

    static void jadwalMahasiswa() {
        System.out.println("\t\t\t\t      ╔══════════════════════════════════════╗\n" +
                "\t\t\t\t      ║             JADWAL KULIAH            ║\n" +
                "\t\t\t\t      ╚══════════════════════════════════════╝");
        String[][] jadwalMatkul = {
                { "1", "Senin", "07:00 - 09:30", "RTI231004", "Matdas", "Erfan Rohadi, S.T., M.Eng., Ph.D." },
                { "2", "Senin", "11:20 - 17:10", "RTI231007", "Praktikum Dspro", "Triana Fatmawati,S.T., M.T." },
                { "3", "Selasa", "08:40 - 12:10", "RTI231005", "Bahasa Inggris", "Farida Ulfa, S.Pd., M.Pd." },
                { "4", "Rabu", "09:40 - 13:40", "RTI231006", "Dasar Pemrograman", "Triana Fatmawati,S.T., M.T." },
                { "5", "Rabu", "13:40 - 17:10", "RTI231002", "KTI", "Ariadi Retno Tri Hayati Ririd, S.Kom., M.Kom." },
                { "6", "Kamis", "07:00 - 10:15", "RTI231003", "CTPS", "Dwi Puspitasari, S.Kom., M.Kom." },
                { "7", "Kamis", "10:30 - 12:10", "RTI231001", "Pancasila", "Widaningsih, S.H., M.H." },
                { "8", "Kamis", "13:40 - 17:10", "RTI231008", "K3", "Budi Harijanto, S.T., M.MKom." },
                { "9", "Jumat", "07:00 - 09:15", "RTI231004", "Mattdas", "Erfan Rohadi, S.T., M.Eng., Ph.D." }
        };

        System.out.println(
                "╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println(
                "║ No ║  Hari  ║      Jam      ║   Kode MK   ║     Mata Kuliah     ║                     Dosen                     ║");
        System.out.println(
                "╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
        for (String[] data : jadwalMatkul) {
            System.out.printf("║ %-2s ║ %-6s ║ %-11s ║ %-11s ║ %-19s ║ %-45s ║\n", data[0], data[1], data[2], data[3],
                    data[4], data[5]);
            System.out.println(
                    "═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
        }
    }

    static void krsMahasiswa() {
        System.out.println("    ╔══════════════════════════════════════╗\n" +
                "    ║      Kartu Rencana Studi  (KRS)      ║\n" +
                "    ╚══════════════════════════════════════╝");
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

        System.out.println("╔═════════════════════════════════════════════╗");
        System.out.println("║ Matkul           ║  Semester  ║  SKS  ║ Jam ║");
        System.out.println("╚═════════════════════════════════════════════╝");
        for (String[] data : matkulData) {
            System.out.printf("║ %-16s ║ %-8s ║ %-5s ║ %-3s ║\n", data[0], "\t  " + data[1], "  " + data[2],
                    " " + data[3]);
            System.out.println("═══════════════════════════════════════════════");
        }
    }
}