import java.util.*;

public class NewMain {

    static Scanner sc = new Scanner(System.in);

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
    static String[][] dataUKT = new String[1][6];
    static int[][] nilaiSiswa;
    static double rataIPSiswa;
    static double[] nilaiIPsiswa;
    static int jumlahMatkul = 0;
    static String nim;

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

    static String[][] jadwalMatkul = {
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

    public static void tambahBaris() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan data untuk baris baru:");

        String kolom[] = { "nama", "nim", "jenis kelamin", "agama", "tempat, tanggal lahir", "nomor telepon" };

        String[] newEntry = new String[bioMahasiswa[0].length];
        for (int i = 0; i < newEntry.length; i++) {
            System.out.print("Masukkan nilai untuk kolom " + kolom[i] + ": ");
            newEntry[i] = scanner.nextLine();
        }

        if (newEntry.length == bioMahasiswa[0].length) {
            bioMahasiswa = addElement(bioMahasiswa, newEntry);
            System.out.println("Baris baru berhasil ditambahkan.");
            // Menampilkan array setelah penambahan
            tampilbiodata();
        } else {
            System.out.println("Panjang data yang dimasukkan tidak sesuai dengan array saat ini.");
        }
    }

    public static String[][] addElement(String[][] array, String[] newEntry) {
        String[][] newArray = new String[array.length + 1][array[0].length];
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(array[i], 0, newArray[i], 0, array[i].length);
        }
        System.arraycopy(newEntry, 0, newArray[array.length], 0, newEntry.length);
        return newArray;
    }

    public static void hapusElemen(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < bioMahasiswa.length) {
            bioMahasiswa = removeElement(bioMahasiswa, rowIndex);
            System.out.println("Elemen pada baris " + (rowIndex + 1) + " telah dihapus.");
            // Menampilkan array setelah penghapusan
            tampilbiodata();
        } else {
            System.out.println("Indeks baris tidak valid");
        }
    }

    public static String[][] removeElement(String[][] array, int index) {
        if (index < 0 || index >= array.length) {
            return array;
        }

        String[][] newArray = new String[array.length - 1][array[0].length];
        int newIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                System.arraycopy(array[i], 0, newArray[newIndex], 0, array[0].length);
                newIndex++;
            }
        }

        return newArray;
    }

    public static void editJadwal(int rowIndex, int colIndex, String newValue) {
        if (rowIndex >= 0 && rowIndex < jadwalMatkul.length && colIndex >= 0 && colIndex < jadwalMatkul[0].length) {
            jadwalMatkul[rowIndex][colIndex] = newValue;
            System.out.println(
                    "Nilai pada baris " + (rowIndex + 1) + " kolom " + (colIndex + 1) + " telah diubah menjadi: "
                            + newValue);
            jadwalMahasiswa();
        } else {
            System.out.println("Indeks baris atau kolom tidak valid");
        }
    }

    static String[][] matkulData = {
            { "Pancasila", "1", "2", "2" },
            { "KTI", "1", "2", "4" },
            { "CTPS", "1", "2", "4" },
            { "Matdas", "1", "3", "6" },
            { "B ing", "1", "2", "4" },
            { "Daspro", "1", "2", "4" },
            { "Praktikum Daspro", "1", "3", "6" },
            { "K3", "1", "2", "4" }
    };

    static String[][] dataPresensi = {
            { "Abdillah Noer Said", "TI-1B", "" },
            { "Reika Amalia Syaputri", "TI-1B", "" },
            { "Saka Nabil", "TI-1B", "" }
    };

    public static void main(String[] args) {

        System.out.println(
                "╔═══════════════════════════════════════════════════╗\n"
                        +
                        "║    ███████╗██╗ █████╗ ██╗  ██╗ █████╗ ██████╗     ║\n"
                        +
                        "║    ██╔════╝██║██╔══██╗██║ ██╔╝██╔══██╗██╔══██╗    ║\n"
                        +
                        "║    ███████╗██║███████║█████╔╝ ███████║██║  ██║    ║\n"
                        +
                        "║    ╚════██║██║██╔══██║██╔═██╗ ██╔══██║██║  ██║    ║\n"
                        +
                        "║    ███████║██║██║  ██║██║  ██╗██║  ██║██████╔╝    ║\n"
                        +
                        "║    ╚══════╝╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝     ║\n"
                        +
                        "╚═══════════════════════════════════════════════════╝\n");

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
                        nim = dataLogin[i][1];
                    }

                    user_id = i;
                    System.out.println(user_id);
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
                System.out.println("2. Edit Presensi");
                System.out.println("3. Kirim Pesan");
                System.out.println("4. Edit Biodata");
                System.out.println("5. Edit Jadwal");
                System.out.println("6. Input KRS");
                System.out.println("7. Input UKT");
                System.out.println("9. Ganti akun");
                System.out.println("0. Keluar");

            } else if (isDosen) {
                // Dosen menu
                System.out.println("Beranda " + isRole);
                System.out.println("1. Menghitung nilai");
                System.out.println("2. Input Presensi");
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
                            tampilNilaiSiswa();
                            // System.out.print("Masukkan jumlah mahasiswa : ");
                            int jumlahMahasiswa = bioMahasiswa.length;
                            System.out.print("Masukkan jumlah mata kuliah untuk setiap mahasiswa: ");
                            jumlahMatkul += sc.nextInt();
                            System.out.println(jumlahMatkul);

                            nilaiSiswa = new int[jumlahMahasiswa][jumlahMatkul * 3]; // 3 kolom untuk UAS, UTS, dan
                                                                                     // nilai tugas per mata kuliah

                            for (int i = 0; i < jumlahMahasiswa; i++) {
                                for (int j = 0; j < jumlahMatkul * 3; j += 3) {
                                    System.out.println("Masukkan nilai mahasiswa dengan nama " + bioMahasiswa[i][0]
                                            + " pada mata kuliah ke-" + ((j / 3) + 1) + ":");
                                    System.out.print("Nilai UAS: ");
                                    nilaiSiswa[i][j] = sc.nextInt();
                                    System.out.print("Nilai UTS: ");
                                    nilaiSiswa[i][j + 1] = sc.nextInt();
                                    System.out.print("Nilai tugas: ");
                                    nilaiSiswa[i][j + 2] = sc.nextInt();
                                }
                            }

                            // Lakukan perhitungan IPS menggunakan nilaiSiswa
                            // hitungIPSiswa(nilaiSiswa, bobotMatkul);
                            // ...
                            break;
                        } else if (isRole.equals("Dosen")) {
                            if (nilaiSiswa != null) { // Pastikan nilaiSiswa sudah diinisialisasi oleh Admin sebelumnya
                                tampilNilaiSiswa();
                                double[] bobotMatkul = new double[jumlahMatkul * 3];

                                for (int i = 0; i < jumlahMatkul; i++) {
                                    System.out.println("Masukkan bobot untuk matkul ke-" + (i + 1) + ":");

                                    System.out.print("Bobot UTS: ");
                                    bobotMatkul[i * 3] = sc.nextDouble();

                                    System.out.print("Bobot UAS: ");
                                    bobotMatkul[i * 3 + 1] = sc.nextDouble();

                                    System.out.print("Bobot tugas: ");
                                    bobotMatkul[i * 3 + 2] = sc.nextDouble();
                                }

                                hitungIPSiswa(nilaiSiswa, bobotMatkul);
                            } else {
                                System.out.println("Nilai mahasiswa belum dimasukkan oleh Admin.");
                            }
                            break;
                        } else if (isRole.equals("Mahasiswa")) {
                            bioMahasiswa();
                            break;
                        }

                    case 2:
                        if (isRole.equals("Admin")) {
                            editPresensi();
                            break;
                        } else if (isRole.equals("Dosen")) {
                            inputPresensi();
                            break;
                        } else if (isRole.equals("Mahasiswa")) {
                            jadwalMahasiswa();
                            break;
                        }
                        break;

                    case 3:
                        if (isRole.equals("Admin")) {
                            kirimPesan();
                            break;
                        } else if (isRole.equals("Mahasiswa")) {
                            lihatKRS();
                            break;
                        }
                        break;

                    case 4:
                        if (isRole.equals("Admin")) {
                            bioMahasiswa();
                            break;

                        } else if (isRole.equals("Mahasiswa")) {
                            melihatNilai();
                            break;
                        }

                    case 5:
                        if (isRole.equals("Admin")) {
                            jadwalMahasiswa();
                            System.out.print("Masukkan baris yang akan diedit : ");
                            int baris = sc.nextInt() - 1;
                            System.out.print("Masukkan kolom yang akan diedit : ");
                            int kolom = sc.nextInt() - 1;
                            sc.nextLine();
                            System.out.print("Masukkan perubahan : ");
                            String ubah = sc.nextLine();
                            editJadwal(baris, kolom, ubah);
                            break;

                        }

                    case 6:
                        if (isRole.equals("Admin")) {
                            editKRS();
                            break;
                        } else if (isRole.equals("Mahasiswa")) {
                            tampilPresensi();
                            break;
                        }
                    case 7:
                        if (isRole.equals("Admin")) {
                            inputUKT();
                            break;
                        } else if (isRole.equals("Mahasiswa")) {
                            penerimaPesan(pesan, penerima);
                            break;
                        }

                    case 8:
                        printUKT(dataUKT);
                        break;

                    case 9:
                        gantiAkun();
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

        for (int i = 0; i < nilaiSiswa.length; i++) {
            System.out.println("Masukkan nilai untuk Siswa " + (i + 1) + ":");
            for (int j = 0; j < nilaiSiswa[0].length; j++) {
                System.out.print("Masukkan nilai mata pelajaran ke-" + (j + 1) + ": ");
                nilaiSiswa[i][j] = sc.nextInt();
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

    static void bioMahasiswa() {

        System.out.println(
                "╔═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println(
                "║                                                  BIODATA                                                                          ║");
        System.out.println(
                "╚═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
        System.out.println("");

        System.out.println(
                "╔═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.printf("║ %-2s ║ %-21s ║ %-10s ║ %-11s ║ %-19s ║ %-31s ║ %-15s ║\n", "No", "Nama", "NIM",
                "Jenis Kelamin", "Agama", "TTL", "No HP");
        System.out.println(
                "╚═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");

        for (int i = 0; i < bioMahasiswa.length; i++) {
            System.out.printf("║ %-2s ║ %-21s ║ %-6s ║ %-13s ║ %-19s ║ %-31s ║ %-15s ║\n",
                    i + 1,
                    bioMahasiswa[i][0],
                    bioMahasiswa[i][1],
                    bioMahasiswa[i][2],
                    bioMahasiswa[i][3],
                    bioMahasiswa[i][4],
                    bioMahasiswa[i][5]);
        }

        System.out.println(
                "═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
        if (isRole.equals("Admin")) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Pilih tindakan");
            System.out.println("1. Edit biodata");
            System.out.println("2. Hapus biodata");
            System.out.println("3. Tambah biodata");
            System.out.println("0. Keluar");
            System.out.print("\tPilih menu : => ");
            int menu = sc1.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Masukkan nomor nahasiswa yang ingin diedit : ");
                    int indexEdit = sc1.nextInt() - 1;
                    editBioMahasiswa(indexEdit);
                    break;
                case 2:
                    System.out.print("Masukkan nomor nahasiswa yang ingin dihapus : ");
                    int indexHapus = sc1.nextInt() - 1;
                    hapusElemen(indexHapus);
                    break;
                case 3:
                    tambahBaris();
                    break;
                default:
                    break;
            }
        }
    }

    static void editBioMahasiswa(int index) {

        if (index < 0 || index >= bioMahasiswa.length) {
            System.out.println("Indeks tidak valid.");
            return;
        }

        System.out.println("Masukkan informasi baru untuk mahasiswa:");

        // Menerima input baru untuk setiap data mahasiswa
        System.out.print("Nama: ");
        bioMahasiswa[index][0] = sc.next();

        System.out.print("NIM: ");
        bioMahasiswa[index][1] = sc.next();

        System.out.print("Jenis Kelamin: ");
        bioMahasiswa[index][2] = sc.next();

        System.out.print("Agama: ");
        bioMahasiswa[index][3] = sc.next();

        System.out.print("TTL: ");
        bioMahasiswa[index][4] = sc.next();

        System.out.print("Nomor HP: ");
        bioMahasiswa[index][5] = sc.next();

        System.out.println(
                "╔═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println(
                "║                                                  BIODATA                                                                          ║");
        System.out.println(
                "╚═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
        System.out.println("");

        System.out.println(
                "╔═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.printf("║ %-2s ║ %-21s ║ %-10s ║ %-11s ║ %-19s ║ %-31s ║ %-15s ║\n", "No", "Nama", "NIM",
                "Jenis Kelamin", "Agama", "TTL", "No HP");
        System.out.println(
                "╚═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");

        for (int i = 0; i < bioMahasiswa.length; i++) {
            System.out.printf("║ %-2s ║ %-21s ║ %-6s ║ %-13s ║ %-19s ║ %-31s ║ %-15s ║\n",
                    i + 1,
                    bioMahasiswa[i][0],
                    bioMahasiswa[i][1],
                    bioMahasiswa[i][2],
                    bioMahasiswa[i][3],
                    bioMahasiswa[i][4],
                    bioMahasiswa[i][5]);
        }

        System.out.println(
                "═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");

        System.out.println("Informasi mahasiswa telah diperbarui.");
    }

    static void tampilbiodata() {
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

    }

    static int cariMahasiswa(String[][] dataMahasiswa, String namaMahasiswa) {
        for (int i = 0; i < dataMahasiswa.length; i++) {
            if (dataMahasiswa[i][0].equalsIgnoreCase(namaMahasiswa)) {
                return i;
            }
        }
        return -1;
    }

    static void kirimPesan() {

        boolean validMahasiswa = false;

        while (!validMahasiswa) {
            System.out.println("Masukkan penerima Pesan (Mahasiswa):");
            penerima = sc.nextLine();

            int indeksMahasiswa = cariPesan(dataLogin, penerima);

            if (indeksMahasiswa != -1) {
                System.out.println("Masukkan Pesan untuk " + penerima + ": ");
                pesan = sc.nextLine();

                System.out.println("Pesan Terkirim!");
                validMahasiswa = true;
            } else {
                System.out.println("Mahasiswa tidak ditemukan. Silakan coba lagi.");
            }
        }
    }

    static void penerimaPesan(String pesan, String penerima) {
        System.out.println("Pesan diterima oleh: " + penerima);
        System.out.println("Dari: Admin");
        System.out.println("Isi Pesan: " + pesan);
    }

    static int cariPesan(String[][] data, String mahasiswa) {
        for (int i = 0; i < data.length; i++) {
            if (data[i][2].equalsIgnoreCase("Mahasiswa") && data[i][0].equalsIgnoreCase(mahasiswa)) {
                return i;
            }
        }
        return -1;
    }

    static void melihatNilai() {
        System.out.println("╔══════════════════════════════════════╗\n" +
                "║             NILAI MAHASISWA          ║\n" +
                "╚══════════════════════════════════════╝");

        System.out.println("Rata-rata IP Semua Mahasiswa: " + rataIPSiswa);
    }

    static void inputPresensi() {
        System.out.println(
                "╔══════════════════════════════════════════════════════════╗");
        System.out.println(
                "║                         Presensi                         ║");
        System.out.println(
                "╚══════════════════════════════════════════════════════════╝");
        System.out.println();

        System.out.println("════════════════════════════════════════════════════════════");
        System.out.printf(
                "║ %-2s ║ %-21s ║ %-18s ║ %-6s ║\n", "No", "Nama", "Keterangan Hadir", "Kelas");
        System.out.println("════════════════════════════════════════════════════════════");
        for (int i = 0; i < dataPresensi.length; i++) {
            System.out.printf(
                    "║ %-2s ║ %-21s ║ %-18s ║ %-6s ║\n",
                    i + 1, dataPresensi[i][0], dataPresensi[i][2], dataPresensi[i][1]);

            // Input keterangan kehadiran
            System.out.print("Keterangan kehadiran (Hadir/Tidak): ");
            String keterangan = sc.next();
            dataPresensi[i][2] = keterangan;
        }
    }

    static void tampilPresensi() {
        System.out.println(
                "╔══════════════════════════════════════════════════════════╗");
        System.out.println(
                "║                      Hasil Presensi                      ║");
        System.out.println(
                "╚══════════════════════════════════════════════════════════╝");
        System.out.println();

        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.printf(
                "║ %-2s ║ %-21s ║ %-18s ║ %-6s ║\n", "No", "Nama", "Keterangan Hadir", "Kelas");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        for (int i = 0; i < dataPresensi.length; i++) {
            System.out.println("════════════════════════════════════════════════════════════");
            System.out.printf(
                    "║ %-2s ║ %-21s ║ %-18s ║ %-6s ║\n",
                    i + 1, dataPresensi[i][0], dataPresensi[i][2], dataPresensi[i][1]);
        }
        System.out.println("════════════════════════════════════════════════════════════");
    }

    static void editPresensi() {
        tampilPresensi();
        System.out.println("Ingin mengedit data presensi (Y/N)?");
        String pilihan = sc.next().toUpperCase();

        while (pilihan.equals("Y")) {
            System.out.print("Masukkan nomor presensi yang ingin diedit (1-" + dataPresensi.length + "): ");
            int nomorPresensi = sc.nextInt() - 1;

            if (nomorPresensi >= 0 && nomorPresensi < dataPresensi.length) {
                System.out.print("Masukkan keterangan baru (Hadir/Tidak): ");
                String keteranganBaru = sc.next();

                if (keteranganBaru.equalsIgnoreCase("Tidak Hadir")) {
                    keteranganBaru = "Tidak Hadir";
                }

                dataPresensi[nomorPresensi][2] = keteranganBaru;
                System.out.println("Data presensi berhasil diedit.");

                tampilPresensi();

                System.out.println("Ingin mengedit data lain (Y/N)?");
                pilihan = sc.next().toUpperCase();
            } else {
                System.out.println("Nomor presensi tidak valid. Silakan coba lagi.");
            }
        }

        System.out.println("Selesai edit data presensi.");
    }

    static void jadwalMahasiswa() {
        System.out.println("\t\t\t\t      ╔══════════════════════════════════════╗\n" +
                "\t\t\t\t      ║             JADWAL KULIAH            ║\n" +
                "\t\t\t\t      ╚══════════════════════════════════════╝");

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

    static void lihatKRS() {
        System.out.println("╔═════════════════════════════════════════════╗");
        System.out.println("║ Matkul           ║  Semester  ║  SKS  ║ Jam ║");
        System.out.println("╚═════════════════════════════════════════════╝");

        for (String[] data : matkulData) {
            System.out.printf("║ %-16s ║ %-8s ║ %-5s ║ %-3s ║\n", data[0], "\t  " + data[1], "  " + data[2],
                    " " + data[3]);
            System.out.println("═══════════════════════════════════════════════");
        }
    }

    static void editKRS() {
        boolean continueEditing = true;

        while (continueEditing) {
            System.out.println("╔═════════════════════════════════════════════╗");
            System.out.println("║ Matkul           ║  Semester  ║  SKS  ║ Jam ║");
            System.out.println("╚═════════════════════════════════════════════╝");

            for (String[] data : matkulData) {
                System.out.printf("║ %-16s ║ %-8s ║ %-5s ║ %-3s ║\n", data[0], "\t  " + data[1], "  " + data[2],
                        " " + data[3]);
                System.out.println("═══════════════════════════════════════════════");
            }

            Scanner sc2 = new Scanner(System.in);
            if (isRole.equals("Admin")) {
                System.out.print("Masukkan data KRS yang ingin diedit (Nomor) : ");
                int index = sc2.nextInt() - 1;
                inputKRS(index);

                System.out.print("Apakah Anda ingin melanjutkan mengedit data KRS? (Y/N): ");
                String choice = sc2.next();
                if (choice.equalsIgnoreCase("N")) {
                    continueEditing = false;
                }
            }
        }
    }

    static void inputKRS(int index) {
        Scanner sc = new Scanner(System.in);
        if (index < 0 || index >= matkulData.length) {
            System.out.println("Indeks tidak valid.");
            return;
        }

        System.out.println("Masukkan informasi baru untuk mahasiswa:");

        System.out.println("Matkul ke-" + (index + 1) + ":");
        matkulData[index][0] = sc.nextLine();
        System.out.println("Semester:");
        matkulData[index][1] = sc.nextLine();
        System.out.println("SKS:");
        matkulData[index][2] = sc.nextLine();
        System.out.println("Jam:");
        matkulData[index][3] = sc.nextLine();

        System.out.println("╔═════════════════════════════════════════════╗");
        System.out.println("║ Matkul           ║  Semester  ║  SKS  ║ Jam ║");
        System.out.println("╚═════════════════════════════════════════════╝");
        for (String[] data : matkulData) {
            System.out.printf("║ %-16s ║ %-10s ║ %-5s ║ %-3s ║\n", data[0], data[1], data[2], data[3]);
            System.out.println("═══════════════════════════════════════════════");
        }

        System.out.println(
                "════════════════════════════════════════════════════════════════════════");
        System.out.println("Informasi KRS telah diperbarui.");
    }

    static int caridataKRS(String[][] dataKRS, String namaMatkul) {
        for (int i = 0; i < dataKRS.length; i++) {
            if (dataKRS[i][0].equalsIgnoreCase(namaMatkul)) {
                return i;
            }
        }
        return -1;
    }

    static void inputUKT() {

        for (int i = 0; i < dataUKT.length; i++) {
            System.out.println("No. " + (i + 1));
            System.out.print("Tahun Akademik: ");
            dataUKT[i][1] = sc.nextLine();
            System.out.print("Keterangan: ");
            dataUKT[i][2] = sc.nextLine();
            System.out.print("Tagihan: ");
            dataUKT[i][3] = sc.nextLine();
            System.out.print("Terbayar: ");
            dataUKT[i][4] = sc.nextLine();
            System.out.print("Status: ");
            dataUKT[i][5] = sc.nextLine();
        }
    }

    static void printUKT(String[][] dataUKT) {
        System.out.println("╔════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║ NO | TAHUN AKADEMIK | KETERANGAN |     TAGIHAN     |     TERBAYAR     | STATUS ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════════════════╝");

        for (String[] data : dataUKT) {
            System.out.printf("║ %-2s | %-14s | %-10s | %-15s | Rp. %-12s | %-6s ║\n",
                    "1", data[1], data[2], data[3], data[4], data[5]);
            System.out.println("══════════════════════════════════════════════════════════════════════════════════");
        }
    }

    static void gantiAkun() {
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
    }
}