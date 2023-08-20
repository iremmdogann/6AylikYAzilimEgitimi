import java.util.Scanner;
public class enyakinsayi {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int target = scanner.nextInt();

        int closestSmaller = Integer.MIN_VALUE;
        int closestLarger = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < target && i > closestSmaller) {
                closestSmaller = i;
            }
            if (i > target && i < closestLarger) {
                closestLarger = i;
            }
        }

        if (closestSmaller != Integer.MIN_VALUE) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        } else {
            System.out.println("Girilen sayıdan küçük bir değer bulunamadı.");
        }

        if (closestLarger != Integer.MAX_VALUE) {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);
        } else {
            System.out.println("Girilen sayıdan büyük bir değer bulunamadı.");
        }
    }
}