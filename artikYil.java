import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        int year;
        Scanner scan= new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        year= scan.nextInt();

        if(year%4==0 || year%400==0){
            System.out.println(year+" artık bir yıldır");
        }else {
            System.out.println(year+"artık bir yıl değildir");
        }

    }
}