import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double pear,apple,tmt,bnn,abg,total;
        Scanner input =new Scanner(System.in);
        System.out.print("How many kg of pears? ");
        pear= input.nextDouble();
        System.out.print("How many kg of apples? ");
        apple= input.nextDouble();
        System.out.print("How many kg of tomato? ");
        tmt= input.nextDouble();
        System.out.print("How many kg of bananas? ");
        bnn= input.nextDouble();
        System.out.print("How many kg of aubergines? ");
        abg= input.nextDouble();

            total= (pear*2.14) + (apple*3.67) + (tmt*1.11) + (bnn*0.95) + (abg*5);
        System.out.print("Total amount : " +total);
    }
}