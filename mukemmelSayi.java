import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        int a,sayi=0;
        Scanner scan= new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        a=scan.nextInt();

        for (int i=1;i<a;i++){

            if (a%i==0){
              sayi+=i;
            }
        }
        if (a==sayi){
            System.out.println(a+" Mükemmel sayıdır ");
        }else{
            System.out.println(a+" Mükemmel sayı değildir");
        }

    }
}