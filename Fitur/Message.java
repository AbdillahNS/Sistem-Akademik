import java.util.Scanner;
public class Message {
    private static Scanner sc = new Scanner(System.in);
    public static String penerimaPesan() {
        System.out.println("Tuliskan Nama penerima pesan: ");
        return sc.nextLine();
    }
    public static String isiPesan() {
        System.out.println("Tuliskan pesan: ");
        return sc.nextLine();
    }
    public static void Message() {
        String nama = penerimaPesan();
        String pesan = isiPesan();
        System.out.println("╔═════════════════════════════════════╗\n"+
                           "║               Message               ║\n"+
                           "╚═════════════════════════════════════╝");
        System.out.println("Dari: Admin");
        System.out.println("Kepada: " + nama);
        System.out.println("Isi Pesan: \n" + pesan);
    }
    public static void main(String[] args) {
        Message();
    }
}