import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int kg;
        double indeks;
        float boy;
        Scanner input =new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = input.nextInt();
        System.out.print("Kilonuzu giriniz: ");
        kg= input.nextInt();

        indeks =kg/(boy*boy);
        System.out.println("Vücut kitle indeksiniz: "+indeks);


    }
}