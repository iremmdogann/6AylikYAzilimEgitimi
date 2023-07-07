import java.util.Scanner;

public class enBuyukVeEnKucuk {
    public static void main(String[] args) {
        int a, max=0, min=0;
        Scanner scan= new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        a= scan.nextInt();

         for (int i =1;i<=a;i++){
             System.out.println(i+".sayıyı giriniz");
             int sayi= scan.nextInt();

             if(i==1){
                 max=sayi;
                 min=sayi;
             }
             if (sayi>max){
                 max=sayi;
             }
             if (sayi<min){
                 min=sayi;
             }
         }
        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);


    }
}