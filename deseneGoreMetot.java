import java.util.Scanner;

public class deseneGoreMetot {


    public static void main(String[] args) {
        desen();

    }

    static void desen(){
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        num = scan.nextInt();
        int num1=num;

        for (int i=num;i>0;i-=5){
           num1-=5;
            System.out.println(num1);

        }
        int num2=num1;
        for (int i=num2;i<num;i+=5){
            num2+=5;
            System.out.println(num2);
        }
    }
     }

