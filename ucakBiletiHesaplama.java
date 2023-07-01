import java.util.Scanner;

public class ucakBiletiHesaplama {
    public static void main(String[] args) {
        int km,yas,yolT;
        double tutar,indirim;

        Scanner input = new Scanner(System.in);
        System.out.println("YAşınızı giriniz: ");
        yas = input.nextInt();
        System.out.println("mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();
        System.out.println("Yolculuk tipini giriniz\n1=> Tek Yön\n2=> Gidiş Dönüş");
        yolT= input.nextInt();

        tutar= km*0.10;

        if (km>0 && yas>0 && yolT<=2 ){
            if (yas<=12){
                indirim=tutar*0.50;
                tutar=tutar-indirim;

                switch (yolT){
                    case 1:
                        System.out.println("Ücretiniz: "+tutar);
                        break;
                    case 2:
                        indirim= tutar*0.20;
                        tutar =(tutar-indirim)*2;
                        System.out.println("İndirimli fiyat: "+tutar);
                        break;
            }
            } else if (yas>12 && yas<=24) {
                indirim=tutar*0.10;
                tutar=tutar-indirim;

                switch (yolT){
                    case 1:
                        System.out.println("Ücretiniz: "+tutar);
                        break;
                    case 2:
                        indirim= tutar*0.20;
                        tutar =(tutar-indirim)*2;
                        System.out.println("İndirimli fiyat: "+tutar);
                        break;
                }

            } else if (yas>=65) {
                indirim=tutar*0.30;
                tutar=tutar-indirim;

                switch (yolT){
                    case 1:
                        System.out.println("Ücretiniz: "+tutar);
                        break;
                    case 2:
                        indirim= tutar*0.20;
                        tutar =(tutar-indirim)*2;
                        System.out.println("İndirimli fiyat: "+tutar);
                        break;
                }


            }
        }else System.out.println("Hatalı veri gridiniz");

    }
}