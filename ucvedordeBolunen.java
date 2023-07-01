import java.util.Scanner;

public class ucvedordeBolunen {
    public static void main(String[] args) {
        int b;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        b= input.nextInt();

        for (int i=0;i<=b;i++){
            if(i%12==0) {
                System.out.println(i);
            }


        }
    }
}