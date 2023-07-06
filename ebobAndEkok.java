import java.util.Scanner;

public class ebobAndEkok {
    public static void main(String[] args) {
        int x,y,sayac1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ebobunu almak istediğiniz sayıları giriniz:");
        x= scan.nextInt();
        y =scan.nextInt();
         int ebob=1;
         int ekok=1;

        for(int i=1;i<=x;i++){
            if((x%i)==0&& (y%i)==0){
                ebob=i;
            }
        }
        System.out.println(ebob);
        ekok=(x*y)/ebob;
        System.out.println(ekok);
       }

    }
