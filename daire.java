import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r,a;
        double pi=3.14,alan,cevre,dilim;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");
        r=input.nextInt();
        System.out.print("Merkez açının ölçsünü giriniz:");
        a= input.nextInt();

        alan=pi*(r*r);
        cevre=2*pi*r;
        dilim=(pi * (r*r) *a) / 360;
        System.out.print("Dairenin alanı:" +alan+"\n");
        System.out.print("Dairenin Çevresi:"+cevre+"\n");
        System.out.println("Merkez açısı girilen daire diliminin alanı: "+dilim);


    }
}