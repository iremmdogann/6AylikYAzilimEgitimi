import java.util.Scanner;

public class recersiveAsalKontrol {
    public static void main(String[] args)
    {
        int number ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Kontrol etmek istediğiniz sayıyı giriniz: ");
        number= scan.nextInt();

        boolean isPrime = isPrimeNumber(number, 2);




        if (isPrime) {
            System.out.println(number + " bir asal sayıdır.");
        }

        else {
            System.out.println(number +

                            " bir asal sayı değildir.");
        }
    }




public static boolean isPrimeNumber(int num, int divisor) {
        if (num <= 2) {
        return num == 2;
        }
        if (num % divisor == 0) {
        return false;
        }
        if (divisor * divisor > num) {
        return true;
        }
        return isPrimeNumber(num, divisor + 1);
        }
        }








