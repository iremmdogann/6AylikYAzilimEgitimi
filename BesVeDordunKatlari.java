import java.util.Scanner;

public class BesVeDordunKatlari {
    public static void main(String[] args) {
        int k;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        k= scan.nextInt();
        for (int i=1;i<=k;i*=4){
            System.out.println(i);
        }
        for (int j=1;j<=k;j*=5){
            System.out.println(j);
        }
    }
}