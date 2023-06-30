import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int fizik,kimya,mat,tarih,muzik,turkce;
        Scanner giris= new Scanner(System.in);

        System.out.println("Notlarınızı sırayla giriniz");

             fizik= giris.nextInt();
             kimya= giris.nextInt();
             mat= giris.nextInt();
             tarih= giris.nextInt();
             muzik= giris.nextInt();
             turkce= giris.nextInt();


         int toplam =(fizik+kimya+mat+tarih+turkce+muzik);
         double sonuc =toplam/6;

        System.out.println(sonuc);


    }
}