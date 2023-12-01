//import fibonaccidongu.fibonacci;
import java.util.Scanner;
public class Main {

    public static void main(String [  ]  args) {
       //fibonacci fibonacci = new fibonacci();
        // Fibonacci : 1  1 ile başlıyor 1 1 2 3 5 8 13 21.....
        // a b c
        //     a b c
        //         a b c

      /* int a = 1;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);

        for( int  i  = 0;   i<100  ;  i++){
            c = a + b;   //kaydırıyoruz çünkü bir sonrakiyle toplayacağız
            a = b;
            b = c;
            System.out.println(c);
        } */

       //FOR DONGUSU
      /*  int i = 0;

        for (int j = 0; j < 5;   m++) {
            System.out.println("i: " + i + ", m: " + m);
            i++;
        }
        for (int k = 0; k < 5; m++) {
                ++i;
                System.out.println("i: " + i + ", m: " + m);
        }*/

       /* System.out.println("Min value: "  +  Byte.MIN_VALUE + "Max value: "  + Byte.MAX_VALUE);      //byte
        System.out.println("Min value: "  +  Short.MIN_VALUE + "Max value: "  + Short.MAX_VALUE);  //short
        System.out.println("Min value: "  +   Integer.MIN_VALUE + "Max value: "  + Integer.MAX_VALUE);   //integer
        System.out.println("Min value: "  +   Long.MIN_VALUE + "Max value: "  +  Long.MAX_VALUE);  //long
        System.out.println("Min value: "  +   Float.MIN_VALUE + "Max value: "  +   Float.MAX_VALUE);   //float
        System.out.println("Min value: "  +   Double.MIN_VALUE + "Max value: "  +   Double.MAX_VALUE);   //double
        System.out.println("Min value: "  +   (int)  Character.MIN_VALUE + "Max value: "  +   (int)  Character.MAX_VALUE);    //character   Unicode                 tablosundaki karşılığı
        System.out.println("\nboolean:");     // boolean veri tipi  sadece true ve  false alır, min ve max değeri yoktur.  */




        // 3 sayının ortalaması
        Scanner scan = new Scanner(System.in);
       int sayi, toplam = 0;

        System.out.print("Girmek istediğiniz sayı adedini giriniz: ");
        int adet = scan.nextInt();

        for(int i = 0; i < adet; i++)
        {
            System.out.print((i + 1) + ". sayiyi giriniz: ");
            sayi = scan.nextInt();
            toplam += sayi;
        }
        System.out.println("Sayıların ortalaması = " + ((float)toplam / adet));



        // Vize ve Final notlarının ortalamasıyla 50 üstünü geçti mi?
        System.out.print("Vize notunuzu giriniz: ");
        int vize = scan.nextInt();
        System.out.print("Final notunu giriniz: ");
        int fnal = scan.nextInt();

        double not = (vize * 0.4) + (fnal * 0.6);

        System.out.println("Yıl sonu notunuz = " + not);

        if(not > 50) {
            System.out.println("Dersi geçtiniz.");
        }
        else if(not < 50) {
            System.out.println("Dersten kaldınız.");
        }
    }
}