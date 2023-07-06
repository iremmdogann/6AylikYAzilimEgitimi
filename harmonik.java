import java.util.Scanner;

public class harmonik {
    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Hesaplamak istediğiniz N sayısını giriniz: ");
        n = scan.nextInt();
        double total=0;
        for(double i=1;i<=n;i++){
            total+=(1/i);
        }
        System.out.println(total);
    }
}