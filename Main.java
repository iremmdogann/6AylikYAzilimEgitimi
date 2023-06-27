import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar,kdvOran =0.18 ,kdvLi,kdv;
        System.out.print("tutarı griniz:");
        Scanner giris = new Scanner(System.in);
        tutar = giris.nextDouble();

        kdv=tutar*kdvOran;
        kdvLi=kdv+tutar;

        System.out.println("KDV'siz tutar:" +tutar );
        System.out.println("KDV oran :" +kdvOran);
        System.out.println("KDV:"+kdv);
        System.out.println("KDV'li tutar: " + kdvLi);

    }
}