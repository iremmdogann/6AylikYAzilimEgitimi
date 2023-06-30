import java.util.Scanner;
public class hesapMakinasi {
    public static void main(String[] args) {
        int nmb1,nmb2,select;
        Scanner input =new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        nmb1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        nmb2 = input.nextInt();

        System.out.print("Yapmak istediğiniz işlemin yanındaki numarayı giriniz:\n" +
                " Toplama(1)\n Çıkarma(2)\n Çarpma(3)\n Bölme(4)\n   ");
        select= input.nextInt();
        switch (select){
            case 1:
                System.out.println("İşlemin sonucu: "+ (nmb1+nmb2));
                break;
            case 2:
                System.out.println("İşlemin sonucu: "+ (nmb1-nmb2));
                break;
            case 3:
                System.out.println("İşlemin sonucu: "+ (nmb1*nmb2));
                break;
            case 4:
                System.out.println("İşlemin sonucu: "+ (nmb1/nmb2));
                break;
            default:
                System.out.println("1-4 arasında bir sayı giriniz!");
                break;
        }

    }
}