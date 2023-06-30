import java.util.Scanner;

public class kullaniciGiris {
    public static void main(String[] args) {
        String userName,password,newPas;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName= input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password= input.nextLine();

        if(userName.equals("irem") && password.equals("123") ){
            System.out.println("Giriş yaptınız ");
        }else{
            System.out.println("Şifeniz yanlış!!Yeni şifre oluşturmak için şifenizi giriniz");
            }
              newPas= input.nextLine();
              if (newPas.equals(password)){
                  System.out.println("Şifre oluşturuldu");

               }else System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");




    }
}