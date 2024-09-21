import java.util.Scanner;

public class Sıralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, c;

        System.out.print("1.SAYIYI GİRİNİZ:");
        a = inp.nextInt();
        System.out.print("2.SAYIYI GİRİNİZ:");
        b = inp.nextInt();
        System.out.print("3.SAYIYI GİRİNİZ:");
        c = inp.nextInt();

        if ((a>b)&&(a>c)) {
           if (b>c) {
               System.out.print("A>B>C");
           } else {
               System.out.print("A>C>B");
           }

        } else if ((b>a)&&(b>c)) {
            if (a>c){
                System.out.print("B>A>C");
            }else {
                System.out.print("B>C>A");
            }

            } else if ((c>a)&&(c>b)) {
            if (a<b){
                System.out.print("C>A>B");
            }else {
                System.out.print("C>B>A");
            }

        }


    }
}

