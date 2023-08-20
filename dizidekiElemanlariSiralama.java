import java.util.Scanner;
import java.util.Arrays;
public class dizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Sorting the array in ascending order
        Arrays.sort(array);

        System.out.println("Sorted array:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        scanner.close();
    }
}