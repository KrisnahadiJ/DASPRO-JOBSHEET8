import java.util.Scanner;

public class NamaAtlet11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] cabangOlahraga = {"Bulutangkis", "Tenis Meja", "Basket", "Bola Voli"};
        String[][] atlet = new String[cabangOlahraga.length][5];
        
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("Masukkan nama 5 atlet untuk cabang " + cabangOlahraga[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Atlet " + (j + 1) + ": ");
                atlet[i][j] = sc.nextLine();
            }
            System.out.println();
        }
        System.out.println("Daftar Atlet Terdaftar:");
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("Atlet " + cabangOlahraga[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println("- " + atlet[i][j]);
            }
            System.out.println();
        }
    }
}