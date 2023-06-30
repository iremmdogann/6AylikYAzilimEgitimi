import java.util.Scanner;
public class havaEtkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner input= new Scanner(System.in);
        System.out.print("Sıcaklığı giriniz: ");
        heat= input.nextInt();

        if(heat<5) System.out.println("kayak");
        else if (heat<=15 && heat>=5) System.out.println("sinema");
        else if (heat<=25 && heat>=16) System.out.println("piknik");
        else if (heat>=26) System.out.println("yüzme");




    }
}