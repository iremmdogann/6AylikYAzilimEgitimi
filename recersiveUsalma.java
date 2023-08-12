import java.util.Scanner;

public class recersiveUsalma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(

                "Tabanı giriniz: ");
        int taban = scanner.nextInt();

        System.out.print(


                "Üssü giriniz: ");
        int us = scanner.nextInt();

        int sonuc = usAl(taban, us);
        System.out.println("Sonuç: " + sonuc);
    }
    public static int usAl(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            return taban * usAl(taban, us - 1);
        }


}
}



