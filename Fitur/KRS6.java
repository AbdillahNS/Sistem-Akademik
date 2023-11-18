public class KRS6 {
    public static void main(String[] args) {

        System.out.println("    ╔══════════════════════════════════════╗\n"+
                           "    ║      Kartu Rencana Studi  (KRS)      ║\n"+
                           "    ╚══════════════════════════════════════╝");
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

        System.out.println("╔═════════════════════════════════════════════╗");
        System.out.println("║ Matkul           ║  Semester  ║  SKS  ║ Jam ║");
        System.out.println("╚═════════════════════════════════════════════╝");
        for (String[] data : matkulData) {
            System.out.printf("║ %-16s ║ %-8s ║ %-5s ║ %-3s ║\n", data[0], "\t  " + data[1], "  " + data[2], " " + data[3]);
            System.out.println("═══════════════════════════════════════════════");
        }
    }
}