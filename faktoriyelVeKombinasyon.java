import java.util.Scanner;

public class faktoriyelVeKombinasyon {
    public static void main(String[] args) {
        int n,fakt1=1,komb=1,r,fakt2=1,fark=1;
        Scanner scan = new Scanner(System.in);

        //faktöriyel kodu
        System.out.print("Faktöriyelini alamk istediğiniz sayıyı giriniz: ");
        n = scan.nextInt();
         for (int i=1;i<=n;i++){
             fakt1=fakt1*i;
         }System.out.print(n+"'in faktöriyeli: "+fakt1);
         System.out.println("\n");


         //kombinasyon kodu  C(n,r) = n! / (r! * (n-r)!)
        System.out.print("r sayısını girirniz:");
        r= scan.nextInt();
        for(int j=1;j<=r;j++){
            fakt2=fakt2*j;
        }
        for(int k=1;k<=n-r;k++){
            fark=fark*k;
        }
        komb=fakt1/(fakt2*fark);

        System.out.println(" kombinasyon: "+komb);
    }
}