public class JadwalKuliah {
    public static void main(String[] args) {

        System.out.println("\t\t\t\t\t=============================");
        System.out.println("\t\t\t\t\t\tJADWAL KULIAH");
        System.out.println("\t\t\t\t\t=============================");
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
    }
}