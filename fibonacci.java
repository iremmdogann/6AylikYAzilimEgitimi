public class fibonacci {
    public static void main(String[] args) {
        int a=1,b=1,c=2;
        for (int i=1;i<7;i++){
           c=a+b;
            System.out.print("\n"+a+"\t"+b+"\t"+c+"\t");
            a=b;
            b=c;

        }

    }
}