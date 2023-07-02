import java.util.Scanner;

public class DordunKatlariToplami {
    public static void main(String[] args) {
        int k;
        int total=0;
        Scanner input =new Scanner(System.in);

        do {
            System.out.print("Bir sayı giriniz: ");
            k= input.nextInt();

            if (k%2==1){

            }else {
                total=total+k;
            }
        }while (k%4==0);

            System.out.println("Çift sayı ve dördün katı olan sayıların toplamı: "+total);
            System.out.println(k);

        }
    }
