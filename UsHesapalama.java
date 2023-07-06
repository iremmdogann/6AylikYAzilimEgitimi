import java.util.Scanner;

public class UsHesapalama {
    public static void main(String[] args) {

        int a,b,us=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Üs almak istediğiniz sayıyı giriniz: ");
        a= scan.nextInt();
        System.out.print("Üssünü giriniz: ");
        b = scan.nextInt();

        for(int i=1;i<=b;i++){
            us*=a;
        }
        System.out.println("üs işleminin sonucu: "+us);
    }
}