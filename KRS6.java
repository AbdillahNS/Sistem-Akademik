import java.util.*;
public class KRS6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matkul = {"Pancasila", "KTI", "CTPS", "Matdas", "B ing", "Daspro", "Praktikum Daspro", "K3"};
        int[] semester = {1, 1, 1, 1, 1, 1, 1, 1};
        int[] sks = {2, 2, 2, 3, 2, 2, 3, 2};
        int[] jam = {2, 4, 4, 6, 4, 4, 6, 4};

        System.out.println("-----------------------------------------------");
        System.out.println("| Matkul          |   Semester  |  SKS  | Jam |");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-18s%-11s%-7s%-4s\n", "| " + matkul[i], "|      " + semester[i],"   |   " + sks[i], "   |  " + jam[i] + "  |");
            System.out.println("-----------------------------------------------");
        }
    }
}