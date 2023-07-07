import java.util.Scanner;

public class zodyakHesaplama {
    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        year= scan.nextInt();

        if(year%12==0){
            System.out.println("Çin Zodyağı burcunuz Maymun ");
        }else if (year%12==1){
            System.out.println("Çin Zodyağı burcunuz Horoz ");
        }else if (year%12==2){
            System.out.println("Çin Zodyağı burcunuz Köpek ");
        }else if (year%12==3){
            System.out.println("Çin Zodyağı burcunuz Domuz ");
        }else if (year%12==4){
            System.out.println("Çin Zodyağı burcunuz Fare ");
        }else if (year%12==5){
            System.out.println("Çin Zodyağı burcunuz Öküz ");
        }else if (year%12==6){
            System.out.println("Çin Zodyağı burcunuz KAplan ");
        }else if (year%12==7){
            System.out.println("Çin Zodyağı burcunuz TAvşan ");
        }else if (year%12==8){
            System.out.println("Çin Zodyağı burcunuz Ejderha ");
        }else if (year%12==9){
            System.out.println("Çin Zodyağı burcunuz Yılan ");
        }else if (year%12==10){
            System.out.println("Çin Zodyağı burcunuz At ");
        }else if (year%12==11){
            System.out.println("Çin Zodyağı burcunuz Koyun ");
        }
    }
}